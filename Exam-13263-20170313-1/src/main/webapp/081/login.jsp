<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login.jsp</title>
</head>
<body>
	<form action="<%= request.getContextPath()%>/LoginServlet8" method="Post">
		name:<input type="text" name="name"><br /> 
		<input type="submit"><input type="reset">
		<%if(request.getAttribute("message")!=null){%>
		<p><%=request.getAttribute("message") %></p>
		<% } %>
	</form>
	
</body>
</html>