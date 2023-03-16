<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>el로 폼값 받기</h3>
	<ul>
		<li>이름 : ${param.name}</li>
		<li>성별 : ${param.gender}</li>
		<li>학력 : ${param.grade }</li>
		<%-- inter 안에 숫자는 선택한 값중의 번호 2개 골랐으면 0,1만 나오고 2,3은 공백 --%>
		<li>관심사항 : ${paramValues.inter[0] }
			${paramValues.inter[1] }
			${paramValues.inter[2] }
			${paramValues.inter[3] }
			</li>
	</ul>
</body>
</html>