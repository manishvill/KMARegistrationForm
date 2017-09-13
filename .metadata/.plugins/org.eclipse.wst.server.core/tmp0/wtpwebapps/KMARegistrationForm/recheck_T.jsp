<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="US-ASCII" %>
<% if(session.getAttribute("nameval")==null){
	response.sendRedirect("index.jsp");
} %>    
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
					   			
					   			document.getElementById('amtp').required = "required";
					   			document.getElementById('amtb').required = "required";
						   		document.getElementById('chddno').required = "required";
						   		document.getElementById('trnsno').required = false;
							}
						}
				
        				function showcash() { 
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
       					   
        		
        				function showcard() { 
        					document.getElementById('rcptno').style.display = 'block';
						   	document.getElementById('chddno').style.display = 'none';
						   	document.getElementById('amtp').style.display = 'block';
        				   	document.getElementById('amtb').style.display = 'block';
       				   	   	document.getElementById('trnsno').style.display = 'block';
       				   	   	
       				   		document.getElementById('chddno').value = null;

							if(document.getElementById('trnsno').value = "null"){
									document.getElementById('trnsno').value = null;
							}
   				   			
   				   			
       				   		document.getElementById('rcptno').required = "required";
					   		document.getElementById('amtp').required = "required";
    				   		document.getElementById('amtb').required = "required";
    				   		document.getElementById('trnsno').required = "required";
    				   		document.getElementById('chddno').required = false;
    				   	}
        		
        				function showchqdd() { 
        					document.getElementById('rcptno').style.display = 'block';
				   			document.getElementById('trnsno').style.display = 'none';
				   			document.getElementById('amtp').style.display = 'block';
				   			document.getElementById('amtb').style.display = 'block';
			   	   			document.getElementById('chddno').style.display = 'block';
			   				document.getElementById('rcptno').required = "required";
       				   		
   				   			document.getElementById('trnsno').value = null;
							
							if(document.getElementById('chddno').value = "null"){
									document.getElementById('chddno').value = null;
							}			   				

				   			document.getElementById('amtp').required = "required";
				   			document.getElementById('amtb').required = "required";
			   	   			document.getElementById('chddno').required = "required";
			   	   			document.getElementById('trnsno').required = false;
			   	   		}
      			</script>
	<style>
		label{
			width: 30%;
		}
		.warn{
			width: 65%;
			text-align : right;
			font-size: 12px;
			color: red;
				
		}
		.invalidgen{
			width : 100%;
			margin : 10px 0px 1px 0px;
			text-align : right;
			font-size: 12px;
			color: red;
		}
		.paywarn{
			width: 100%;
			text-align : right;
			font-size: 12px;
			color: red;
		}
	</style>
</head>


<body onload="onLoad();">
	<div><header style="text-align:center;"><h1><b>Registration Form</b></h1></header></div>
	<div style="text-align: center; margin-bottom: 0px;"><p><font color="red" style="text-align: center;">Please Verify the Details Below</font></p></div>
	<div class="form">
		<form action="CheckAvailability" enctype="multipart/form-data"  method="POST">		
		
				<%
		 				String nameval = "";
		 				if(session.getAttribute("nameval")!=null){
		 					Cookie forName = new Cookie("nameval",session.getAttribute("nameval").toString());
		 					nameval = forName.getValue();
		 				}
 				%>
				<label for="name">Name:</label>
				<input disabled class="fullwidth" name="name" type="text" placeholder="Full Name" size=50 value="<%out.print(nameval); %>"
				title="enter firstname" pattern="[a-zA-Z ]+[a-zA-Z. ]" title="Numbers not allowed" id="name" required>
				
				<br>
				
				
				<% 
		 				String dateval = "";
		 				if(session.getAttribute("dobval")!=null){
			 				Cookie forName = new Cookie("dobval",session.getAttribute("dobval").toString());
			 				dateval = forName.getValue();
		 				}
 				%>
				<label>DOB:</label>
				<input disabled class="fullwidth" id="dob" name="dob" type="date" placeholder="dd-MM-yyyy" value="<%out.print(dateval); %>" required/>
				<br>			
				
				
				<% 
		 				String pemailval = "";
		 					if(session.getAttribute("pemailval")!=null){
								Cookie forName = new Cookie("pemailval",session.getAttribute("pemailval").toString());
		 						pemailval = forName.getValue();
		 				}
	 			%>
				<label>Personal E-mail:</label>
				<input disabled class="fullwidth" id="pemail" name="pemail" type="email" placeholder="Personal Email Id" size=50
				title="Enter valid Email ID" pattern="[a-z0-9._]+@[a-z0-9.-]+\.[a-z]{2,3}$" value="<%out.print(pemailval); %>" required>		
				<br>
				
				
				
				<%
						String cemailval = "";
						if(session.getAttribute("cemailval")!=null){
							Cookie forName = new Cookie("cemailval",session.getAttribute("cemailval").toString());
							cemailval = forName.getValue();
						}
				%>
	 			
				<label>Company E-mail:</label>
				<input disabled class="fullwidth" id="cemail" name="cemail" type="email" placeholder="Company Email Id" size=50		
				title="Enter valid Email ID" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" value="<%out.print(cemailval); %>" required>
				<br>
					
				<%
						String contactval = "";
						if(session.getAttribute("contactnoval")!=null){
							Cookie forName = new Cookie("contactnoval",session.getAttribute("contactnoval").toString());
							contactval = forName.getValue();
						}
				%>
				
				<label>Contact Number:</label>
				<br>
				<select disabled id="cnumpre" name="cc" size=1>
						<option  value="+91">+91</option>
				</select>
				<input disabled class="contact" id="cnum" name="contactno" type="text" placeholder="Mobile Number"
				pattern="[7-9]{1}[0-9]{9}" value="<%out.print(contactval); %>"
				title="Invalid Contact Number" maxlength="10" required>
				<br>
				
				
				<%
						String waval = "";
						if(session.getAttribute("whatsappnoval")!=null){
							Cookie forName = new Cookie("whatsappnoval",session.getAttribute("whatsappnoval").toString());
							waval = forName.getValue();
						}
			
				%>
				
				<label>What'sapp Number:</label>
				<br>
				<select disabled id="wnumpre" name="cc" size=1>
						<option  value="+91">+91</option>
				</select>
				<input disabled class="contact" id="wnum" name="whatsappno" type="text" placeholder="What'sapp Number"
				pattern="[7-9]{1}[0-9]{9}" value="<%out.print(waval); %>"
				title="Invalid What's app Number" maxlength="10" required>
				<br>
					
				<%
						String gender = "";
						String genderm = "";
						String genderf= "";
						String gendero = "";
						if(session.getAttribute("genderval")!=null){
							Cookie forName = new Cookie("genderval",session.getAttribute("genderval").toString());
							gender = forName.getValue();
						}
						
						if(gender.contains("Male")){
							genderm="checked";
						}else{
							genderm="";
							if(gender.contains("Female")){
								genderf="checked";
								}else{
									genderf="";
									if(gender.contains("Others")){
										gendero="checked";
									}else{
										gendero="";
									}
								}
						}
				%>
				<label class="gendercaption" for="gender">Gender:</label>
				<div class="gendiv"><input disabled class="gender" id="mgender" type="radio" name="gender" value="Male" <%out.print(genderm);%> required><label class="genderlabel" for="mgender">Male</label></div>
				<div class="gendiv"><input disabled class="gender" id="fgender" type="radio" name="gender" value="Female" <%out.print(genderf);%>><label class="genderlabel" for="fgender">Female</label></div>
				<div class="gendiv"><input disabled class="gender" id="ogender" type="radio" name="gender" value="Others" <%out.print(gendero);%>><label class="genderlabel" for="ogender">Others</label></div>
				<br>
				
				
				<%
						String paymentmode = "";
						if(session.getAttribute("paymentmodeval")!=null){
							Cookie forName = new Cookie("paymentmodeval",session.getAttribute("paymentmodeval").toString());
							paymentmode = forName.getValue();
						}
				%> 		
	 			<%
						String paymenttype = "";
						String cash = "";
						String card = "";
						String chdd = "";
						if(session.getAttribute("paymentmodeval")!=null){
							Cookie forName = new Cookie("paymentmodeval",session.getAttribute("paymentmodeval").toString());
							paymenttype = forName.getValue();
						}
						
						if(paymenttype.contains("Cash")){
							cash="checked";
						}else{
							cash="";
							if(paymenttype.contains("Card")){
								card="checked";
								}else{
									card="";
									if(paymenttype.contains("Cheque/DD")){
										chdd="checked";
									}else{
										chdd="";
									}
								}
						}
				%>
				<label class="paymentcaption">Payment Details:</label>
	     	 	<div class="paydiv"><input disabled class="gender" id="cshpaymentmode" type="radio" name="payment" <%out.print(cash);%> 
	     	 	value="Cash" onclick="showcash();"  required><label class="paylabel" for="cshpaymentmode">Cash</label></div>
		 		<div class="paydiv"><input disabled class="gender" id="crdpaymentmode" type="radio" name="payment" <%out.print(card);%> 
		 		value="Card" onclick="showcard();"  ><label class="paylabel" for="crdpaymentmode">Card</label></div>
		  		<div class="paydiv"><input disabled class="gender" id="chddpaymentmode" type="radio" name="payment" <%out.print(chdd);%> 
		  		value="Cheque/DD" onclick="showchqdd();"><label class="paylabel" for="chddpaymentmode">Cheque/DD</label></div>
	        	
	        	
	        	
	        	<%
					String recval = "";
					if(session.getAttribute("reciptnoval")!=null){
						Cookie forName = new Cookie("reciptnoval",session.getAttribute("reciptnoval").toString());
						recval = forName.getValue();
					}
				%>
	        	<input disabled class="fullwidth" name="rcptno" type="text" id="rcptno" style="display: none;"  
	        	placeholder="Slip/Receipt Number" maxlength="30" value="<%out.print(recval); %>" >
				
				<%
						String transval = "";
						if(session.getAttribute("transnoval")!=null){
							Cookie forName = new Cookie("transnoval",session.getAttribute("transnoval").toString());
							transval = forName.getValue();
						}
						System.out.println("sdsaaa " + transval);
				%>
	        	<input disabled class="fullwidth" type="text" id="trnsno" style="display: none;" value="<%out.print(transval);%>" 
	        	name="transno" placeholder="Transaction ID" maxlength="30">               
	        	
	        	<%
						String chddval = "";
						if(session.getAttribute("chddnoval")!=null){
							Cookie forName = new Cookie("chddnoval",session.getAttribute("chddnoval").toString());
							chddval = forName.getValue();
						}
				%>
	        	<input disabled class="fullwidth" type="text" id="chddno" style="display: none;" value="<%out.print(chddval); %>"  
	        	name="chddno" placeholder="Cheque/DD Number" maxlength="30" >
	        	<font style="color:red" ><%--out.print(chddnoa);--%></font>
	        	
	        	
	        	<%
						String amtpval = "";
						if(session.getAttribute("amountpaidval")!=null){
							Cookie forName = new Cookie("amountpaidval",session.getAttribute("amountpaidval").toString());
							amtpval = forName.getValue();
						}
				%>
	        	<input disabled class="fullwidth" type="number" id="amtp" style="display: none;" value="<%out.print(amtpval); %>" 
	        	name="amtp" placeholder="Amount Paid">
	        	
				<%
						String amtbval = "";
						if(session.getAttribute("amountbalval")!=null){
							Cookie forName = new Cookie("amountbalval",session.getAttribute("amountbalval").toString());
							amtbval = forName.getValue();
						}
				%>

	        	<input disabled class="fullwidth" type="number" id="amtb" style="display: none;" value="<%out.print(amtbval); %>"  
	        	name="amtb" placeholder="Amount Balance">
				<br>
			
				<label>Upload Passport size photo:</label>		
				<input disabled class="fullwidth" id="photo" name="photo" type="file" accept="image/*">
				<span style="align : right">
				</span>
				<br>
		
			
				<div class="agreediv">
					<input disabled id="agreement" checked name="agreement" type="checkbox" value="2" required><label for="agreement" class="agreelabel">Agree to <a href="">Terms &amp; Conditions</a></label>
				</div>
				<br>
				<div class="actionbtndiv">
					<input disabled class="actionbtn" id="sub" type="submit" value="SUBMIT">
					<input disabled class="actionbtn" id="rex" type="button" onclick="window.location.replace('index.jsp')" value="RESET">
				</div>
		</form>
	</div>
</body>
</html>