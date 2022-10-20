<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file="../header.jsp" %>
	
	<div class="webbox">
		<input type="hidden" class="mid" value="<%=loginid%>">
		
		<div class="contentbox"></div>
		<textarea rows="" cols="" class="msgbox" onkeyup="enterkey()"></textarea>
		<button type="button" onclick="send()">보내기</button>
	</div>
	<script src="../js/board/chatting.js" type="text/javascript"></script>	
		

</body>
</html>