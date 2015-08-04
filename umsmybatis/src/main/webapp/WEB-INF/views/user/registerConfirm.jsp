<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登録項目確認</title>
</head>
<body>
	登録項目確認
	<form:form action="${pageContext.request.contextPath }/user/register">
		<input name="submit" type="submit" value="登録" />
	</form:form>
	<form:form action="${pageContext.request.contextPath }/user/register?redo">
		<input name="submit" type="submit" value="登録内容修正" />
	</form:form>
</body>
</html>