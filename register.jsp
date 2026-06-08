<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration Form</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="container">
    <div class="form-card">
        <h2>Student Registration Form</h2>
        
        <form:form action="./save" modelAttribute="student">
        <table>
        
        <tr>
        <td>name: </td>
        <td><form:input path="name"/></td>
        </tr>
        
        <tr>
        <td>mail : </td>
        <td><form:input path="mail"/></td>
        </tr>
        
        <tr>
        <td>name: </td>
         <td> <form:radiobutton path="gender" value="male"/>
         <form:radiobutton path="gender" value="female"/>
         </td>
        </tr>
        
       <tr>
        <td>Courses : </td>
        <td> <form:select path="courses">
        <form:option value="---Select---"></form:option>
        <form:options items="${courses}"/>
        </form:select></td>
        </tr>
        
        <tr>
        <td>timing : </td>
        <td><form:checkbox items="${timings}" path="timings"/></td>
        </tr>
        
        <tr>
        <td></td>
        <td>
       <input type="submit" value="Register"/>
       </td>
        </tr>
        
        
        </table>
        
        </form:form>  

         
<script src="js/script.js"></script>
</body>
</html>