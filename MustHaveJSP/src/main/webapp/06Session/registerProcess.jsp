<%@page import="membership.MemberDTO"%>
<%@page import="membership.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//loginform 에서 받은 정보
String userId = request.getParameter("user_id");
String userPwd = request.getParameter("user_pw");
String userName = request.getParameter("user_name");

//jdbcconnect 에서 받은 정보
String driver = application.getInitParameter("mysqlDriver");
String url = application.getInitParameter("mysqlURL");
String id = application.getInitParameter("mysqlId");
String pwd = application.getInitParameter("mysqlPwd");



//dao, dto 생성해서 dto에 loginform 에서 불러온 id, pwd name 넣음
MemberDAO dao = new MemberDAO(driver, url, id, pwd);
MemberDTO dto = new MemberDTO();
dto.setId(userId);
dto.setPass(userPwd);
dto.setName(userName);

//jdb 연결해서 dto 명령문 입력
int iResult = dao.regitMemberDTO(dto);
dao.close();

%>
<h2>id : <%=userId%></h2>
<h2>pwd : <%=userPwd%></h2>
<h2>nama : <%=userName%></h2>
<h2>DB에 등록되었습니다</h2>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>




</body>
</html>