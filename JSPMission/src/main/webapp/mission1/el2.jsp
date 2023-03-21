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
<!-- request 저장되어 있는 값 호출 -->
	<h1>${ar1 }</h1>
<!-- for문은 forEach -->
<!-- el 을 " " 안에 넣어야 함 -->
	<c:forEach var ="i" begin = "0" end = "${ty2 }" >
		<p>${array[i]}</p>
		
	</c:forEach>
<!-- hash 값은 requestScope로 받아와야함 -->
	<c:forEach var="i" items="${requestScope.hm}" >
		${i.value }
	</c:forEach>
	<h1>${ty }</h1>	
	<h1>${ty2}</h1>
	<h1>dkfjdkfj</h1>
	
</body>
</html>