<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="US-ASCII" %>
<%if(session.getAttribute("nameval")==null){
	response.sendRedirect("index2.jsp");
} %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table class="table" style="margin: auto;" border="1">

<tr>
	<th>Registration ID :</th>
	<th><%= session.getAttribute("reg_idval") %></th>

</tr>

<tr></tr><tr></tr><tr></tr>

<tr>
	<th colspan="2" >Personal Details</th>
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

<tr></tr><tr></tr><tr></tr>

<tr >
	<th colspan="2" >Payment Details :</th>
</tr>

<tr>
	<td>Payment Mode :</td>
	<td><%= session.getAttribute("paymentmodeval") %></td>
</tr>

<tr>
	<td>Receipt Number :</td>
	<td><%= session.getAttribute("reciptnoval") %></td>
</tr>

<% if(session.getAttribute("transnoval")!="null")
	out.print("<tr><td>Transaction No :</td><td>"+session.getAttribute("transnoval")+"</td></tr>");
%>

<% if(session.getAttribute("chddnoval")!="null")
	out.print("<tr><td>Cheque/DD No :</td><td>"+session.getAttribute("chddnoval")+"</td></tr>");
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
	<td colspan="2" ><button onclick="window.print();">Print</button>
	<button onclick="window.location.replace('index.jsp')">Close</button></td>
</tr>
</table>
</body>
</html>