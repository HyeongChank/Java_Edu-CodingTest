<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
request.setCharacterEncoding("UTF-8");
int col= Integer.parseInt(request.getParameter("col"));

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "./gugudan.jsp" method ="post">
		<h2>구구단2</h2>
		<% for(int i=1; i<=9; i++){ %>
		<% for(int k=0; k<1;k++){ %><br/>
		<% for(int j=2 ; j<col+1; j++){%>
		<% 	out.print(j + "*" + i);%>
		<% } %>
		<% }%>
		<% }%>
	</form>
	
	
	
</body>
</html>