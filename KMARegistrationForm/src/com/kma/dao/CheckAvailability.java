package com.kma.dao;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.kma.services.ConnectingMySqlDB;

/**
 * Servlet implementation class CheckAvailability
 */
@WebServlet("/CheckAvailability")
@MultipartConfig
public class CheckAvailability extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckAvailability() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    		
    	//--------------------Varaiable initialization---------------------------------------------------------
    	
	    	String name = null;
	    	String dob = null;
	    	String gender = null;
	    	String pemail = null;
	    	String cemail = null;
	    	String contactno = null;
	    	String wano = null;
	    	String paymentMode = null;
	    	String receiptNo = null;
	    	String transNo = null;
	    	String chqNo = null;
	    	String amtPaid = null;
	    	String amtBal = null;
	    	InputStream inputStream = null;
	    	Part filePart = null;
    		String data ="";
    		String QUERY = "";
    		String QUERY_F = "";
    		int invalid_data = 0;
    		int flagforpmail = 0;
    		int flagforcmail = 0;
    		int flagforcontact = 0;
    		int flagforwano = 0;
    		int flagforpmail_F = 0;
    		int flagforcmail_F = 0;
    		int flagforcontact_F = 0;
    		int flagforwano_F = 0;
    	
    	//--------------------End of Varaiable initialization---------------------------------------------------------
    		
		//--------------------Data From Webpage-----------------------------------------------------------------------	
    		name = request.getParameter("name");
    		dob = request.getParameter("dob");
    		if(request.getParameter("gender")==null){
    			gender = null;
    		}else{
    			gender = request.getParameter("gender");
    		}
    		System.out.println("gen " + request.getParameter("gender"));
    		pemail = request.getParameter("pemail").toLowerCase();
    		cemail = request.getParameter("cemail").toLowerCase();
    		contactno = request.getParameter("contactno");
    		wano = request.getParameter("whatsappno");
    		filePart = request.getPart("photo");
    		inputStream = filePart.getInputStream();
    		System.out.println("image");
    		
    		if(request.getParameter("payment")==null){
    			paymentMode = null;
    		}else{
    			paymentMode = request.getParameter("payment");
    		}
    		receiptNo = request.getParameter("rcptno");
    		transNo = request.getParameter("transno");
    		chqNo = request.getParameter("chddno");
    		amtPaid = request.getParameter("amtp");
    		amtBal = request.getParameter("amtb");
    		
    		if(request.getParameter("transno").isEmpty()) {
    			transNo = "";
    		}
    		if(request.getParameter("chddno").isEmpty()) {
    			chqNo = "";
    		}
    		
		//--------------------End of Data From Webpage-----------------------------------------------------------------------

    		
    	//----------------------SERVER SIDE INPUT VALIDATION AND CHECK AVAILABILITY-----------------------------------------	
    		ConnectingMySqlDB obj = ConnectingMySqlDB.getConnectingMySqlDB();
    		Connection conn = obj.getConnected();
			if(conn == null){
				System.out.println("No Connection to DB");
				request.getSession().setAttribute("NOSERVER", "SERVER IS NOT AVAILABLE");
				response.sendRedirect("index2.jsp");
			}else{
				try {
					
				//---------------SERVER SIDE VALIDATION--------------------------------------------------
					
					if(!name.matches("[a-zA-Z ]+[a-zA-Z. ]")){
						invalid_data = 1;
						request.getSession().setAttribute("invalidname", "Please Enter Valid Name");
					}else{
						request.getSession().setAttribute("invalidname", null);
					}
					
					if(gender == null){
						invalid_data = 1;
						request.getSession().setAttribute("invalidgen", "Please select valid gender");
					}else{
							if(!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female") && !gender.equalsIgnoreCase("Others")){
								invalid_data = 1;
								request.getSession().setAttribute("invalidgen", "Please select valid gender");
							}else{
								request.getSession().setAttribute("invalidgen", null);
							}
					}
					
					if(!pemail.matches("[a-z0-9._]+@[a-z0-9.-]+\\.[a-z]{2,3}$")){
						invalid_data = 1;
						request.getSession().setAttribute("invalidpemail", "Please Enter Valid Email ID");
					}else{
						request.getSession().setAttribute("invalidpemail", null);
					}
					
					if(!cemail.matches("[a-z0-9._]+@[a-z0-9.-]+\\.[a-z]{2,3}$")){
						invalid_data = 1;
						request.getSession().setAttribute("invalidcemail", "Please Enter Valid Email ID");
					}else{
						request.getSession().setAttribute("invalidcemail", null);
					}
					
					if(!contactno.matches("[7-9]{1}[0-9]{9}")){
						invalid_data = 1;
						request.getSession().setAttribute("invalidcont", "Please Enter Valid Contact No");
					}else{
						request.getSession().setAttribute("invalidcont", null);
					}
					
					if(!wano.matches("[7-9]{1}[0-9]{9}")){
						invalid_data = 1;
						request.getSession().setAttribute("invalidwano", "Please Enter Valid Contact No");
					}else{
						request.getSession().setAttribute("invalidwano", null);
					}
					
					if(!filePart.getContentType().equals("image/jpeg") && !filePart.getContentType().equals("image/jpg") && !filePart.getContentType().equals("application/octet-stream")){
						invalid_data = 1;
						request.getSession().setAttribute("invalidimg", "please upload valid image(jpeg, jpg)");
					}else{
							request.getSession().setAttribute("invalidimg", null);
					}
					
					if(filePart.getSize() > 1024 * 1024 * 100){
						invalid_data = 1;
						request.getSession().setAttribute("invalidimgs", "File size exceed!!");
					}else{
						request.getSession().setAttribute("invalidimgs", null);
					}
					
					if(paymentMode == null){
						invalid_data = 1;
						request.getSession().setAttribute("invalidpaym", "Please Select Valid Payment Mode");
					} else {
						request.getSession().setAttribute("invalidpaym", null);
						if(!receiptNo.matches("^[0-9]+$")){
							invalid_data = 1;
							request.getSession().setAttribute("invalidrcpt", "Please Enter Valid Recipt No");
						}else{
							request.getSession().setAttribute("invalidrcpt", null);
						}
						if(!amtPaid.matches("^[0-9]+$")){
							invalid_data = 1;
							request.getSession().setAttribute("invalidamtp", "Please Enter Valid Amount");
						}else{
							request.getSession().setAttribute("invalidamtp", null);
						}
						if(!amtBal.matches("^[0-9]+$")){
							invalid_data = 1;
							request.getSession().setAttribute("invalidamtb", "Please Enter Valid Amount");
						}else{
							request.getSession().setAttribute("invalidamtb", null);
						}
						
						if(paymentMode.equals("Card")) {
							if(transNo==null || transNo=="") {
								invalid_data = 1;
								request.getSession().setAttribute("invalidtransNo", "Please Enter Valid Transaction ID");
							} else {
								request.getSession().setAttribute("invalidtransNo", null);
							}
						} else {
							request.getSession().setAttribute("invalidtransNo", null);
							if(paymentMode.equals("Cheque/DD")) {
								if(chqNo==null || chqNo=="") {
									invalid_data = 1;
									request.getSession().setAttribute("invalidchqNo", "Please Enter Valid Cheque No");
								} else {
									request.getSession().setAttribute("invalidchqNo", null);
								}
							} else {
								request.getSession().setAttribute("invalidchqNo", null);
								if(paymentMode.equals("Cash")) {}
								else{
									invalid_data = 1;
									request.getSession().setAttribute("invalidpaym", "Please Select Valid Payment Mode");
								}
							}	
						}
					}
				//----------------END OF SERVER SIDE VALIDATION--------------------------------------------------
				
				
					
				//----------------DATA AVAILABILITY CHECK--------------------------------------------------------
					
					data = request.getParameter("pemail");
					QUERY = "SELECT * FROM registration_list WHERE personal_emailid="+'"'+data+'"'+";";
					QUERY_F = "SELECT * FROM registered_user WHERE personal_emailid="+'"'+data+'"'+";";
					ResultSet stmt = conn.createStatement().executeQuery(QUERY);
					if(stmt.next()){
						flagforpmail = 1;		
					}else{flagforpmail=0;}
					
					stmt = conn.createStatement().executeQuery(QUERY_F);
					if(stmt.next()){
						flagforpmail_F = 1;		
					}else{flagforpmail_F=0;}
					
					
					data = request.getParameter("cemail");
					QUERY = "SELECT * FROM registration_list WHERE company_emailid="+'"'+data+'"'+";";
					QUERY_F = "SELECT * FROM registered_user WHERE company_emailid="+'"'+data+'"'+";";
					stmt = conn.createStatement().executeQuery(QUERY);
					if(stmt.next()){
						flagforcmail = 1;		
					}else{flagforcmail=0;}
					
					stmt = conn.createStatement().executeQuery(QUERY_F);
					if(stmt.next()){
						flagforcmail_F = 1;		
					}else{flagforcmail_F=0;}
					
					
					data = request.getParameter("contactno");
					QUERY = "SELECT * FROM registration_list WHERE contact_number="+'"'+data+'"'+";";
					QUERY_F = "SELECT * FROM registered_user WHERE contact_number="+'"'+data+'"'+";";
					stmt = conn.createStatement().executeQuery(QUERY);
					if(stmt.next()){
						flagforcontact = 1;		
					}else{flagforcontact=0;}
					
					stmt = conn.createStatement().executeQuery(QUERY_F);
					if(stmt.next()){
						flagforcontact_F = 1;		
					}else{flagforcontact_F=0;}
					
					
					data = request.getParameter("whatsappno");
					QUERY = "SELECT * FROM registration_list WHERE whatsapp_number="+'"'+data+'"'+";";
					QUERY_F = "SELECT * FROM registered_user WHERE whatsapp_number="+'"'+data+'"'+";";
					stmt = conn.createStatement().executeQuery(QUERY);
					if(stmt.next()){
						flagforwano = 1;		
					}else{flagforwano=0;}
					
					stmt = conn.createStatement().executeQuery(QUERY_F);
					if(stmt.next()){
						flagforwano_F = 1;		
					}else{flagforwano_F=0;}

					if (flagforcmail==1||flagforpmail==1||flagforcontact==1||flagforwano==1||flagforcmail_F==1||flagforpmail_F==1||flagforcontact_F==1||flagforwano_F==1 || invalid_data == 1) {
							response.sendRedirect("index2.jsp");	
							
							request.getSession().setAttribute("nameval", name);
							request.getSession().setAttribute("dobval", dob);
							request.getSession().setAttribute("genderval", gender);
							request.getSession().setAttribute("pemailval", pemail);
							request.getSession().setAttribute("cemailval", cemail);
							request.getSession().setAttribute("contactnoval", contactno);
							request.getSession().setAttribute("whatsappnoval", wano);
							
							//request.getSession().setAttribute("photoval",filePart.getName()); not working
							
							request.getSession().setAttribute("paymentmodeval", paymentMode);	
							request.getSession().setAttribute("reciptnoval", receiptNo);
							if(transNo!=null){
								request.getSession().setAttribute("transnoval", transNo);						
							}
							if(chqNo!=null){
								request.getSession().setAttribute("chddnoval", chqNo);
							}
							request.getSession().setAttribute("amountpaidval", amtPaid);
							request.getSession().setAttribute("amountbalval", amtBal);
							
							if (flagforpmail == 1 || flagforpmail_F == 1) {
									request.getSession().setAttribute("personal_email", "Personal Email ID already registered");
							} else {
									request.getSession().setAttribute("personal_email", "");
							}
							
							if (flagforcmail == 1 || flagforcmail_F == 1) {
									request.getSession().setAttribute("company_email", "Company Email ID already registered");
							} else {
									request.getSession().setAttribute("company_email", "");
							}
							
							if(flagforcontact == 1 || flagforcontact_F == 1){
								request.getSession().setAttribute("contactnoa", "Contact Number already registered");
							}else{request.getSession().setAttribute("contactnoa", "");}
							
							if(flagforwano == 1 || flagforwano_F == 1){
								request.getSession().setAttribute("whatsappnoa", "Whatsapp Number already registered");
							}else{request.getSession().setAttribute("whatsappnoa", "");}
							
				//----------------End of DATA AVAILABILITY CHECK--------------------------------------------------------
					
					} else {
							
				//-----------------USER DATA RE VERIFICATION------------------------------------------------------------
							response.sendRedirect("recheck.jsp");
							request.getSession().setAttribute("nameval", name);
							request.getSession().setAttribute("dobval", dob);
							request.getSession().setAttribute("genderval", gender);
							request.getSession().setAttribute("pemailval", pemail);
							request.getSession().setAttribute("cemailval", cemail);
							request.getSession().setAttribute("contactnoval", contactno);
							request.getSession().setAttribute("whatsappnoval", wano);
							request.getSession().setAttribute("pp_image", inputStream);
							//request.getSession().setAttribute("photoval",filePart.getName().toString());
							
							request.getSession().setAttribute("paymentmodeval", paymentMode);
							request.getSession().setAttribute("reciptnoval", receiptNo);
							
							if(transNo!=""){
								request.getSession().setAttribute("transnoval", transNo);
							}else{
								request.getSession().setAttribute("transnoval", "null");
							}
							
							if(chqNo != ""){
								request.getSession().setAttribute("chddnoval", chqNo);
							}else{
								request.getSession().setAttribute("chddnoval", "null");
							}
							
							request.getSession().setAttribute("amountpaidval", amtPaid);
							request.getSession().setAttribute("amountbalval", amtBal);
				//-----------------ENd of USER DATA RE VERIFICATION------------------------------------------------------------
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("ERROR " + e.getErrorCode() + ", " + e.getMessage());
					response.sendRedirect("index2.jsp");
				}
			}
		
		//----------------------END of SERVER SIDE INPUT VALIDATION AND CHECK AVAILABILITY-----------------------------------------
	}

}
