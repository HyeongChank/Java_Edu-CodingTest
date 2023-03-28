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

	<form name = "mouseclick" method = "get" action = "../test/mouselocation.do" enctype = "multipart/form-data">
		<table border ="1" width = "90%">
			<tr>
				<td>${x }, ${y }</td>
				<td colspan = "2" align = "center">
					<button type = "submit" name = "첫번째 마우스 좌표 지정" >버튼</button>
				</td>
			</tr>
		</table>
	</form>
	<form name = "mouseclick2" method = "get" action = "../test/mouselocation2.do" enctype = "multipart/form-data">
		<table border ="1" width = "90%">
			<tr>
				<td>${q }, ${w }</td>
				<td colspan = "2" align = "center">
					<button type = "submit" name = "두번째 마우스 좌표 지정" >버튼</button>
				</td>
			</tr>
		</table>
	</form>
	<form name = "mouseclick3" method = "get" enctype = "multipart/form-data">
		<table border ="1" width = "90%">
			<tr>
				<td>${e }, ${r }</td>
				<td colspan = "2" align = "center">
					<button type = "submit" name = "세번째 마우스 좌표 지정" >버튼</button>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>