<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h3>Welcome</h3>
<form action="/SampleServletExample/student-record">
  <label for="sid">LOCATION:</label><br>
  <input type="text" id="location" name="location" ><br>
  <input type="hidden" id="token" name="token" value="1234">
  <br><br>
  <input type="submit" value="Submit">
  
  
  
</form>
</body>
</html>