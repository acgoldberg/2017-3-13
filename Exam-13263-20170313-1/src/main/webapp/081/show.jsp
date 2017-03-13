<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>show.jsp</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <table cellspacing="0"  cellpadding="0">
    	<tr>
    		<td>film_id</td>
    		<td>title</td>
    		<td>description</td>
    		<td>language</td>
    	</tr>
    	<% int i=0;while(i<(Integer)request.getAttribute("i")){ %>
    	<tr>
    		<td><%=request.getAttribute("a["+i+"]") %></td>
    		<td><%=request.getAttribute("b["+i+"]") %></td>
    		<td><%=request.getAttribute("c["+i+"]") %></td>
    		<td><%=request.getAttribute("d["+i+"]") %></td>
    	</tr>
    	<%i++;}%>
    </table>
  </body>
</html>
