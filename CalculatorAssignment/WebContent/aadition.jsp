<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="AdditionServlet" method="post">
<input type="radio" name="type" value="addition">Addition
<input type="radio" name="type" value="sub">Substraction
<input type="radio" name="type" value="mul">Multiplication
<input type="radio" name="type" value="div">Division<br>
<input type="number" name="num1"/><br>
<input type="number" name="num2"/>
<input type="submit" value="Result">
</form>


</body>
</html>