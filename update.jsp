<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
 <body>

<div class="container">
    <div class="form-card">
        <h2>Student Registration Form</h2>
        
        <form:form action="./updatesave" modelAttribute="student">
        <table>
        
        <tr>
        <td>name: </td>
        <td><form:input items="${student.name}" path="name"/></td>
        </tr>
        
        <tr>
        <td>mail : </td>
        <td><form:input items="${student.mail}" path="mail"/></td>
        </tr>
        
        <tr>
        <td>name: </td>
         <td> <form:radiobutton  items="${student.gender}" path="gender" value="male"/>
         <form:radiobutton items="${student.gender}" path="gender" value="female"/>
         </td>
        </tr>
        
       <tr>
        <td>Courses : </td>
        <td> <form:select path="courses">
        <form:option value="---Select---"></form:option>
        <form:options items="${student.courses}"/>
        </form:select></td>
        </tr>
        
        <tr>
        <td>timing : </td>
        <td><form:checkbox items="${student.timings}" path="timings"/></td>
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