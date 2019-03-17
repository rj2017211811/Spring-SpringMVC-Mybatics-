<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>修改用户</h1>
	<form action="${pageContext.request.contextPath }/user/update.action" method="post">
		<table>
		<tr><th>id</th><td><input type="text" name="id"  value="${user.id }" readonly="readonly"></td></tr>
			<tr><th>username</th><td><input type="text" name="username" value="${user.username }"> </td></tr>
			<tr><th>password</th><td><input type="password" name="password" value="${user.password }"> </td></tr>
	        <tr><td colspan="2"><input type="submit" value="修改"> </td></tr>
	    </table>
	</form>
	<a href="${pageContext.request.contextPath }/user/listAll.action">返回列表</a><br>
	
</body>
</html>