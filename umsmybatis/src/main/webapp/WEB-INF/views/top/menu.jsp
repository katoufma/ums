<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<form:form action="${pageContext.request.contextPath }/logout">
		<input name="submit" type="submit" value="ログアウト"/>
	</form:form>
	
	<form:form action="${pageContext.request.contextPath }/user/register" method="GET">
		<input name="submit" type="submit" value="ユーザ登録"/>
	</form:form>
	
	<form:form action="${pageContext.request.contextPath }/user/search?form">
		<input name="submit" type="submit" value="ユーザ検索"/>
	</form:form>
</body>
</html>