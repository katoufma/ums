<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ユーザ検索</title>
</head>
<body>
	<form:form action="${pageContext.request.contextPath }/user/search">
		<input name="submit" type="submit" value="検索" />
	</form:form>
</body>
</html>