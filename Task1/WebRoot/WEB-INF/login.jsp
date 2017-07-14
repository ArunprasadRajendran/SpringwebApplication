
<%String block = (String) request.getAttribute("msg");
System.out.println(block);
%>
<form action="view.html"method="POST">
<h2>login</h2><font color="red">
${msg}</font><br>
username:<input type="text" name="username"/>
<br><br>
password:<input type="password" name="password"/><br>
<br>
<input type="submit" value="login"/>
</form>
