<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add.jsp</title>
</head>
<body>
<form action="<%= request.getContextPath()%>/LoginServlet81" method="post">
	film_id:<input type="text" name="film_id"><br/>
	tilte:<input type="text" name="title"><br/>
	description:<input type="text" name="description"><br/>
	language :<select name="language">
			<option>English</option>
			<option>Italian</option>
			<option>Japanese</option>
			<option>Mandarin</option>
			<option>French</option>
			<option>German</option>
		</select>
		<br/>
		<input type="submit" value="submit"/>
</form>
</body>
</html>