<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>
		<c:out value="${exception.getMessage() }"></c:out>
	</h4>

	<ul>
		<c:forEach items="${exception.getStackTrace() }" var="stack">
			<!-- c:out : 출력할 대 사용하면 보안성이 높아진다, XSS 공격에 대해서 간단하게 방어가 가능하다 -->
			<li><c:out value="${stack }"></c:out>
		</c:forEach>
	</ul>
</body>
</html>