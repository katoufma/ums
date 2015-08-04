<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ユーザ情報更新確認</title>
</head>
<body>
	<form:form action="${pageContext.request.contextPath }/user/update" method="POST">
		<input name="submit" type="submit" value="更新"/>
	</form:form>
	<form:form action="${pageContext.request.contextPath }/user/update?redo" method="POST">
		<input name="submit" type="submit" value="更新内容修正"/>
	</form:form>
</body>
</html>