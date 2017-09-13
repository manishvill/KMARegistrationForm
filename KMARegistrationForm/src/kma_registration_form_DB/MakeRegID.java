package kma_registration_form_DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Formatter;

import com.kma.services.ConnectingMySqlDB;

public class MakeRegID {
	
	
	static String generateID(String year){
	
		Formatter fmt = new Formatter();
		GetLastRegID getlast = new GetLastRegID();
		String ID = getlast.getlastID();
		System.out.println("Last ID got " + ID);
		if(year != null){
			String prefix_regID = "KMA";
			String get_Month = fmt.format("%tb", Calendar.getInstance()).toString().toUpperCase();
			fmt.close();
			int get_Year = Calendar.getInstance().get(Calendar.YEAR) - 2000;
			ID = ID.substring(10, ID.length());
			System.out.println("sub s " + ID);
			int index = Integer.parseInt(ID);
			index = index + 1;
			ID = prefix_regID + get_Month + get_Year + year + index;
			System.out.println("new ID " + prefix_regID + " " + get_Month + " " + get_Year + " " + year +  " " + index);
			
			ID = getIDagain(ID, index, prefix_regID, get_Month, get_Year, year);
			
			return ID;
		} else {
			fmt.close();
			return "IDerror";
		}
	}
	
	static String getIDagain(String ID, int index, String prefix_regID, String get_Month, int get_Year, String year) {
		
		
		ConnectingMySqlDB obj = ConnectingMySqlDB.getConnectingMySqlDB();
		Connection conn = obj.getConnected();
		if(conn == null){
				System.out.println("No Connection to DB");
		}else{
				try {
						boolean present_T = true;
						boolean present_F = true;
						while(present_T || present_F) {
								String QUERY_FINAL = "select regid from registered_user where regid =\""+ ID + "\";";
								String QUERY_TEMP = "select regid from registration_list where regid =\""+ ID + "\";";
								Statement state = conn.createStatement();
								ResultSet result_T = state.executeQuery(QUERY_TEMP);
								present_T = result_T.next();
								ResultSet result_F = state.executeQuery(QUERY_FINAL);
								present_F = result_F.next();
								
								if(present_T || present_F) {
									index = index + 1;
									ID = prefix_regID + get_Month + get_Year + year + index;
								}
						}
						
				} catch (SQLException e) {
						e.getErrorCode();
						System.out.println(e);
				}
		}
		return ID;
	}
}
