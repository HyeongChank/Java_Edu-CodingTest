<%@ page import = "java.sql.PreparedStatement"%>
<%@page import="common.JDBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../Common/Link.jsp"/>
	<h2>로그인 페이지</h2>
	<span style = "color: red; font-size: 1.2em;">
	<%= request.getAttribute("LoginErrMsg") ==null ?
			"" : request.getAttribute("LoginErrMsg") %>
			</span>
	<%
	if(session.getAttribute("UserId")== null){
		
	%>
	<script>
	function validateForm(form){
		if(!form.user_id.value){
			alert("아이디를 입력하세요.");
			return false;
		}
		if(form.user_pw.value==""){
			alert("패스워드를 입력하세요");
			return false;
		}
	}
	function bt_oc(){
		alert("jjjjjjjjjjjjjjjjjjj");
		
	}
	
	
	
	alert("user_id" + "user_pw");
	</script>
	
	<form action = "LoginProcess.jsp" method = "post" name = "LoginFrm"
	onsubmit = "return validateForm(this);">
	아이디 : <input type = "text" name = "user_id"/><br/>
	패스워드 : <input type = "password" name = "user_pw"/><br/>
	<input type = "submit" value = "로그인하기"/>
	<input type = "button" name = "user_bt" value = "등록하기" onclick = "bt_oc();"/>
	</form>
	
	<form action = "registerProcess.jsp" method = "post" name = "regitFrm"
	onsubmit = "return validateForm(this);">
	아이디 : <input type = "text" name = "user_id"/><br/>
	패스워드 : <input type = "password" name = "user_pw"/><br/>
	이름 : <input type = "text" name = "user_name"/><br/>
	<input type = "submit" value = "등록하기"/>
	
	<%
	}else{
		%>	
	<%= session.getAttribute("UserName") %> 회원님, 로그인하셨습니다.<br/>
	<a href = "Logout.jsp">[로그아웃]</a>
	<%
	}
	%>
	


	
</body>
</html>