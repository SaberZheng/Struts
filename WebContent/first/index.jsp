<%@ page language="java"  pageEncoding="UTF-8" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Apache Struts</title>
</head>
<body>

	<h1>Apache Struts</h1>
	
	<a href="http://struts.apache.org">Apache Struts</a>
	
	<br>
	
	<a href="http://commons.apache.org">Apache Commons</a>
	
	<br>
	
	<form action="${ pageContext.request.contextPath }/customer/register" method="post" >
			<input type="text" name="username" placeholder="用户名">
			<input type="password" name="password" placeholder="密码">
			<input type="password" name="confirm" placeholder="确认密码">
			性别:
			<input type="radio" name="gender" value="女" >女
			<input type="radio" name="gender" value="男" >男
			<input type="submit" >
	</form>
	
	<hr>
	
	<s:debug />

</body>
</html>
