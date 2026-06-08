<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
jstl<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container home-page">
    <div class="card">
        <h1>Student Display System</h1>
        
<table>

<thead>
<tr>
<th>  id</th>
<th> name</th>
<th> mail</th>
<th> gender</th>
<th> courses</th>
<th> timings</th>
<th> Action</th>
</tr>
</thead>

<c:forEach var="std" items="student">
<tbody>

<tr>
<td>${std.id}</td>
<td>${std.name}</td>
<td>${std.mail}</td>
<td>${std.gender}</td>
<td>${std.courses}</td>
<td>${std.timings}</td>
<td><a href="update?id=${std.id}">update</a></td>
<td><a href="delete?id=${std.id}">delete</a></td>
</tr>

</tbody>
</c:forEach>


</table>

<a href="reg">insert student</a>
        
    </div>
</div>

</body>
</html>