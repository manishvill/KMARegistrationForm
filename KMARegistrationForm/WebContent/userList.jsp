<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="kma_registration_form_DB.GetNewUsers"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	GetNewUsers x = new GetNewUsers();
	Map<String, ArrayList<Object>> map = new HashMap<String, ArrayList<Object>>();
	map = x.getUsers();
	if(session.getAttribute("authorized")==null){
		response.sendRedirect("admin.jsp");
		session.setAttribute("login", "Please Login");
		
	}else{
		session.removeAttribute("login");
	}
	session.removeAttribute("invalid");
	//System.out.println(map.get("name").size());
%>    
<!DOCTYPE html>
<html>
		<head>
				<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
				<link rel="stylesheet" href="externalLib/bootstrap.min.css">
				<link rel="stylesheet" href="externalLib/css/sidenavbar.css">
				<script src="externalLib/jquery-latest.min.js"></script>
				<title>User's List</title>
				<style>
					.tablediv{
						height : auto;
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
				<script>	
						function approve(row) {
							alert("inside approve");
							var index = row.parentNode.parentNode.rowIndex;
							var row_value = document.getElementById("myTable").rows[index].cells.item(0).innerText;
							alert(row_value);
							$.post('UserApproval', {"regid" : row_value, "action" : "add"}, function (data, status) {
								if(status=="success") {
									alert("User Approved");
									document.getElementById("myTable").deleteRow(index);
								}else{
									alert("Connection Problem");
								}
							});
							
						}
						
						function disapprove(row) {
							alert("Deleting");
							alert("xxx");
							var index = row.parentNode.parentNode.rowIndex;
							var row_value = document.getElementById("myTable").rows[index].cells.item(0).innerText;
							alert(row_value);
							$.post('UserApproval', {"regid" : row_value, "action" : "delete"}, function (data, status) {
								if(status=="success") {
									alert("User Deleted");
									document.getElementById("myTable").deleteRow(index);
								}else{
									alert("Connection Problem");
								}
							});
						}
				</script>
		</head>
		<body>
			<div>
				<ul>
					<li><a href="index.jsp">Home</a></li>
					<li><a href="userList.jsp" class="active">New Registrations</a></li>
					<li><a href="registereduser.jsp">Registered Users</a></li>
					<li><a href="admin.jsp">Logout</a></li>
				</ul>
			</div>
			<div style="margin-left:20%;padding:1px 16px;" class="tablediv">
				<table id="myTable" class="table">
					<thead>
						<tr>
							<th>
									Registration No.
							</th>
							<th>
									Name
							</th>
						
							<th>
									Contact No.
							</th>
							
							<th>
									Approve
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
								out.println(map.get("name").get(i));
								out.println("</td>");
								out.println("<td>");
								out.println(map.get("contact").get(i));
								out.println("</td>");
								out.println("<td>");
								out.println("<input class='btn' type='button' value='Approve' onclick='approve(this)'>&emsp;<input class='btn' type='button' onclick='disapprove(this)' value='Disapprove'>" );
								out.println("</td>");
								out.println("</tr>");
							}		
					%>
					
				</table>
			</div>
		</body>
</html>