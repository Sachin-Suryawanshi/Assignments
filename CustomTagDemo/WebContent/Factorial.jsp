<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="/WEB-INF/factfile.tld" prefix="my" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
<input type="text" name="data"/><br>
<input type="submit" value="Ok"/></form>
<%!
String num="0";
%>
<%
num=request.getParameter("data");
if(num==null)
{
	num="0";
}
%>
<my:fact message="<%=num %>"></my:fact>
</body>
</html>