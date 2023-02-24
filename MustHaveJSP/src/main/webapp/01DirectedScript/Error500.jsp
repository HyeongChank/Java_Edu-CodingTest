<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지시어-errorPage, isErrorPage 속성</title>
</head>
<body>
<%
int myAge = Integer.parseInt(request.getParameter("age")) + 10;
String name = request.getParameter("name");
//홈페이지 링크 뒤에 '?age = 15 넣으면 에러안남//
out.println("10년 후 당신의 나이는 " + myAge + "입니다.");
out.println("당신의 이름은 " + name + "입니다.");

%>
</body>
</html>