<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
pageContext.setAttribute("scopeValue", "페이지 영역");
request.setAttribute("scopeValue", "리퀘스트 영역22");
session.setAttribute("scopeValue", "세션 영역");
application.setAttribute("scopeValue", "애플리케이션 영역");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>ImplicitIobjmain</h2>
	<h3>각 영역에 저장된 속성 읽기</h3>
	<ul>
		<li>페이지 영역 : ${pageScope.scopeValue}</li>
		<li>리퀘스트 영역 : ${requestScope.scopeValue}</li>
		<li>세션 영역 : ${sessionScope.scopeValue}</li>
		<li>애플리케이션 영역 : ${applicationScope.scopeValue}</li>
	</ul>
	<h3>영역 지정 없이 속성 읽기</h3>
	<ul>
	<%--scope 영역 작은 거부터 찾음 --%>
		<li> ${scopeValue}</li>
	</ul>
	<%--page 영역은 포워드되면 소멸되고 새로 만들어짐에 따라 기존 page 영역에 저장해둔 값은 읽을 수 없음 --%>
		<jsp:forward page="ImplicitForwardResult.jsp"/>
</body>
</html>