<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form method ="post" action="/ServletPrj/login">
	아이디:<input type="text" name = "id"><br>
	비밀번호:<input type="password" name = "pw"><br>
	이름:<input type="text" name = "name"><br>
	
	<button type="submit">Login</button>
	</form>
</body>
</html>