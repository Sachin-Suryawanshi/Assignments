<!DOCTYPE html>
<%@page import="com.model.Dictionary"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="DictionaryServlet" method="post">
<input type="radio" name="type" value="add">InsertWord<br>
<input type="radio" name="type" value="search">Search<br>
<input type="radio" name="type" value="display">DisplayWords<br>
<input type="text" name="word"><br>
<input type="text" name="mean"><br>
<input type="submit" value="Ok">

</form>

</body>
</html>