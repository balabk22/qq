<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">First</th>
      <th scope="col">Last</th>
      <th scope="col">Handle</th>
    </tr>
  </thead>
  <tbody>
			<c:forEach items="${products}" var="prod">

				<tr>
					<td>${prod.id }</td>
					<td>${prod.name }</td>
					<td>${prod.price}</td>
					<td>${prod.description }</td>
					<td> <a href="./ControllerServ?option=delete&&id=${prod.id}">DELETE</a></td>
					<td> <a href="./ControllerServ?option=update&&id=${prod.id}">UPDATE</a></td>
					<td></td>
				</tr>
				

			</c:forEach>

		</tbody>
</html>