<%@page import="com.kma.dao.CheckAvailability"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="US-ASCII" %>
<%
	CheckAvailability check = new CheckAvailability();
	request.getSession().setAttribute("nameval", null);
	request.getSession().setAttribute("Error",null);
	session.setAttribute("login", null);
	session.setAttribute("invalid", null);
%>


<!DOCTYPE html>

<html>
<head>
	<meta charset="utf-8">
	<title>KMA Registration Form</title>
	<link rel="stylesheet" href="externalLib/bootstrap.min.css">
	<link rel="stylesheet" href="externalLib/css/regForm.css">
	<script type="text/javascript">
	
						function onLoad() {
							if(document.getElementById('cshpaymentmode').checked){
								document.getElementById('rcptno').style.display = 'block';
								document.getElementById('amtp').style.display = 'block';
	        				   	document.getElementById('amtb').style.display = 'block';
	       				   	   	document.getElementById('chddno').style.display = 'none';
	       				   		document.getElementById('trnsno').style.display = 'none';
	       				   		document.getElementById('chddno').value = null;
	       				 		document.getElementById('trnsno').value = null;
	       						document.getElementById('rcptno').required = "required";
	 				   			document.getElementById('amtp').required = "required";
	 				  			document.getElementById('amtb').required = "required";
	    				   		document.getElementById('chddno').required = false;
	       				   		document.getElementById('trnsno').required = false;
							}
							if(document.getElementById('crdpaymentmode').checked){
								document.getElementById('rcptno').style.display = 'block';
								document.getElementById('chddno').style.display = 'none';
							   	document.getElementById('amtp').style.display = 'block';
	        				   	document.getElementById('amtb').style.display = 'block';
	       				   	   	document.getElementById('trnsno').style.display = 'block';
	       				   		document.getElementById('chddno').value = null;
	       				   		document.getElementById('trnsno').value = null;
	       				   		document.getElementById('rcptno').required = "required";
						   		document.getElementById('amtp').required = "required";
	    				   		document.getElementById('amtb').required = "required";
	    				   		document.getElementById('trnsno').required = "required";
	    				   		document.getElementById('chddno').required = false;
							}
							if(document.getElementById('chddpaymentmode').checked){
								document.getElementById('rcptno').style.display = 'block';
								document.getElementById('trnsno').style.display = 'none';
					   			document.getElementById('amtp').style.display = 'block';
					   			document.getElementById('amtb').style.display = 'block';
				   	   			document.getElementById('chddno').style.display = 'block';
				   				document.getElementById('rcptno').required = "required";
					   			document.getElementById('trnsno').value = null;
					   			document.getElementById('chddno').value = null;
					   			document.getElementById('amtp').required = "required";
					   			document.getElementById('amtb').required = "required";
				   	   			document.getElementById('chddno').required = "required";
				   	   			document.getElementById('trnsno').required = false;
							}
						}
							
        				function showcash() { document.getElementById('rcptno').style.display = 'block';
        				   	document.getElementById('amtp').style.display = 'block';
        				   	document.getElementById('amtb').style.display = 'block';
       				   	   	document.getElementById('chddno').style.display = 'none';
       				   		document.getElementById('trnsno').style.display = 'none';
       				   		document.getElementById('chddno').value = null;
       				 		document.getElementById('trnsno').value = null;
       						document.getElementById('rcptno').required = "required";
 				   			document.getElementById('amtp').required = "required";
 				  			document.getElementById('amtb').required = "required";
    				   		document.getElementById('chddno').required = false;
       				   		document.getElementById('trnsno').required = false;
       				   	}
       					   
        		
        				function showcard() { document.getElementById('rcptno').style.display = 'block';
						   	document.getElementById('chddno').style.display = 'none';
						   	document.getElementById('amtp').style.display = 'block';
        				   	document.getElementById('amtb').style.display = 'block';
       				   	   	document.getElementById('trnsno').style.display = 'block';
       				   		document.getElementById('chddno').value = null;
       				   		document.getElementById('trnsno').value = null;
       				   		document.getElementById('rcptno').required = "required";
					   		document.getElementById('amtp').required = "required";
    				   		document.getElementById('amtb').required = "required";
    				   		document.getElementById('trnsno').required = "required";
    				   		document.getElementById('chddno').required = false;
    				   	}
        		
        				function showchqdd() { document.getElementById('rcptno').style.display = 'block';
				   			document.getElementById('trnsno').style.display = 'none';
				   			document.getElementById('amtp').style.display = 'block';
				   			document.getElementById('amtb').style.display = 'block';
			   	   			document.getElementById('chddno').style.display = 'block';
			   				document.getElementById('rcptno').required = "required";
				   			document.getElementById('trnsno').value = null;
				   			document.getElementById('chddno').value = null;
				   			document.getElementById('amtp').required = "required";
				   			document.getElementById('amtb').required = "required";
			   	   			document.getElementById('chddno').required = "required";
			   	   			document.getElementById('trnsno').required = false;
			   	   		}
        				
        				function copyvaluemail(){
        					var ischeck = document.getElementById('sameasabovee').checked;
        					if(document.getElementById('cemail').value == null || document.getElementById('cemail').value ==""){
        						document.getElementById('cemail').value = document.getElementById('pemail').value;
        					}
        					if(document.getElementById('cemail').value !=null || document.getElementById('cemail').value !=""){
        						document.getElementById('cemail').value = document.getElementById('pemail').value;
        					}
        					if(!ischeck){
        						document.getElementById('cemail').value = null;
        					}
        				}
        				
        				function copyvaluecontact(){
        					var ischeck = document.getElementById('sameasabovec').checked;
        					if(document.getElementById('wnum').value == null || document.getElementById('wnum').value ==""){
        						document.getElementById('wnum').value = document.getElementById('cnum').value;
        					}
        					if(document.getElementById('wnum').value !=null || document.getElementById('wnum').value !=""){
        						document.getElementById('wnum').value = document.getElementById('cnum').value;
        					}
        					if(!ischeck){
        						document.getElementById('wnum').value = null;
        					}
        				}

      			</script>
