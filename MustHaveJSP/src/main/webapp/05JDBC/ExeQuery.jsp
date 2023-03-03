<%@ page import = "java.sql.ResultSet"%>
<%@ page import = "java.sql.Statement"%>
<%@ page import = "java.sql.Connection"%>
<%@ page import = "common.JDBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 목록 조회 테스트(executeQuery() 사용)</h2>

	<%
	JDBConnect jdbc = new JDBConnect();
	String sql = "SELECT id, pass, name, regidate FROM member";
	Statement stmt = jdbc.con.createStatement();
	
	ResultSet rs = stmt.executeQuery(sql);
	%>
	<table class="table">
	  <thead>
	    <tr>
	      <th>id</th>
		  <th>pw</th>
		  <th>name</th>
		  <th>regidate</th>
	    </tr>
	  </thead>
	<%	while(rs.next()){
		String id = rs.getString(1);
		String pw = rs.getString(2);
		String name = rs.getString("name");
		java.sql.Date regidate = rs.getDate("regidate");
	%>
	  <tbody>
	    <tr>
		  <th><%= id %></th>
		  <th><%= pw %></th>
		  <th><%= name %></th>
		  <th><%= regidate %></th>
	    </tr>
	    
		<% }
			jdbc.close();%>
	

	
</body>
</html>