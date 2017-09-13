package kma_registration_form_DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.kma.services.ConnectingMySqlDB;



public class GetNewUsers {
	public Map<String, ArrayList<Object>> getUsers() {
		ConnectingMySqlDB obj = ConnectingMySqlDB.getConnectingMySqlDB();
		Connection conn = obj.getConnected();
		Map<String, ArrayList<Object>> map = new HashMap<String, ArrayList<Object>>();
		ArrayList<Object> setname = new ArrayList<Object>();
		ArrayList<Object> setregid = new ArrayList<Object>();
		ArrayList<Object> setcontact = new ArrayList<Object>();
		if(conn==null){
			System.out.println("No Connection to DB");
			return null;
		}else{
			try{
				
				String QUERY = "SELECT * FROM registration_list;";
				ResultSet stmt = conn.createStatement().executeQuery(QUERY);
				
				while(stmt.next()){
					setregid.add(stmt.getString("regid"));
					setname.add(stmt.getString("name"));	
					setcontact.add(stmt.getLong("contact_number"));
				}
				
				map.put("regid", setregid);
				map.put("name", setname);
				map.put("contact", setcontact);
				
				System.out.println(map);
				return map;
				
			}catch(SQLException e){
				//e.printStackTrace();	
				System.out.println(e);
				return null;
			}
		}
	}
}
