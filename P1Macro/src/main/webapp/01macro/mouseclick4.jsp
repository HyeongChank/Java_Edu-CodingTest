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
   	  		    <button type="button" onclick="delayedSubmit()">버튼</button>
   			    </td>
			</tr>
		</table>
	</form>

	<script>
 		let time =0;
		const timerElement = document.getElementById("timer");
		function updateTimer() {
		    time += 1;
		    timerElement.innerText = time + "초";
		}
		
 		let time2 =0;
		const timerElement2 = document.getElementById("timer2");
		function updateTimer2() {
		    time2 += 1;
		    timerElement2.innerText = time2 + "초";
		}
		
 		let time3 =0;
		const timerElement3 = document.getElementById("timer3");
		function updateTimer3() {
		    time3 += 1;
		    timerElement3.innerText = time3 + "초";
		}
		
		
		
		function delayedSubmit() {
			setTimeout(function() {
				document.mouseclick.action = "../test/mouselocation.do";
				document.mouseclick.submit();
			}, 3000); // 5초 후에 실행되도록 지연
			setInterval(updateTimer, 1000);
		}
		function delayedSubmit2() {
			setTimeout(function() {
				document.mouseclick.action = "../test/mouselocation2.do";
				document.mouseclick.submit();
			}, 3000); // 5초 후에 실행되도록 지연
			setInterval(updateTimer2, 1000);
		}
		function delayedSubmit3() {
			setTimeout(function() {
				document.mouseclick.action = "../test/mouselocation3.do";
				document.mouseclick.submit();
			}, 3000); // 5초 후에 실행되도록 지연
			setInterval(updateTimer3, 1000);
		}
		function reset(){
			session.validate();
			alert("초기화되었습니다");
		}
	</script>


	<form name = "mouseclick2" method = "get" action = "../test/mouselocation2.do" enctype = "multipart/form-data">
		<table border ="1" width = "90%">
			<tr>
				<td>${q }, ${w }</td>
				<td colspan = "2" align = "center">
   	  		    <button type="button" onclick="delayedSubmit2()">버튼</button>
   			    </td>
			</tr>
		</table>
	</form>

	<form name = "mouseclick3" method = "get" action = "../test/mouselocation3.do" enctype = "multipart/form-data">
		<table border ="1" width = "90%">
			<tr>
				<td>${e }, ${r }</td>
				<td colspan = "2" align = "center">
   	  		    <button type="button" onclick="delayedSubmit3()">버튼</button>
   			    </td>
			</tr>
		</table>
	</form>

	<form name = "macrostart" method = "get" action = "../test/start.do" enctype = "multipart/form-data">
		<table border = "1">
			<tr>
				<td>1회 순회 후 대기시간(term) : <input type = "text" name = "delay1"/></td>
				<td>반복횟수 : <input type = "text" name = "roop"/></td>
				<td><button type = "submit">시작하기</button></td>
			</tr>		
		</table>
	</form>
	
	<form name = "board" method = "get" action = "../14MVCBoard/Default.jsp">
		<button type = "submit" >요구사항 작성 게시판</button>
	</form>
	
</body>
</html>