<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
request.setCharacterEncoding("UTF-8");
int dan= Integer.parseInt(request.getParameter("dan"));

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form>
		<h2>구구단</h2>
		<% for(int i=0;i<9;i++){ %>
		<% 
		int id = Integer.parseInt(request.getParameter("dancol"));
	
		dan = id;
		out.print(dan + "*" + i + "=" + i*dan); %><br/>
		<% } %>
	</form>
	
</body>
</html>