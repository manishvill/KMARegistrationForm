<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="US-ASCII" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	session.setAttribute("nameval", session.getAttribute("nameval"));
	session.setAttribute("dobval", session.getAttribute("dobval"));
	session.setAttribute("genderval", session.getAttribute("genderval"));
	session.setAttribute("pemailval", session.getAttribute("pemailval"));
	session.setAttribute("cemailval", session.getAttribute("cemailval"));
	session.setAttribute("contactnoval", session.getAttribute("contactnoval"));
	session.setAttribute("whatsappnoval", session.getAttribute("whatsappnoval"));
	session.setAttribute("pp_image", session.getAttribute("pp_image"));
	
	session.setAttribute("paymentmodeval", session.getAttribute("paymentmodeval"));
	session.setAttribute("reciptnoval", session.getAttribute("reciptnoval"));
	session.setAttribute("transnoval", session.getAttribute("transnoval"));
	session.setAttribute("chddnoval", session.getAttribute("chddnoval"));
	session.setAttribute("amountpaidval", session.getAttribute("amountpaidval"));
	session.setAttribute("amountbalval", session.getAttribute("amountbalval"));
	
	session.setAttribute("whatsappnoa", null);
	session.setAttribute("contactnoa", null);
	session.setAttribute("personal_email", null);
	session.setAttribute("company_email", null);
	session.setAttribute("invalidname", null);
	session.setAttribute("invalidgen", null);
	session.setAttribute("invalidpemail", null);
	session.setAttribute("invalidcemail", null);
	session.setAttribute("invalidcont", null);
	session.setAttribute("invalidwano", null);
	session.setAttribute("invalidimg", null);
	session.setAttribute("invalidimgs", null);
	session.setAttribute("invalidpaym", null);
	session.setAttribute("invalidrcpt", null);
	session.setAttribute("invalidamtp", null);
	session.setAttribute("invalidamtb", null);
	session.setAttribute("invalidtransNo", null);
	session.setAttribute("invalidchqNo", null);

%>

<table class="table" style="margin: auto;" border="1">

<tr>
	<th rowspan="1" >Personal Details</th>
</tr>

<tr>
	<td>Name :</td>
	<td><%= session.getAttribute("nameval") %></td>
</tr>

<tr>
	<td>Date of Birth :</td> 
	<td><%= session.getAttribute("dobval") %></td>
</tr>

<tr>
	<td>Gender :</td>
	<td><%= session.getAttribute("genderval") %></td>
</tr>

<tr>
	<td>Personal Email ID :</td>
	<td><%= session.getAttribute("pemailval") %></td>
</tr>

<tr>
	<td>Company Email ID :</td>
	<td><%= session.getAttribute("cemailval") %></td>
</tr>

<tr>
	<td>Contact Number :</td>
	<td><%= session.getAttribute("contactnoval") %></td>
</tr>

<tr>
	<td>What's App Number : </td>
	<td><%= session.getAttribute("whatsappnoval") %></td>
</tr>

<tr>
	<th>Payment Details :</th>
</tr>

<tr>
	<td>Payment Mode :</td>
	<td><%= session.getAttribute("paymentmodeval") %></td>
</tr>

<tr>
	<td>Receipt Number :</td>
	<td><%= session.getAttribute("reciptnoval") %></td>
</tr>

<% if(!session.getAttribute("transnoval").toString().contains("null")){
	out.print("<tr><td>Transaction No :</td><td>"+session.getAttribute("transnoval")+"</td></tr>");
	}
%>

<% if(!session.getAttribute("chddnoval").toString().contains("null")){
	out.print("<tr><td>Cheque/DD No :</td><td>"+session.getAttribute("chddnoval")+"</td></tr>");}
%>

<tr>
	<td>Amount Paid :</td>
	<td><%= session.getAttribute("amountpaidval") %></td>
</tr>

<tr>
	<td>Amount Balance :</td>
	<td><%= session.getAttribute("amountbalval") %></td>
</tr>

<tr>
	<td align="center">
		<button onclick="window.location.replace('index2.jsp')">Edit</button>
		<form action="StoreData" method="POST"><button type="submit">Submit</button></form>
		<button onclick="window.location.replace('index.jsp')">Cancel</button></td>
</tr>
</table>
</body>
</html>