package kma_registration_form_DB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kma.services.ConnectingMySqlDB;

/**
 * Servlet implementation class AuthenticateUser
 */
@WebServlet(description = "loginForm", urlPatterns = { "/AuthenticateUser" })
public class AuthenticateUser extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		String user_DB  = "";
		String pass_DB  = "";
		String QUERY_USER = "select * from userdetails where username=\"" + user + "\" && " + "password=\""+pass+"\";";
		System.out.println(QUERY_USER);
		ConnectingMySqlDB obj = ConnectingMySqlDB.getConnectingMySqlDB();
		Connection connect = obj.getConnected();
		if(connect==null){
			System.out.println("No Connection to DB");
		}else{
			try {
				
				Statement regidstmt = connect.createStatement();
				ResultSet result = regidstmt.executeQuery(QUERY_USER);
				
				while(result.next()){
					user_DB = result.getString("username");
					pass_DB = result.getString("password");
				}
				
				if(user.equals(user_DB) && pass.equals(pass_DB)){
					response.sendRedirect("userList.jsp");
					request.getSession().setAttribute("authorized","yes");
				}else{
					response.sendRedirect("admin.jsp");
					request.removeAttribute("login");
					request.getSession().setAttribute("invalid","Username or Password is Invalid");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				response.sendRedirect("admin.jsp");
				request.getSession().setAttribute("invalid","Connection Problem!! Try Again");
				System.out.println(e.getMessage());
				
			}
		}
	}

}
