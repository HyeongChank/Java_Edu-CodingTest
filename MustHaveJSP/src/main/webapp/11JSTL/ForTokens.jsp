<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String rgba = "red, green, blue, black";
	%>
	<h4>jstl의 fortokens</h4>
	<c:forTokens items = "<%=rgba %>" delims = "," var = "color">
		<span style = "color: ${color};">${color }</span><br/>
	</c:forTokens>
	
</body>
</html>