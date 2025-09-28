<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Welcome Home page!
	<h4><a href="register">Click to Register</a></h4>
	<br>

	<%
	String name = (String) request.getAttribute("name");
	int roll = (Integer) request.getAttribute("roll");
	List<String> cloList = (List<String>) request.getAttribute("cloList");
	%>

	<h3>
		Name :
		<%=name%>
	</h3>
	<h4>
		Roll :
		<%=roll%>
	</h4>
	<b>Colors</b>:
	<%
	for (String s : cloList) {
	%>

	<div style="font-size: large; color: fuchsia;"><%=s%></div>
	<br>

	<%
	}
	%>

	<a href="login">login</a>
</body>
</html>