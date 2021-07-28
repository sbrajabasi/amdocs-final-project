<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        
    <%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>get feedbacks</title>
</head>
<body>

              <h2 align = center>Feedback List</h2>
    <hr>
    <br><br>
    <div align= center>
    <table border="1">
		<tr>
			<th>Feedback Id</th>
			<th>User Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Feedback</th>
		</tr>

		<c:forEach var="model" items="${list }">
			<tr>
				<td>${model.feedbackId }</td>
				<td>${model.userId }</td>
				<td>${model.name }</td>
				<td>${model.email }</td>
				<td>${model.feedback }</td>
				<td><a href="<c:url value='/delete_feedback/${model.feedbackId }'/>">Delete</a>
					| <a href="<c:url value='/update_feedback/${model.feedbackId }'/>">Update</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<br>
	<br>

    <a href="feedback_page">back</a><br>
    <a href="index">home-page</a>
	</div>

</body>
</html>