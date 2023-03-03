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
	<h2>국가 목록</h2>

	<%
	JDBConnect jdbc = new JDBConnect();
	String sql = "select * from city order by population desc limit 10";
	Statement stmt = jdbc.con.createStatement();
	
	ResultSet rs = stmt.executeQuery(sql);
	%>
	<table class="table">
	  <thead>
	    <tr>
	      <th>id</th>
		  <th>name</th>
		  <th>countrycode</th>
		  <th>district</th>
		  <th>population</th>
	    </tr>
	  </thead>
	<%	while(rs.next()){
		String id = rs.getString("id");
		String name = rs.getString("name");
		String countrycode = rs.getString("countrycode");
		String district = rs.getString("district");
		String population = rs.getString("population");
	%>
	  <tbody>
	    <tr>
		  <th><%= id %></th>
		  <th><%= name %></th>
		  <th><%= countrycode %></th>
		  <th><%= district %></th>
		  <th><%= population %></th>
	    </tr>
	    
		<% }
			jdbc.close();%>
	
</body>
</html>