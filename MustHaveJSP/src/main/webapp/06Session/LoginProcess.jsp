
<%@page import="membership.MemberDTO"%>
<%@page import="membership.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//loginform 에서 받은 정보
String userId = request.getParameter("user_id");
String userPwd = request.getParameter("user_pw");

//jdbcconnect 에서 받은 정보
String driver = application.getInitParameter("mysqlDriver");
String url = application.getInitParameter("mysqlURL");
String id = application.getInitParameter("mysqlId");
String pwd = application.getInitParameter("mysqlPwd");


//dao 생성자
MemberDAO dao = new MemberDAO(driver, url, id, pwd);

//dto
MemberDTO memberDTO = dao.getMemberDTO(userId, userPwd);

dao.close();


if(memberDTO.getId() != null){
	session.setAttribute("UserId", memberDTO.getId());
	session.setAttribute("UserName", memberDTO.getName());
	response.sendRedirect("LoginForm.jsp");
	
}

else{
	request.setAttribute("LoginErrMsg","로그인 오류입니다");
	request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>




</body>
</html>