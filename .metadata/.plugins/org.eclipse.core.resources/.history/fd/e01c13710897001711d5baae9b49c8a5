<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    	if(session.getAttribute("authorized")!=null){
    		response.sendRedirect("userList.jsp");
    	}
    	session.setAttribute("authorized", null);
	
    %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Admin Login</title>
		<style>
			.loginForm {
				padding: 5vh;
			}
			.input{
				padding : 5px;
				margin : 5px;	
				border: none;
				width : 90%;
    			border-bottom: 2px solid #B7B2B1;	
			}
			.btn{
				padding : 8px;
				width : 90%;
				margin-top : 15px;
				border : none;
				background-color : #e7e7e7;
				color: black;
			    text-align: center;
			    font-size : 100%;
			    cursor: pointer; 
			}
			
			div{
				width : 60vh;
				height : 50%;
				text-align : center;
				background-color : #F5F5F5;
				margin : auto;
				margin-top : 20vh;
				
				
			}
			.btn{
				background-color : #E0E0E0;
			}
			.input:hover{
    			border-bottom: 2px solid #454545;	
			}
			.input:focus{
    			border-bottom: 2px solid #454545;	
			}
		</style>
	</head>
	<body>
		<div class="loginForm">
				<h5><font size="3" color="red">
				<%if(session.getAttribute("login")!=null){
					out.print(session.getAttribute("login"));
				}%></font></h5>
			<form action="AuthenticateUser">
				<h3>Admin Login</h3>
				<h5>
					<font size="3" color="red">
							<%	if(session.getAttribute("invalid")!=null){
									out.print(session.getAttribute("invalid"));
								}
							%>
					</font>
				</h5>
				<input class="input" name="user" type="text" id="username" placeholder="Username"><br>
				<input class="input" name="pass" type="password" id="password" placeholder="Password"><br>
				<input class="btn" type="submit" value="Login">
			</form>
		</div>
	</body>
</html>