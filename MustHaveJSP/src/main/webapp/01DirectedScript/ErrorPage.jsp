<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    errorPage = "IsErrorPage.jsp"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int myAge = Integer.parseInt(request.getParameter("age")) + 10;
//홈페이지 링크 뒤에 '?age = 15 넣으면 에러안남//
out.println("10년 후 당신의 나이는 " + myAge + "입니다.");
%>
</body>
</html>