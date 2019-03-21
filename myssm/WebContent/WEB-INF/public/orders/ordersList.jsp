<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
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
				<th>userId</th>
				<th>username</th>
			
			
			
			</tr>

		</thead>
		<tbody>
			<c:forEach items="${ordersList }" var="orders">
				<tr>
					<td>${orders.id }</td>
					<td>${orders.user.id }</td>
					<td>${orders.user.username}</td>
					
				</tr>

			</c:forEach>


		</tbody>

	</table>
</body>
</html>