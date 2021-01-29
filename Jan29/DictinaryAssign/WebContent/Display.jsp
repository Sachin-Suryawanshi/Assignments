<%@page import="com.model.Dictionary"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%List<Dictionary> dlist=(List<Dictionary>)session.getAttribute("words"); 
out.println(dlist);%>
</body>
</html>