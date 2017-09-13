<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
<%@page import="kma_registration_form_DB.GetAllRegUser"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%
  	GetAllRegUser user = new GetAllRegUser();
 	Map<String, ArrayList<Object>> map = new HashMap<String, ArrayList<Object>>();
 	map = user.getUsers();
 	if(session.getAttribute("authorized")==null){
		response.sendRedirect("admin.jsp");
		session.setAttribute("login", "Please Login");
		
	}else{
		session.removeAttribute("login");
	}
	session.removeAttribute("invalid");
 %>
<!DOCTYPE html>
<html>
		<head>
				<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
				<title>Registered User</title>
				<link rel="stylesheet" href="externalLib/bootstrap.min.css">
				<link rel="stylesheet" href="externalLib/css/sidenavbar.css">
				<script src="externalLib/jquery-latest.min.js"></script>
				<style>
					.tablediv{
						height : 97vh;
						width : auto;
						padding : 5vh 3vh 1vh 3vh;
						margin : auto;
						margin-left : 200px;
						margin-right : 200px;
						margin-top : 2vh;
						background-color : #F5F5F5;
						overflow: auto;
					} 
				</style>
		</head>
		<body>
			<div  style="margin-top : 2vh;">
				<ul>
					<li><a href="index.jsp">Home</a></li>
					<li><a href="userList.jsp">New Registrations</a></li>
					<li><a class="active" href="registereduser.jsp">Registered Users</a></li>
					<li><a href="admin.jsp">Logout</a></li>
				</ul>
			</div>
			
			<div style="margin-left:17%;padding:1px 16px;margin-right:2%" class="tablediv">
				<table id="myTable" class="table">
					<thead>
						<tr>
							<th>
									Reg. No.
							</th>
							<th>
									Photo
							</th>	
							<th>
									Name
							</th>
						
							<th>
									DOB
							</th>
							<th>
									Gender
							</th>	
							<th>
									Contact No.
							</th>	
							<th>
									Email ID
							</th>	
							<th>
									Options
							</th>	
						</tr>
					</thead>
					
					<%
							for(int i = 0; i<map.get("name").size(); i++){
								out.println("<tr>");
								out.println("<td>");
								out.println(map.get("regid").get(i));
								out.println("</td>");
								out.println("<td>");
								out.println("<img src='externalLib/getImage.jsp?img_id="+i+"' width='70px' alt='No Image' height='70px'/>");
								out.println("</td>");
								out.println("<td>");
								out.println(map.get("name").get(i));
								out.println("</td>");
								out.println("<td>");
								out.println(map.get("dob").get(i));
								out.println("</td>");
								out.println("<td>");
								out.println(map.get("gender").get(i));
								out.println("</td>");
								out.println("<td>");
								out.println(map.get("contact_p").get(i));
								out.println("<br>");
								out.println(map.get("contact_w").get(i));
								out.println("</td>");
								out.println("<td>");
								out.println(map.get("email_p").get(i));
								out.println("<br>");
								out.println(map.get("email_c").get(i));
								out.println("</td>");
								out.println("<td>");
								out.println(map.get("options").get(i));
								out.println("</td>");
								out.println("</tr>");
							}		
					%>
				
				</table>
			</div>
		</body>
</html>