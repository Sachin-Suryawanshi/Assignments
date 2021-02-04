<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome</h1>
<%String admin=(String)request.getAttribute("admin");
String customer=(String)request.getAttribute("customer");
if(admin!=null)
{
	

%>
<a href="add.jsp">Add</a><%} %>
<a href="showall">ShowWordList</a><br>
<a href="show.jsp">SearchWord</a>
</body>
</html>