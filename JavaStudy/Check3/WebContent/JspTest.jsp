<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/style.css">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"/>
	<div class="main">
	<table>
			<tr>
				<td class="name">name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
			 <td class="id">id</td>
			 <td><input type="text" name="id"></td>
			</tr>
		</table>
	</div>
	<jsp:include page="footer.jsp"/>
</body>
</html>