<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- eltest/write.do(컨트롤러 .java파일)로 전송하기 -->
	<form name = "elt" method = "get" action = "../eltest/write.do" enctype = "multipart/form-data">
		<table border ="1" width = "90%">
			<tr>
				<td>숫자</td>
				<td>
					<input type = "text" name = "name" style = "width : 150px;" />
				</td>
			</tr>
			<tr>
				<td colspan = "2" align = "center">
					<button type = "submit">작성 완료</button>
				</td>
			</tr>			
		</table>
	</form>
</body>
</html>