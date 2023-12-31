<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>        
<%@ page import =  "com.demo.servletjsp.Student" %> 
<%@ page import =  "com.demo.servletjsp.SampleServlet" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Servlets and JSP</title>
</head>
<body>
 <%-- <% 
        if (request.getAttribute("s1") != null) {
            Student student = (Student) request.getAttribute("s1");
         
    %> --%>
 
    <h1>Student Record</h1>
    <table>
    <thead>
    <tr>
    <th>ID</th>
    <th>NAME</th>
    <th>LOCATION</th>
    <th>SALARY</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${s1}" var="loc">
    <tr>
    <td>${loc.id}</td>
    <td>${loc.name}</td>
    <td>${loc.location }</td>
    <td>${loc.salary }</td>
    </tr>
    </c:forEach>
    </tbody>
    </table>
    <%-- <div>ID: <%= student.getId()%></div>
    <div>Name: <%= student.getName()%></div>
    <div>Location: <%= student.getLocation()%></div>
    <div>Salary: <%=student.getSalary() %></div>
       <fmt:parseNumber var="j" type="number" value="${student.getSalary()}" />  
           <p><i>Amount is:</i>  <c:out value="${j}" /></p> 
     <div>Salary(USA) : <c:set var="salary" value="<%=student.getSalary() %>"/>
     <fmt:formatNumber value="${salary}" type="currency"/></div>
     
     <div>Salary(UK) : <c:set var="salary" value="<%=student.getSalary() %>"/>
     <fmt:setLocale value="en-GB"/>
     <fmt:formatNumber value="${salary}" type="currency"/></div>
     
      <div>Salary(INR) : <c:set var="salary" value="<%=student.getSalary() %>"/>
     <fmt:setLocale value="en-IN"/>
     <fmt:formatNumber value="${salary}" type="currency"/></div>
     
     <div>Salary(SWISS) : <c:set var="salary" value="<%=student.getSalary() %>"/>
     <fmt:setLocale value="fr_CH"/>
     <fmt:formatNumber value="${salary}" type="currency"/></div> --%>
    <%-- <% 
        } else { 
    %> --%>

    <h1>No student record found.</h1>
         
   <%--  <% } %>	 --%>
    <br><br><br>
    <button type="button" name="back" onclick="history.back()">back</button>
    
</body>
</html>