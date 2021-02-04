<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="add">
<input type="radio" name="type" value="add"/>InsertEmployee
<input type="radio" name="type" value="search"/>SearchEmployee
<input type="radio" name="type" value="show"/>ShowEmployee
EmpId<input type="text" name="empId" />
Employee Name<input type="text" name="ename" />
Salary<input type="text" name="salary" />
<input type="submit" value="Add" /></form>
</body>
</html>