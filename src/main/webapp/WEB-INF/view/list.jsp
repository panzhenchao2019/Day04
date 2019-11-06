
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/css/index_work.css" rel="stylesheet">
<script type="text/javascript" src="/js/jquery-1.8.2.min.js"></script>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<td>编号</td>
			<td>书名</td>
			<td>类型</td>
			<td>作者</td>
			<td>价格</td>
		</tr>
		<c:forEach items="${list }" var="u">
			<tr>
				<td>${u.id }</td>
				<td>${u.name }</td>
				<td>${u.type }</td>
				<td>${u.bookname }</td>
				<td>${u.price }</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>