</head>

<body>
	<%
		//	System.out.println("session_id " + session.getId());
		//	session.setAttribute(session.getId().toString(), session.getId());
			
	%>
	<h3 align="right" style="margin-right:10vh;"><a style="cursor : pointer;" onclick="window.open('admin.jsp')">Admin</a></h3>
	<div><header style="text-align:center;"><h1><b>Registration Form</b></h1></header></div>
	
	<div class="form">
		<form action="CheckAvailability" enctype="multipart/form-data"  method="POST">		
		
				<label for="name">Name:</label>
				<input class="fullwidth" name="name" type="text" placeholder="Full Name" size=50
				title="enter firstname" pattern="[a-zA-Z ]+[a-zA-Z. ]" title="Numbers not allowed" id="name" required>
				<br>
				
				<label>DOB:</label>
				<input class="fullwidth" id="dob" name="dob" type="date" placeholder="dd-MM-yyyy" required/>
				<br>			
				
				<label>Personal E-mail:</label>
				<input class="fullwidth" id="pemail" name="pemail" type="email" placeholder="Personal Email Id" size=50
				title="Enter valid Email ID" pattern="[a-z0-9._]+@[a-z0-9.-]+\.[a-z]{2,3}$" required>			
				<br>
				
				<label>Company E-mail:</label>
				<input class="fullwidth" id="cemail" name="cemail" type="email" placeholder="Company Email Id" size=50		
				title="Enter valid Email ID" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required>
				<br>
				
				<div class="samediv">
				<input class="samecheck" id="sameasabovee" value="true" id="sameasaboveemail" name="sameasaboveemail" type="checkbox" placeholder="Same as peronsal Email ID" onclick="copyvaluemail();">
				<label class="sameasabove" for="sameasaboveemail">Same as above</label>
				<br>
				</div>
				
				<label>Contact Number:</label>
				<select id="cnumpre" name="cc" size=1>
						<option value="+91">+91</option>
				</select>
				<input class="contact" id="cnum" name="contactno" type="text" placeholder="Mobile Number"
				pattern="[7-9]{1}[0-9]{9}"
				title="Invalid Contact Number" maxlength="10" required>
				<br>
				
				<label>What'sapp Number:</label>
				<select id="wnumpre" name="cc" size=1>
						<option value="+91">+91</option>
				</select>
				<input class="contact" id="wnum" name="whatsappno" type="text" placeholder="What'sapp Number"
				pattern="[7-9]{1}[0-9]{9}"
				title="Invalid What's app Number" maxlength="10" required>
				<br>
				
				<div class="samediv">
				<input class="samecheck" name="sameasabovecontact" type="checkbox" id="sameasabovec"
				placeholder="Same as contact number" onclick="copyvaluecontact();">
				<label class="sameasabove" for="sameasabovecontact">Same as above</label>
				<br>
				</div>
				
				<label class="gendercaption" for="gender">Gender:</label>
				<div class="gendiv"><input class="gender" id="mgender" type="radio" name="gender" value="Male" required><label class="genderlabel" for="mgender">Male</label></div>
				<div class="gendiv"><input class="gender" id="fgender" type="radio" name="gender" value="Female"  ><label class="genderlabel" for="fgender">Female</label></div>
				<div class="gendiv"><input class="gender" id="ogender" type="radio" name="gender" value="Others" ><label class="genderlabel" for="ogender">Others</label></div>
				<br>
				
				<label class="paymentcaption">Payment Details:</label>
	     	 	<div class="paydiv"><input class="gender" id="cshpaymentmode" type="radio" name="payment"
	     	 	value="Cash" onclick="showcash();"  required><label class="paylabel" for="cshpaymentmode">Cash</label></div>
		 		<div class="paydiv"><input class="gender" id="crdpaymentmode" type="radio" name="payment" 
		 		value="Card" onclick="showcard();"  ><label class="paylabel" for="crdpaymentmode">Card</label></div>
		  		<div class="paydiv"><input class="gender" id="chddpaymentmode" type="radio" name="payment" 
		  		value="Cheque/DD" onclick="showchqdd();"><label class="paylabel" for="chddpaymentmode">Cheque/DD</label></div>
	        	
	        	
	        	<input class="fullwidth" name="rcptno" type="text" id="rcptno" style="display: none;"  
	        	placeholder="Slip/Receipt Number" maxlength="30" >
	        	<input class="fullwidth" type="text" id="trnsno" style="display: none;" value="" 
	        	name="transno" placeholder="Transaction ID" maxlength="30">               
	        	<input class="fullwidth" type="text" id="chddno" style="display: none;" value="" 
	        	name="chddno" placeholder="Cheque/DD Number" maxlength="30" >
	        	<input class="fullwidth" type="number" id="amtp" style="display: none;" 
	        	name="amtp" placeholder="Amount Paid">
	        	<input class="fullwidth" type="number" id="amtb" style="display: none;" 
	        	name="amtb" placeholder="Amount Balance">
	        	<br>
				<br>
				<label>Upload Passport size photo:</label>			
				<input class="fullwidth" id="photo" name="photo" type="file" accept="image/*">
				<br>
		
			
				<div class="agreediv">
					<input id="agreement" name="agreement" type="checkbox" value="2" required><label for="agreement" class="agreelabel">Agree to <a href="">Terms &amp; Conditions</a></label>
				</div>
				<br>
				<div class="actionbtndiv">
					<input class="actionbtn" id="sub" type="submit" value="SUBMIT">
					<input class="actionbtn" id="rex" type="reset" value="RESET">
				</div>
	
		</form>
	</div>
</body>
</html>