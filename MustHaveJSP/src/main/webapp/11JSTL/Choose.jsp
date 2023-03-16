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
	<c:set var = "number" value = "100"/>
	<h4>choose 태그로 홀짝 판단하기</h4>
	<c:choose>
		<c:when test = "${number mod 2 eq 0 }">
			${number} 는 짝수
		</c:when>
		<c:otherwise>
			${number } 는 홀수
		</c:otherwise>
	</c:choose>
	
	<h4>국,영,수 점수 입력 평균 내어 학점 출력</h4>
	<form>
		국어 : <input type ="text" name = "kor"/><br/>
		영어 : <input type = "text" name = "eng"/><br/>
		수학 : <input type = "text" name ="math"/><br/>
		<input type = "submit" value = "학점 구하기"/>
	
	</form>
	
	<c:if test = "${not (empty param.kor or empty param.eng or empty param.math) }">
		<c:set var = "avg" value = "${ (param.kor + param.eng + param.math)/3 }"/>
		평균 점수는 ${avg }으로
	
	<c:choose>
		<c:when test ="${avg >=90 }" > a학점</c:when>
		<c:when test = "${avg>=80 }">b학점</c:when>
		<c:when test = "${avg ge 70 }">c학점</c:when>
		<c:when test ="${avg ge 60 }"> d학점</c:when>
	</c:choose>
	입니다.
	</c:if>
</body>
</html>