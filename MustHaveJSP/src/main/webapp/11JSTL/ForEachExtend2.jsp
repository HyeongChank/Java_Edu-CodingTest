<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="common.Person"%>
<%@page import="java.util.LinkedList"%>
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
	<h4>list 컬렉션 사용하기</h4>
	<%
	LinkedList<Person> lists = new LinkedList<Person>();
	lists.add(new Person("k", 34));
	lists.add(new Person("a", 3));
	lists.add(new Person("b", 4));
	
	%>
	<c:set var = "lists" value = "<%=lists %>"/>
	<c:forEach items = "${lists }" var = "list">
		<li>
			이름 : ${list.name }, 나이 : ${list.age }</li>
	</c:forEach>
	<h4>map</h4>
	<%
	Map<String,Person> maps = new HashMap<String, Person>();
	maps.put("1st", new Person("k",34));
	maps.put("2nd", new Person("z",4));
	maps.put("3rd", new Person("f",3));
	%>
	<c:set var = "maps" value = "<%=maps %>"/>
	<c:forEach items = "${maps }" var = "map">
		<li>Key => ${map.key }<br/>
			Value => 이름 : ${ map.value.name }, 나이 : ${map.value.age }</li>
	</c:forEach>
	
	<%
	LinkedList<Person> lk = new LinkedList<Person>();
	lk.add(new Person("sdsdsdf",31));
	lk.add(new Person("sdsdsdf",31));
	
	%>   	
	<c:set var = "lk" value = "<%=lk %>"/>
	<c:forEach items = "${lk }" var = "k">
		<li>이름 : ${k.name }</li>
	</c:forEach>
</body>
</html>