/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2017-09-10 14:41:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.omg.CORBA.portable.ResponseHandler;
import org.omg.CORBA.Request;
import java.io.PrintWriter;
import kma_registration_form_DB.CheckAvailability;
import java.sql.ResultSet;
import java.sql.Statement;
import kma_registration_form_DB.ConnectingMySqlDB;
import java.sql.Connection;
import java.io.File;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public final class index2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 if(session.getAttribute("nameval")==null){
	response.sendRedirect("index.jsp");
} 
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<title>KMA Registration Form</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"externalLib/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"externalLib/css/regForm.css\">\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\tfunction onLoad() {\r\n");
      out.write("\t\t\t\t\t\t\tif(document.getElementById('cshpaymentmode').checked){\r\n");
      out.write("\t\t\t\t\t\t\t\tdocument.getElementById('rcptno').style.display = 'block';\r\n");
      out.write("\t\t\t\t\t\t\t\tdocument.getElementById('amtp').style.display = 'block';\r\n");
      out.write("\t\t\t\t\t\t\t   \tdocument.getElementById('amtb').style.display = 'block';\r\n");
      out.write("\t\t\t\t\t\t\t   \tdocument.getElementById('chddno').style.display = 'none';\r\n");
      out.write("\t\t\t\t\t\t\t   \tdocument.getElementById('trnsno').style.display = 'none';\r\n");
      out.write("\t\t\t\t\t\t\t   \tdocument.getElementById('chddno').value = null;\r\n");
      out.write("\t\t\t\t\t\t\t \tdocument.getElementById('trnsno').value = null;\r\n");
      out.write("\t\t\t\t\t\t\t\tdocument.getElementById('rcptno').required = \"required\";\r\n");
      out.write("\t\t\t\t\t\t   \t\tdocument.getElementById('amtp').required = \"required\";\r\n");
      out.write("\t\t\t\t\t\t  \t\tdocument.getElementById('amtb').required = \"required\";\r\n");
      out.write("\t\t\t\t\t\t   \t\tdocument.getElementById('chddno').required = false;\r\n");
      out.write("\t\t\t\t\t\t\t   \tdocument.getElementById('trnsno').required = false;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\tif(document.getElementById('crdpaymentmode').checked){\r\n");
      out.write("\t\t\t\t\t\t\t\tdocument.getElementById('rcptno').style.display = 'block';\r\n");
      out.write("\t\t\t\t\t\t\t\tdocument.getElementById('chddno').style.display = 'none';\r\n");
      out.write("\t\t\t\t\t\t\t   \tdocument.getElementById('amtp').style.display = 'block';\r\n");
      out.write("\t\t\t\t\t\t\t   \tdocument.getElementById('amtb').style.display = 'block';\r\n");
      out.write("\t\t\t\t\t\t\t   \tdocument.getElementById('trnsno').style.display = 'block';\r\n");
      out.write("\t\t\t\t\t\t\t   \tdocument.getElementById('chddno').value = null;\r\n");
      out.write("\t\t\t\t\t\t\t   \t\r\n");
      out.write("\t\t\t\t\t\t\t   \tdocument.getElementById('rcptno').required = \"required\";\r\n");
      out.write("\t\t\t\t\t\t   \t\tdocument.getElementById('amtp').required = \"required\";\r\n");
      out.write("\t\t\t\t\t\t   \t\tdocument.getElementById('amtb').required = \"required\";\r\n");
      out.write("\t\t\t\t\t\t   \t\tdocument.getElementById('trnsno').required = \"required\";\r\n");
      out.write("\t\t\t\t\t\t   \t\tdocument.getElementById('chddno').required = false;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\tif(document.getElementById('chddpaymentmode').checked){\r\n");
      out.write("\t\t\t\t\t\t\t\tdocument.getElementById('rcptno').style.display = 'block';\r\n");
      out.write("\t\t\t\t\t\t\t\tdocument.getElementById('trnsno').style.display = 'none';\r\n");
      out.write("\t\t\t\t\t   \t\t\tdocument.getElementById('amtp').style.display = 'block';\r\n");
      out.write("\t\t\t\t\t   \t\t\tdocument.getElementById('amtb').style.display = 'block';\r\n");
      out.write("\t\t\t\t\t\t   \t\tdocument.getElementById('chddno').style.display = 'block';\r\n");
      out.write("\t\t\t\t\t\t\t\tdocument.getElementById('rcptno').required = \"required\";\r\n");
      out.write("\t\t\t\t\t   \t\t\tdocument.getElementById('trnsno').value = null;\r\n");
      out.write("\t\t\t\t\t   \t\t\t\r\n");
      out.write("\t\t\t\t\t   \t\t\tdocument.getElementById('amtp').required = \"required\";\r\n");
      out.write("\t\t\t\t\t   \t\t\tdocument.getElementById('amtb').required = \"required\";\r\n");
      out.write("\t\t\t\t\t\t   \t\tdocument.getElementById('chddno').required = \"required\";\r\n");
      out.write("\t\t\t\t\t\t   \t\tdocument.getElementById('trnsno').required = false;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("        \t\t\t\tfunction showcash() { \r\n");
      out.write("        \t\t\t\t\tdocument.getElementById('rcptno').style.display = 'block';\r\n");
      out.write("        \t\t\t\t   \tdocument.getElementById('amtp').style.display = 'block';\r\n");
      out.write("        \t\t\t\t   \tdocument.getElementById('amtb').style.display = 'block';\r\n");
      out.write("       \t\t\t\t   \t   \tdocument.getElementById('chddno').style.display = 'none';\r\n");
      out.write("       \t\t\t\t   \t\tdocument.getElementById('trnsno').style.display = 'none';\r\n");
      out.write("       \t\t\t\t   \t\t\r\n");
      out.write("       \t\t\t\t   \t\tdocument.getElementById('chddno').value = null;\r\n");
      out.write("   \t\t\t\t   \t\t\tdocument.getElementById('trnsno').value = null;\r\n");
      out.write("   \t\t\t\t   \t\t\t\r\n");
      out.write("       \t\t\t\t\t\tdocument.getElementById('rcptno').required = \"required\";\r\n");
      out.write(" \t\t\t\t   \t\t\tdocument.getElementById('amtp').required = \"required\";\r\n");
      out.write(" \t\t\t\t  \t\t\tdocument.getElementById('amtb').required = \"required\";\r\n");
      out.write("    \t\t\t\t   \t\tdocument.getElementById('chddno').required = false;\r\n");
      out.write("       \t\t\t\t   \t\tdocument.getElementById('trnsno').required = false;\r\n");
      out.write("       \t\t\t\t   \t}\r\n");
      out.write("       \t\t\t\t\t   \r\n");
      out.write("        \t\t\r\n");
      out.write("        \t\t\t\tfunction showcard() { \r\n");
      out.write("        \t\t\t\t\tdocument.getElementById('rcptno').style.display = 'block';\r\n");
      out.write("\t\t\t\t\t\t   \tdocument.getElementById('chddno').style.display = 'none';\r\n");
      out.write("\t\t\t\t\t\t   \tdocument.getElementById('amtp').style.display = 'block';\r\n");
      out.write("        \t\t\t\t   \tdocument.getElementById('amtb').style.display = 'block';\r\n");
      out.write("       \t\t\t\t   \t   \tdocument.getElementById('trnsno').style.display = 'block';\r\n");
      out.write("       \t\t\t\t   \t   \t\r\n");
      out.write("       \t\t\t\t   \t\tdocument.getElementById('chddno').value = null;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tif(document.getElementById('trnsno').value = \"null\"){\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.getElementById('trnsno').value = null;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("   \t\t\t\t   \t\t\t\r\n");
      out.write("   \t\t\t\t   \t\t\t\r\n");
      out.write("       \t\t\t\t   \t\tdocument.getElementById('rcptno').required = \"required\";\r\n");
      out.write("\t\t\t\t\t   \t\tdocument.getElementById('amtp').required = \"required\";\r\n");
      out.write("    \t\t\t\t   \t\tdocument.getElementById('amtb').required = \"required\";\r\n");
      out.write("    \t\t\t\t   \t\tdocument.getElementById('trnsno').required = \"required\";\r\n");
      out.write("    \t\t\t\t   \t\tdocument.getElementById('chddno').required = false;\r\n");
      out.write("    \t\t\t\t   \t}\r\n");
      out.write("        \t\t\r\n");
      out.write("        \t\t\t\tfunction showchqdd() { \r\n");
      out.write("        \t\t\t\t\tdocument.getElementById('rcptno').style.display = 'block';\r\n");
      out.write("\t\t\t\t   \t\t\tdocument.getElementById('trnsno').style.display = 'none';\r\n");
      out.write("\t\t\t\t   \t\t\tdocument.getElementById('amtp').style.display = 'block';\r\n");
      out.write("\t\t\t\t   \t\t\tdocument.getElementById('amtb').style.display = 'block';\r\n");
      out.write("\t\t\t   \t   \t\t\tdocument.getElementById('chddno').style.display = 'block';\r\n");
      out.write("\t\t\t   \t\t\t\tdocument.getElementById('rcptno').required = \"required\";\r\n");
      out.write("       \t\t\t\t   \t\t\r\n");
      out.write("   \t\t\t\t   \t\t\tdocument.getElementById('trnsno').value = null;\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tif(document.getElementById('chddno').value = \"null\"){\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.getElementById('chddno').value = null;\r\n");
      out.write("\t\t\t\t\t\t\t}\t\t\t   \t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t   \t\t\tdocument.getElementById('amtp').required = \"required\";\r\n");
      out.write("\t\t\t\t   \t\t\tdocument.getElementById('amtb').required = \"required\";\r\n");
      out.write("\t\t\t   \t   \t\t\tdocument.getElementById('chddno').required = \"required\";\r\n");
      out.write("\t\t\t   \t   \t\t\tdocument.getElementById('trnsno').required = false;\r\n");
      out.write("\t\t\t   \t   \t\t}\r\n");
      out.write("        \t\t\t\t\r\n");
      out.write("        \t\t\t\tfunction copyvaluemail(){\r\n");
      out.write("        \t\t\t\t\tvar ischeck = document.getElementById('sameasabovee').checked;\r\n");
      out.write("        \t\t\t\t\tif(document.getElementById('cemail').value == null || document.getElementById('cemail').value ==\"\"){\r\n");
      out.write("        \t\t\t\t\t\tdocument.getElementById('cemail').value = document.getElementById('pemail').value;\r\n");
      out.write("        \t\t\t\t\t}\r\n");
      out.write("        \t\t\t\t\tif(document.getElementById('cemail').value !=null || document.getElementById('cemail').value !=\"\"){\r\n");
      out.write("        \t\t\t\t\t\tdocument.getElementById('cemail').value = document.getElementById('pemail').value;\r\n");
      out.write("        \t\t\t\t\t}\r\n");
      out.write("        \t\t\t\t\tif(!ischeck){\r\n");
      out.write("        \t\t\t\t\t\tdocument.getElementById('cemail').value = null;\r\n");
      out.write("        \t\t\t\t\t}\r\n");
      out.write("        \t\t\t\t}\r\n");
      out.write("        \t\t\t\t\r\n");
      out.write("        \t\t\t\tfunction copyvaluecontact(){\r\n");
      out.write("        \t\t\t\t\tvar ischeck = document.getElementById('sameasabovec').checked;\r\n");
      out.write("        \t\t\t\t\tif(document.getElementById('wnum').value == null || document.getElementById('wnum').value ==\"\"){\r\n");
      out.write("        \t\t\t\t\t\tdocument.getElementById('wnum').value = document.getElementById('cnum').value;\r\n");
      out.write("        \t\t\t\t\t}\r\n");
      out.write("        \t\t\t\t\tif(document.getElementById('wnum').value !=null || document.getElementById('wnum').value !=\"\"){\r\n");
      out.write("        \t\t\t\t\t\tdocument.getElementById('wnum').value = document.getElementById('cnum').value;\r\n");
      out.write("        \t\t\t\t\t}\r\n");
      out.write("        \t\t\t\t\tif(!ischeck){\r\n");
      out.write("        \t\t\t\t\t\tdocument.getElementById('wnum').value = null;\r\n");
      out.write("        \t\t\t\t\t}\r\n");
      out.write("        \t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("      \t\t\t</script>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\tlabel{\r\n");
      out.write("\t\t\twidth: 30%;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.warn{\r\n");
      out.write("\t\t\twidth: 65%;\r\n");
      out.write("\t\t\ttext-align : right;\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tcolor: red;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.invalidgen{\r\n");
      out.write("\t\t\twidth : 100%;\r\n");
      out.write("\t\t\tmargin : 10px 0px 1px 0px;\r\n");
      out.write("\t\t\ttext-align : right;\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tcolor: red;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.paywarn{\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t\ttext-align : right;\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tcolor: red;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body onload=\"onLoad();\">\r\n");
      out.write("\t<h3 align=\"right\" style=\"margin-right:10vh;\"><a style=\"cursor : pointer;\" onclick=\"window.open('admin.jsp')\">Admin</a></h3>\r\n");
      out.write("\t<div><header style=\"text-align:center;\"><h1><b>Registration Form</b></h1></header></div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"form\">\r\n");
      out.write("\t\t<form action=\"CheckAvailability\" enctype=\"multipart/form-data\"  method=\"POST\">\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t");
		System.out.println("session_id " + session.getId());
						session.setAttribute("session_id", session.getId());
		 				String nameval = "";
		 				if(session.getAttribute("nameval")!=null){
		 					Cookie forName = new Cookie("nameval",session.getAttribute("nameval").toString());
		 					nameval = forName.getValue();
		 				}
 				
      out.write("\r\n");
      out.write("\t\t\t\t<label for=\"name\">Name:</label>\r\n");
      out.write("\t\t\t\t");

						if(session.getAttribute("invalidname")!=null){
							out.print("<label class='warn'>"+session.getAttribute("invalidname")+"</label>");
						}
				
      out.write("\r\n");
      out.write("\t\t\t\t<input class=\"fullwidth\" name=\"name\" type=\"text\" placeholder=\"Full Name\" size=50 value=\"");
out.print(nameval); 
      out.write("\"\r\n");
      out.write("\t\t\t\ttitle=\"enter firstname\" pattern=\"[a-zA-Z ]+[a-zA-Z. ]\" title=\"Numbers not allowed\" id=\"name\" required>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
 
		 				String dateval = "";
		 				if(session.getAttribute("dobval")!=null){
			 				Cookie forName = new Cookie("dobval",session.getAttribute("dobval").toString());
			 				dateval = forName.getValue();
		 				}
 				
      out.write("\r\n");
      out.write("\t\t\t\t<label>DOB:</label>\r\n");
      out.write("\t\t\t\t<input class=\"fullwidth\" id=\"dob\" name=\"dob\" type=\"date\" placeholder=\"dd-MM-yyyy\" value=\"");
out.print(dateval); 
      out.write("\" required/>\r\n");
      out.write("\t\t\t\t<br>\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
 
		 				String pemailval = "";
		 					if(session.getAttribute("pemailval")!=null){
								Cookie forName = new Cookie("pemailval",session.getAttribute("pemailval").toString());
		 						pemailval = forName.getValue();
		 				}
	 			
      out.write("\r\n");
      out.write("\t\t\t\t<label>Personal E-mail:</label>\r\n");
      out.write("\t\t\t\t");

							if(session.getAttribute("invalidpemail")!=null){
								out.print("<label class='warn'>"+session.getAttribute("invalidpemail")+"</label>");
							}
				
      out.write("\r\n");
      out.write("\t\t\t\t");

						String pemailaval = "";
						if(session.getAttribute("personal_email") != null){
							//pemailaval = session.getAttribute("personal_email").toString();
							out.print("<label class='warn'>"+session.getAttribute("personal_email")+"</label>");
						}
				
      out.write("\r\n");
      out.write("\t\t\t\t<input class=\"fullwidth\" id=\"pemail\" name=\"pemail\" type=\"email\" placeholder=\"Personal Email Id\" size=50\r\n");
      out.write("\t\t\t\ttitle=\"Enter valid Email ID\" pattern=\"[a-z0-9._]+@[a-z0-9.-]+\\.[a-z]{2,3}$\" value=\"");
out.print(pemailval); 
      out.write("\" required>\t\t\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");

						String cemailval = "";
						if(session.getAttribute("cemailval")!=null){
							Cookie forName = new Cookie("cemailval",session.getAttribute("cemailval").toString());
							cemailval = forName.getValue();
						}
				
      out.write("\r\n");
      out.write("\t \t\t\t\r\n");
      out.write("\t\t\t\t<label>Company E-mail:</label>\r\n");
      out.write("\t\t\t\t");

							if(session.getAttribute("invalidcemail")!=null){
								out.print("<label class='warn'>"+session.getAttribute("invalidcemail")+"</label>");
							}
				
      out.write("\r\n");
      out.write("\t\t\t\t");

						String cemailaval = "";
						if(session.getAttribute("company_email") != null){
							//cemailaval = session.getAttribute("company_email").toString();
							out.print("<label class='warn'>"+session.getAttribute("company_email")+"</label>");
						}
				
      out.write("\r\n");
      out.write("\t\t\t\t<input class=\"fullwidth\" id=\"cemail\" name=\"cemail\" type=\"email\" placeholder=\"Company Email Id\" size=50\t\t\r\n");
      out.write("\t\t\t\ttitle=\"Enter valid Email ID\" pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$\" value=\"");
out.print(cemailval); 
      out.write("\" required>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"samediv\">\r\n");
      out.write("\t\t\t\t<input class=\"samecheck\" id=\"sameasabovee\" name=\"sameasaboveemail\" type=\"checkbox\" placeholder=\"Same as peronsal Email ID\" onclick=\"copyvaluemail();\">\r\n");
      out.write("\t\t\t\t<label class=\"sameasabove\" for=\"sameasaboveemail\">Same as above</label>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");

						String contactval = "";
						if(session.getAttribute("contactnoval")!=null){
							Cookie forName = new Cookie("contactnoval",session.getAttribute("contactnoval").toString());
							contactval = forName.getValue();
						}
				
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<label>Contact Number:</label>");

							if(session.getAttribute("invalidcont")!=null){
								out.print("<label class='warn'>"+session.getAttribute("invalidcont")+"</label>");
							}
				
      out.write("\r\n");
      out.write("\t\t\t\t");

						String contactaval = "";
						if(session.getAttribute("contactnoa") != null){
							//contactaval = session.getAttribute("contactnoa").toString();
							out.print("<label class='warn'>"+session.getAttribute("contactnoa")+"</label>");
						}
				
      out.write("\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<select id=\"cnumpre\" name=\"cc\" size=1>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"+91\">+91</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t<input class=\"contact\" id=\"cnum\" name=\"contactno\" type=\"text\" placeholder=\"Mobile Number\"\r\n");
      out.write("\t\t\t\tpattern=\"[7-9]{1}[0-9]{9}\" value=\"");
out.print(contactval); 
      out.write("\"\r\n");
      out.write("\t\t\t\ttitle=\"Invalid Contact Number\" maxlength=\"10\" required>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");

						String waval = "";
						if(session.getAttribute("whatsappnoval")!=null){
							Cookie forName = new Cookie("whatsappnoval",session.getAttribute("whatsappnoval").toString());
							waval = forName.getValue();
						}
			
				
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<label>What'sapp Number:</label>\r\n");
      out.write("\t\t\t\t");

							if(session.getAttribute("invalidwano")!=null){
								out.print("<label class='warn'>"+session.getAttribute("invalidwano")+"</label>");
							}
				
      out.write("\r\n");
      out.write("\t\t\t\t");

						String waaval = "";
						if(session.getAttribute("whatsappnoa") != null){
							//waaval = session.getAttribute("whatsappnoa").toString();
							out.print("<label class='warn'>"+session.getAttribute("whatsappnoa")+"</label>");
						}
				
      out.write("\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<select id=\"wnumpre\" name=\"cc\" size=1>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"+91\">+91</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t<input class=\"contact\" id=\"wnum\" name=\"whatsappno\" type=\"text\" placeholder=\"What'sapp Number\"\r\n");
      out.write("\t\t\t\tpattern=\"[7-9]{1}[0-9]{9}\" value=\"");
out.print(waval); 
      out.write("\"\r\n");
      out.write("\t\t\t\ttitle=\"Invalid What's app Number\" maxlength=\"10\" required>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"samediv\">\r\n");
      out.write("\t\t\t\t<input class=\"samecheck\" name=\"sameasabovecontact\" type=\"checkbox\" id=\"sameasabovec\"\r\n");
      out.write("\t\t\t\tplaceholder=\"Same as contact number\" onclick=\"copyvaluecontact();\">\r\n");
      out.write("\t\t\t\t<label class=\"sameasabove\" for=\"sameasabovecontact\">Same as above</label>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");

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
				
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");

						if(session.getAttribute("invalidgen")!=null){
							out.print("<br><label class='invalidgen'>"+session.getAttribute("invalidgen")+"</label><br>");
						}
				
      out.write("\r\n");
      out.write("\t\t\t\t<label class=\"gendercaption\" for=\"gender\">Gender:</label>\r\n");
      out.write("\t\t\t\t<div class=\"gendiv\"><input class=\"gender\" id=\"mgender\" type=\"radio\" name=\"gender\" value=\"Male\" ");
out.print(genderm);
      out.write(" required><label class=\"genderlabel\" for=\"mgender\">Male</label></div>\r\n");
      out.write("\t\t\t\t<div class=\"gendiv\"><input class=\"gender\" id=\"fgender\" type=\"radio\" name=\"gender\" value=\"Female\" ");
out.print(genderf);
      out.write("><label class=\"genderlabel\" for=\"fgender\">Female</label></div>\r\n");
      out.write("\t\t\t\t<div class=\"gendiv\"><input class=\"gender\" id=\"ogender\" type=\"radio\" name=\"gender\" value=\"Others\" ");
out.print(gendero);
      out.write("><label class=\"genderlabel\" for=\"ogender\">Others</label></div>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");

						String paymentmode = "";
						if(session.getAttribute("paymentmodeval")!=null){
							Cookie forName = new Cookie("paymentmodeval",session.getAttribute("paymentmodeval").toString());
							paymentmode = forName.getValue();
						}
				
      out.write(" \t\t\r\n");
      out.write("\t \t\t\t");

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
				
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");

						if(session.getAttribute("invalidpaym")!=null){
							out.print("<br><label class='invalidgen'>"+session.getAttribute("invalidpaym")+"</label><br>");
						}
				
      out.write("\r\n");
      out.write("\t\t\t\t<label class=\"paymentcaption\">Payment Details:</label>\r\n");
      out.write("\t     \t \t<div class=\"paydiv\"><input class=\"gender\" id=\"cshpaymentmode\" type=\"radio\" name=\"payment\" ");
out.print(cash);
      out.write(" \r\n");
      out.write("\t     \t \tvalue=\"Cash\" onclick=\"showcash();\"  required><label class=\"paylabel\" for=\"cshpaymentmode\">Cash</label></div>\r\n");
      out.write("\t\t \t\t<div class=\"paydiv\"><input class=\"gender\" id=\"crdpaymentmode\" type=\"radio\" name=\"payment\" ");
out.print(card);
      out.write(" \r\n");
      out.write("\t\t \t\tvalue=\"Card\" onclick=\"showcard();\"  ><label class=\"paylabel\" for=\"crdpaymentmode\">Card</label></div>\r\n");
      out.write("\t\t  \t\t<div class=\"paydiv\"><input class=\"gender\" id=\"chddpaymentmode\" type=\"radio\" name=\"payment\" ");
out.print(chdd);
      out.write(" \r\n");
      out.write("\t\t  \t\tvalue=\"Cheque/DD\" onclick=\"showchqdd();\"><label class=\"paylabel\" for=\"chddpaymentmode\">Cheque/DD</label></div>\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        \t");

					String recval = "";
					if(session.getAttribute("reciptnoval")!=null){
						Cookie forName = new Cookie("reciptnoval",session.getAttribute("reciptnoval").toString());
						recval = forName.getValue();
					}
				
      out.write("\r\n");
      out.write("\t  \t\t\t");

					String rcptnoa = "";
					if(session.getAttribute("rcptnoa") != null){
						rcptnoa = session.getAttribute("rcptnoa").toString();
					}
				
      out.write("\r\n");
      out.write("\t\t\t\t");

					if(session.getAttribute("invalidrcpt")!=null){
						out.print("<label class='paywarn'>"+session.getAttribute("invalidrcpt")+"</label>");
					}
				
      out.write("\r\n");
      out.write("\t        \t<input class=\"fullwidth\" name=\"rcptno\" type=\"text\" id=\"rcptno\" style=\"display: none;\"  \r\n");
      out.write("\t        \tplaceholder=\"Slip/Receipt Number\" maxlength=\"30\" value=\"");
out.print(recval); 
      out.write("\" >\r\n");
      out.write("\t\t\t\t");
 out.println(rcptnoa); 
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");

						String transval = "";
						if(session.getAttribute("transnoval")!=null){
							Cookie forName = new Cookie("transnoval",session.getAttribute("transnoval").toString());
							transval = forName.getValue();
						}
						System.out.println("sdsaaa " + transval);
				
      out.write("\r\n");
      out.write("        \t\t");

						String transnoa = "";
						if(session.getAttribute("transnoa") != null){
							rcptnoa = session.getAttribute("transnoa").toString();
						}
				
      out.write("\r\n");
      out.write("\t\t\t\t");

						if(session.getAttribute("invalidtransNo")!=null){
							out.print("<label class='paywarn'>"+session.getAttribute("invalidtransNo")+"</label>");
						}
				
      out.write("\r\n");
      out.write("\t        \t<input class=\"fullwidth\" type=\"text\" id=\"trnsno\" style=\"display: none;\" value=\"");
out.print(transval);
      out.write("\" \r\n");
      out.write("\t        \tname=\"transno\" placeholder=\"Transaction ID\" maxlength=\"30\">               \r\n");
      out.write("\t        \t<font style=\"color:red\" >");
out.print(transnoa);
      out.write("</font>\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        \t");

						String chddval = "";
						if(session.getAttribute("chddnoval")!=null){
							Cookie forName = new Cookie("chddnoval",session.getAttribute("chddnoval").toString());
							chddval = forName.getValue();
						}
				
      out.write("\r\n");
      out.write("        \t\t\r\n");
      out.write("        \t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");

						if(session.getAttribute("invalidchqNo")!=null){
							out.print("<label class='paywarn'>"+session.getAttribute("invalidchqNo")+"</label>");
						}
				
      out.write("\r\n");
      out.write("\t        \t<input class=\"fullwidth\" type=\"text\" id=\"chddno\" style=\"display: none;\" value=\"");
out.print(chddval); 
      out.write("\"  \r\n");
      out.write("\t        \tname=\"chddno\" placeholder=\"Cheque/DD Number\" maxlength=\"30\" >\r\n");
      out.write("\t        \t<font style=\"color:red\" >");
      out.write("</font>\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        \t");

						String amtpval = "";
						if(session.getAttribute("amountpaidval")!=null){
							Cookie forName = new Cookie("amountpaidval",session.getAttribute("amountpaidval").toString());
							amtpval = forName.getValue();
						}
				
      out.write("\r\n");
      out.write("\t\t\t\t");

						if(session.getAttribute("invalidamtp")!=null){
							out.print("<label class='paywarn'>"+session.getAttribute("invalidamtp")+"</label>");
						}
				
      out.write("\r\n");
      out.write("\t        \t<input class=\"fullwidth\" type=\"number\" id=\"amtp\" style=\"display: none;\" value=\"");
out.print(amtpval); 
      out.write("\" \r\n");
      out.write("\t        \tname=\"amtp\" placeholder=\"Amount Paid\">\r\n");
      out.write("\t        \t\r\n");
      out.write("\t\t\t\t");

						String amtbval = "";
						if(session.getAttribute("amountbalval")!=null){
							Cookie forName = new Cookie("amountbalval",session.getAttribute("amountbalval").toString());
							amtbval = forName.getValue();
						}
				
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");

						if(session.getAttribute("invalidamtb")!=null){
							out.print("<label class='paywarn'>"+session.getAttribute("invalidamtb")+"</label>");
						}
				
      out.write("\r\n");
      out.write("\t        \t<input class=\"fullwidth\" type=\"number\" id=\"amtb\" style=\"display: none;\" value=\"");
out.print(amtbval); 
      out.write("\"  \r\n");
      out.write("\t        \tname=\"amtb\" placeholder=\"Amount Balance\">\r\n");
      out.write("\t    \t\t\r\n");
      out.write("\t\t\t\t");

						String imgval = "";
						if(session.getAttribute("photoval")!=null){
							Cookie forName = new Cookie("photoval",session.getAttribute("photoval").toString());
							imgval = forName.getValue();
						}
				
      out.write("<br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<label>Upload Passport size photo:</label>\t\t\r\n");
      out.write("\t\t\t\t");

						if(session.getAttribute("invalidimgs")!=null){
							out.print("<label class='warn'>"+session.getAttribute("invalidimgs")+"</label>");
						}
						if(session.getAttribute("invalidimg")!=null){
							out.print("<label class='warn'>"+session.getAttribute("invalidimg")+"</label>");
						}
				
      out.write("\t\r\n");
      out.write("\t\t\t\t<input class=\"fullwidth\" id=\"photo\" name=\"photo\" type=\"file\" accept=\"image/*\">\r\n");
      out.write("\t\t\t\t<span style=\"align : right\">\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"agreediv\">\r\n");
      out.write("\t\t\t\t\t<input id=\"agreement\" name=\"agreement\" type=\"checkbox\" value=\"2\" required><label for=\"agreement\" class=\"agreelabel\">Agree to <a href=\"\">Terms &amp; Conditions</a></label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");

						String hidden="";
						if(session.getAttribute("Error")!=null){
							hidden="hidden=''";
						}else{hidden="";}
				
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"actionbtndiv\">\r\n");
      out.write("\t\t\t\t\t<input class=\"actionbtn\" id=\"sub\" type=\"submit\" ");
out.print(hidden);
      out.write(" value=\"SUBMIT\">\r\n");
      out.write("\t\t\t\t\t<input class=\"actionbtn\" id=\"rex\" type=\"button\" onclick=\"window.location.replace('index.jsp')\" value=\"RESET\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<font color=red size=5>\r\n");
      out.write("\t\t\t\t\t\t<b>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

										if(session.getAttribute("Error")!=null){
											out.print(session.getAttribute("Error"));
										}
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</b>\r\n");
      out.write("\t\t\t\t</font>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<h3 align=\"center\" style=\"margin-right:10vh;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<font color=\"red\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
if(session.getAttribute("NOSERVER")!=null){out.println(session.getAttribute("NOSERVER"));}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</font>\r\n");
      out.write("\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
