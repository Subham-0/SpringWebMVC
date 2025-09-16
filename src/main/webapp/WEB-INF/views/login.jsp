<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
	String className = (String) request.getAttribute("className");
	Integer sec = (Integer) request.getAttribute("section");
	List<String> allName = (List<String>) request.getAttribute("allnames");
	%>
	<%--using expression language-->
	<h4>Class : <%=className%></h4>
	<h4>Session :<%=sec%></h4>
	<h4>AllNames :<%=allName%></h4>  --%>

<%--using jstl(java scriptlet tag library --%>
	<%-- <h4>Class :${className}</h4>
	<h4>Session :${section}</h4>
	<h4>AllNames :${allnames}</h4> --%>

	<c:forEach items="${allnames }" var="s">
		<h3>
			<c:out value="${s }"></c:out>
		</h3>
	</c:forEach>
	
	

</body>
</html>