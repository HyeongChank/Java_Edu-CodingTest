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

	<form name = "mouseclick" method = "get" action = "../eltest/write.do" enctype = "multipart/form-data">
		<table border ="1" width = "90%">
			<tr>
				<td>mouse location 지정</td>
			<tr>
				<td colspan = "2" align = "center">
					<button type = "submit">첫번쨰 마우스 좌표 지정</button>
				</td>
		</table>
	</form>

</body>
</html>