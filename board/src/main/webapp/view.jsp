<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>


	<h3>글작성페이지</h3>
	<form action="/board/board"  method="get">
	
		제목: <input type="text" name="title"> <br>
		작성자: <input type="text" name="writer"> <br>
		비밀번호: <input type="password" name="password"><br>
		내용: <textarea rows="20" cols="50" name="content"></textarea> <br>
		
		
		<input type="submit" value="글등록">
		
	
	
	</form>
	
	<div>
		글목록
		<table id="boardlisttable">
			
		
		
		
		</table>
	</div>	
	<div id="deleteboard">
		<button onclick="deleteboardbtn()">글삭제</button>
	</div>	



	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="board.js" type="text/javascript"></script>
</body>
</html>