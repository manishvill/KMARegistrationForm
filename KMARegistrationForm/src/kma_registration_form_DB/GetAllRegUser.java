package kma_registration_form_DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.kma.services.ConnectingMySqlDB;

public class GetAllRegUser {
	
	public Map<String, ArrayList<Object>> getUsers() {
		Map<String, ArrayList<Object>> map = new HashMap<String, ArrayList<Object>>();
		String QUERY = "SELECT * FROM registered_user;";
		
		ArrayList<Object> regid = new ArrayList<Object>();
		ArrayList<Object> name = new ArrayList<Object>();
		ArrayList<Object> dob = new ArrayList<Object>();
		ArrayList<Object> gender = new ArrayList<Object>();
		ArrayList<Object> contact_p = new ArrayList<Object>();
		ArrayList<Object> contact_w = new ArrayList<Object>();
		ArrayList<Object> email_p = new ArrayList<Object>();
		ArrayList<Object> email_c = new ArrayList<Object>();
		ArrayList<Object> options = new ArrayList<Object>();
		ArrayList<Object> photo = new ArrayList<Object>();
		
		ConnectingMySqlDB obj = ConnectingMySqlDB.getConnectingMySqlDB();
		Connection conn = obj.getConnected();
		if(conn==null){
			System.out.println("No Connection to DB");
			return null;
		}else{
			try{
				ResultSet stmt = conn.createStatement().executeQuery(QUERY);
				while(stmt.next()){
					regid.add(stmt.getString("regid"));
					name.add(stmt.getString("name"));
					dob.add(stmt.getString("dob"));
					gender.add(stmt.getString("gender"));
					email_p.add(stmt.getString("personal_emailid"));
					email_c.add(stmt.getString("company_emailid"));
					contact_p.add(stmt.getString("contact_number"));
					contact_w.add(stmt.getString("whatsapp_number"));
					options.add(stmt.getString("options"));
					photo.add(stmt.getBlob("pp_photo"));
				}
				
				map.put("regid", regid);
				map.put("name", name);
				map.put("dob", dob);
				map.put("gender", gender);
				map.put("contact_p", contact_p);
				map.put("contact_w", contact_w);
				map.put("email_p", email_p);
				map.put("email_c", email_c);
				map.put("options", options);
				map.put("photo", photo);
				
				System.out.println(map);
				
			}catch(SQLException e){
				//e.printStackTrace();	
				System.out.println(e);
				return null;
			}
		}
		return map;
	}
	
}
