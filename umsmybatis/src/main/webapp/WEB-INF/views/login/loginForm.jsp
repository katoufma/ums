<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン</title>
</head>
<body>
	<form:form action="${pageContext.request.contextPath }/login">
		<input name="submit" type="submit" value="ログイン" />
	</form:form>
	<form:form action="${pageContext.request.contextPath }/password/change?form">
		<input name="submit" type="submit" value="パスワード変更" />
	</form:form>
</body>
</html>