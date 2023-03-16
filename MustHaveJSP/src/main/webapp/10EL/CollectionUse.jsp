<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="common.Person"%>
<%@page import="el.MyELClass"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% MyELClass mc = new MyELClass(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>list 컬렉션</h2>
	<%
	List<Object> alist = new ArrayList<Object>();
	alist.add("청해진");
	alist.add(new Person("장보고", 28));
	pageContext.setAttribute("Ocean",alist);
	%>
	<ul>
		<li>0번째 요소 : ${Ocean[0] }</li>
		<li>1번째 요소 : ${Ocean[1].name }, ${Ocean[1].age }</li>
		<li>2번째 요소 : ${Ocean[2] }</li>
	</ul>
	<h2>Map 컬렉션</h2>
	<%
	Map<String, String> map = new HashMap<String, String>();
	map.put("한글", "훈민정음");
	map.put("Eng", "English");
	pageContext.setAttribute("King", map);
	%>
	<ul>
		<li>영문 key : ${King["Eng"] }, ${King['Eng'] }, ${King.Eng }</li>
		<li>한글 Key : ${King["한글"] }, ${King['한글'] }, ${King.한글} </li>
	</ul>
</body>
</html>