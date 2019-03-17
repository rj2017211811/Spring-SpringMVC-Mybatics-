<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>id</th>
				<th>username</th>
				<th>password</th>
				<th>删除</th>
				<th>修改</th>
			</tr>

		</thead>
		<tbody>
			<c:forEach items="${userList }" var="user">
				<tr>
					<td>${user.id }</td>
					<td>${user.username }</td>
					<td>${user.password }</td>
					<td><a href="${pageContext.request.contextPath }/user/delete.action?id=${user.id }">删除</a></td>
					<td><a href="${pageContext.request.contextPath }/user/toUpdate.action?id=${user.id }">修改</a></td>
				</tr>

			</c:forEach>


		</tbody>

	</table>
	<a href="${pageContext.request.contextPath }">返回主界面</a>
</body>
</html>