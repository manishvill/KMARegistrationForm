package kma_registration_form_DB;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.kma.services.ConnectingMySqlDB;

public class GetLastRegID {
	
	ConnectingMySqlDB obj = ConnectingMySqlDB.getConnectingMySqlDB();
	Connection connect = obj.getConnected();
	String getlastID() {
			String ID = "";
			String QUERY_GET_REGID_TEMP = "SELECT * from registration_list;";
			String QUERY_GET_REGID_FINAL = "SELECT * from registered_user;";
			
			try {
						Statement regidstmt = connect.createStatement();
						ResultSet result = regidstmt.executeQuery(QUERY_GET_REGID_TEMP);
						boolean isRow = result.next();
						
						if(isRow == false) {
								result = regidstmt.executeQuery(QUERY_GET_REGID_FINAL);
								isRow = result.next();
								result.close();
								
								if (isRow == false) {
										ID = "KMAXXXXXXX0";
										return ID;
								} else {
										result = regidstmt.executeQuery(QUERY_GET_REGID_FINAL);
										while (result.next()) {
												if(result.isLast()) {
														ID = result.getString("regid");
														result.close();
														return ID;
												}
										}
										result.close();
								}
						} else {
								result.close();
								result = regidstmt.executeQuery(QUERY_GET_REGID_TEMP);
								while (result.next()) {
										if(result.isLast()) {
												ID = result.getString("regid");
										}
								}
						}
						
				} catch (SQLException e) {
					e.printStackTrace();
					return "problem";
				}
			return ID;
	}
}