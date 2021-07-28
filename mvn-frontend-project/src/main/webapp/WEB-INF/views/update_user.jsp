<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update user</title>
</head>
<body>
    <h2 align = center>Update Admin</h2>
	<hr>
	
	<br><br>
	
	<div align = "center">
	<c:url  var = "updateURL"  value="/update_user"></c:url>
	   <form:form  action ="${updateURL }" method="POST" modelAttribute="user" >
	     	     <pre>
	     Id              :<form:input path="id"/><br>
	     Username        :<form:input path="username"/><br>
	     Password        :<form:password path="password"/><br>
	     Phone           :<form:input path="phoneNo"/><br>
	     Email           :<form:input path="email"/><br>
	     Reg Date        :<form:input path="regDate"/><br>
	     Address         :<form:input path="address"/><br>
	     Photo           :<form:input path="photo"/><br><br>
	                       <input type="submit" value="Update User" /><br> 
                           <input type="reset" value="Reset" />
	                      
	     </pre>
	   
	   </form:form>
	</div>
     

</body>
</html>