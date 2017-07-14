<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'create.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="save.html" method="post">
   <h2>ENTER DETAILS</h2><br><br>
    username:<input type="text" name="name"/><br><br>
     user id   :<input type="text" name="id"/><br><br>   
    user age:<input type="text" name="age"/><br><br>
    user    no:<input type="text" name="phoneno"/><br><br>
    useremail :<input type="text" name="mailid"/><br><br>
    <input type="submit" value="submit"/>
    ${msg}
 </form>
  </body>
</html>
