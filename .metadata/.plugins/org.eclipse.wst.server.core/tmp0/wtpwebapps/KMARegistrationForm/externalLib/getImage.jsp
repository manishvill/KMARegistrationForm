<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.Blob"%>
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
	
	OutputStream show;
	byte[] imgData = null;
	
	int img_id = Integer.parseInt(request.getParameter("img_id"));
	
	Blob image = (Blob)map.get("photo").get(img_id);
	imgData = image.getBytes(1, (int)image.length());
	System.out.println("dsdsd " + imgData);
	response.setContentType("image/jpg");
	response.getOutputStream().write(imgData);
	response.getOutputStream().flush();
	response.getOutputStream().close();
	response.flushBuffer();
	out.clear();	
%>