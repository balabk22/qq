
<%@page import="com.Person"%>
<%@page import="java.util.List"%>

<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<jsp:include page="./Menu.jsp"></jsp:include>
<form  method="post">
		<table class="table table-hover">

		<thead>
			<tr>
				<th>UserName</th>
				<th>FullName</th>
				<th>e-mail</th>
				
			</tr>


		</thead>

		<tbody>
			
				<tr>
					<td>${per.user_id }</td>
					<td>${per.fullName}</td>
					<td>${per.email}</td>
					
					<td></td>
				</tr>
				

			

		</tbody>



	</table>

	</form>

</body>
</html>