<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view users</title>
</head>
<body>

    <h2 align = center>Users List</h2>
    <hr>
    <br><br>
    
    <div align = "center">
       <table border ="1">
          <tr>
             <th>ID</th>
             <th>Username</th>
             <th>Phone</th>
             <th>Email</th>
             <th>Reg Date</th>
             <th>Address</th>
             <th>Photo</th>
          </tr>
          
          <c:forEach var="user" items="${list }">
             <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.phoneNo}</td>
                <td>${user.email}</td>
                <td>${user.regDate}</td>
                <td>${user.address}</td>
                <td>${user.photo}</td>
                <td>
                    <a href='<c:url value="/delete_user/${user.id }"/>'>Delete</a>
                    <a href='<c:url value="/update_user/${user.id }"/>'>Update</a>
                </td>
             </tr>
          </c:forEach>
          
       </table>
       
       	<br>
	<br>

    <a href="user_page">back</a><br>
    <a href="index">home-page</a>
    
    </div>

</body>
</html>