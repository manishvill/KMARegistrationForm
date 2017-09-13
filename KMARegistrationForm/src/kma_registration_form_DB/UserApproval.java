package kma_registration_form_DB;

import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kma.constants.Messages;
import com.kma.services.ConnectingMySqlDB;

/**
 * Servlet implementation class UserApproval
 */
@WebServlet("/UserApproval")
public class UserApproval extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserApproval() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String data = "Hello";
//		response.setContentType("text/plain");
//		response.setCharacterEncoding("ISO-8859-1");
//		response.getWriter().write(data);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//-----------------USER APPROVAL--------------------------------------------------------
		int flag = 0;
		String action = request.getParameter("action");
		String regid = request.getParameter("regid");
		System.out.println("regid "+regid);
		System.out.println("action "+action);
		
		if(action.equals("add")) {
			System.out.println("adding");
			Map<String, Object> map_user = new HashMap<String, Object>();
			Map<String, Object> map_pd = new HashMap<String, Object>();
			ConnectingMySqlDB obj = ConnectingMySqlDB.getConnectingMySqlDB();
			Connection conn = obj.getConnected();
			if(conn==null){
				System.out.println("No Connection to DB");
			}else{
				try{
					String QUERY = "select * from registration_list where regid = \"" + regid + "\";";
					ResultSet stmt = conn.createStatement().executeQuery(QUERY);
					while(stmt.next()){
						map_user.put("regid", stmt.getString("regid"));
						map_user.put("name", stmt.getString("name"));
						map_user.put("dob", stmt.getString("dob"));
						map_user.put("gender", stmt.getString("gender"));
						map_user.put("personal_emailid", stmt.getString("personal_emailid"));
						map_user.put("company_emailid", stmt.getString("company_emailid"));
						map_user.put("contact_number", stmt.getString("contact_number"));
						map_user.put("whatsapp_number", stmt.getString("whatsapp_number"));
						map_user.put("options", stmt.getString("options"));
						map_user.put("pp_photo", stmt.getBlob("pp_photo"));
					}
						
					System.out.println("map_user "+map_user);
					
					QUERY = "select * from payment_details where regid = \"" + regid + "\";";
					stmt = conn.createStatement().executeQuery(QUERY);
					while(stmt.next()){
						map_pd.put("payment_id", stmt.getInt("payment_id"));
						map_pd.put("regid", stmt.getString("regid"));
						map_pd.put("payment_mode", stmt.getString("payment_mode"));
						map_pd.put("recipt_no", stmt.getString("recipt_no"));
						map_pd.put("transaction_no", stmt.getString("transaction_no"));
						map_pd.put("chqDDno", stmt.getString("chqDDno"));
						map_pd.put("amount_paid", stmt.getString("amount_paid"));
						map_pd.put("amount_bal", stmt.getString("amount_bal"));
					}
					conn.close();	
					System.out.println("map_pd "+map_pd);
					
				}catch(SQLException e){
					//e.printStackTrace();	
					System.out.println(e);
				}
			}
			
			String QUERY_INSERT = "INSERT INTO REGISTERED_USER(regid, name, dob, personal_emailid, "
					+ "company_emailid, contact_number, whatsapp_number, options, pp_photo, gender)"
					+ "VALUES(?,?,?,?,?,?,?,?,?,?)";
			obj = ConnectingMySqlDB.getConnectingMySqlDB();
			conn = obj.getConnected();
			if(conn == null){
				System.out.println("No Connection to DB");
			}else{
				try {
					PreparedStatement preparedstmt = conn.prepareStatement(QUERY_INSERT);
					
					preparedstmt.setString(1, (String) map_user.get("regid"));
					preparedstmt.setString(2, (String) map_user.get("name"));
					preparedstmt.setString(3, (String) map_user.get("dob"));
					preparedstmt.setString(4, (String) map_user.get("personal_emailid"));
					preparedstmt.setString(5, (String) map_user.get("company_emailid"));
					preparedstmt.setString(6, (String) map_user.get("contact_number"));
					preparedstmt.setString(7, (String) map_user.get("whatsapp_number"));
					preparedstmt.setString(8, (String) map_user.get("options"));
					preparedstmt.setBlob(9, (Blob) map_user.get("pp_photo"));
					preparedstmt.setString(10, (String) map_user.get("gender"));
					
					preparedstmt.executeUpdate();
					
					flag = 1;
					System.out.println(Messages.success());
					
					QUERY_INSERT = "INSERT INTO registered_user_pd"
							+ "(payment_id, regid, payment_mode, recipt_no, transaction_no, chqDDno, amount_paid, amount_bal)"
							+ "VALUES(?,?,?,?,?,?,?,?)";
					
					preparedstmt = conn.prepareStatement(QUERY_INSERT);
					preparedstmt.setInt(1, (int) map_pd.get("payment_id"));
					preparedstmt.setString(2, (String) map_pd.get("regid"));
					preparedstmt.setString(3, (String) map_pd.get("payment_mode"));
					preparedstmt.setString(4, (String) map_pd.get("recipt_no"));
					preparedstmt.setString(5, (String) map_pd.get("transaction_no"));
					preparedstmt.setString(6, (String) map_pd.get("chqDDno"));
					preparedstmt.setString(7, (String) map_pd.get("amount_paid"));
					preparedstmt.setString(8, (String) map_pd.get("amount_bal"));
					
					preparedstmt.executeUpdate();
					
					System.out.println("payment " + Messages.success());
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					//System.out.println("PROBLEM IN userinputdb.JAVA");
					//redirect page to enterd value by use
					//e.printStackTrace();
					e.getErrorCode();
					System.out.println(e);
					//System.out.println(Messages.invalidDBEntry());
				}
			}
			//------------------END USER APPROVAL------------------------------------------------------
			
			//---------------------Delete From TEMP LIST-----------------------------------------------
			if(flag == 1){
				obj = ConnectingMySqlDB.getConnectingMySqlDB();
				conn = obj.getConnected();
				if(conn == null){
					System.out.println("No Connection to DB");
				}else{
						String QUERY_REGID = "DELETE FROM registration_list where regid = \""+regid+"\";";
						try {
							PreparedStatement delete_user = conn.prepareStatement(QUERY_REGID);
							delete_user.executeUpdate();
							conn.close();
						}catch (SQLException e) {
								e.printStackTrace();
						}
				}
			}
		}
		
		if(action.equals("delete")){
			System.out.println(action);
			ConnectingMySqlDB obj = ConnectingMySqlDB.getConnectingMySqlDB();
			Connection conn = obj.getConnected();
			if(conn == null){
				System.out.println("No Connection to DB");
			}else{
					String QUERY_REGID = "DELETE FROM registration_list where regid = \"" + regid + "\";";
					System.out.println(QUERY_REGID);
					try {
						PreparedStatement delete_user = conn.prepareStatement(QUERY_REGID);
						delete_user.executeUpdate();
						conn.close();
					}catch (SQLException e) {
							e.printStackTrace();
					}
			}
		}
	}
}
