<%@page import="membership.MemberDTO"%>
<%@page import="membership.MemberDAO"%>
<%@page import="model1.board.BoardDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model1.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
BoardDAO dao = new BoardDAO(application);
List<BoardDTO> alist = dao.selectList(null);
request.setAttribute("alist", alist);
MemberDAO mdao = new MemberDAO(application);
List<MemberDTO> mlist = mdao.selectList(null);
request.setAttribute("mlist", mlist);

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border ="1">
<% for(int idx = 0; idx < alist.size(); idx++){
		pageContext.setAttribute("idx",idx); %>

	<tr>
		<td>${alist[idx].num }</td>
		<td>${alist[idx].title }</td>
		<td>${alist[idx].content }</td>
		<td>${alist[idx].id }</td>
		<td>${alist[idx].postdate }</td>
		<td>${alist[idx].visitcount }</td><br/>
	</tr>
	</table>
<% } %>	
<% out.println(alist.size());

%>
<%
for(int i=0; i<10;i++){
	pageContext.setAttribute("i",i);%>
	${i}
<% } %><br/>
<% out.println(mlist.size()); %>

<table border ="1">
<% for(int idx = 0; idx < mlist.size(); idx++){
		pageContext.setAttribute("idx",idx); %>

	<tr>
		<td>${mlist[idx].id }</td>
		<td>${mlist[idx].pass }</td>
		<td>${mlist[idx].name }</td><br/>

	</tr>
	</table>
<% } %>	



</body>
</html>