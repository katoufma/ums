<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>検索結果</title>
</head>
<body>
	<form:form action="${pageContext.request.contextPath }/user/update?userId">
		<input name="submit" type="submit" value="ユーザ情報更新"/>
	</form:form>
	<form:form action="${pageContext.request.contextPath }/user/delete?userId">
		<input name="submit" type="submit" value="ユーザ情報削除"/>
	</form:form>
</body>
</html>