<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
function validateForm(form){
	if(!form.name.value){
		alert("이름을 입력하세요.");
		return false;
	}
	if(!form.tel.value){
		alert("연락처를 입력하세요.");
		return false;
	}
	
</script>

<body>
 	<h1>방명록</h1>
 	<form name = "login" method = "get" action = "../Counterj/visitor.do" enctype = "multipart/form-data">
		성 명 : <input type = "text" name = "name"/><br/>
		연락처 : <input type = "tel" name = "tel"/><br/>
		남기는 말 : <input type = "text" name = "ment"/><br/>
		<button type = "submit">버튼</button>
	</form>


</body>
</html>