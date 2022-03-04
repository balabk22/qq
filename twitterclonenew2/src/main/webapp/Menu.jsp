<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body class="container">

<jsp:include page="./Welcome.jsp"></jsp:include>
<nav class="navbar navbar-expand-lg navbar-light bg-light justify-content-between "navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Twit</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup" style="color:black;">
      <div class="navbar-nav" style="background-color: black; ">
        <a class="nav-link active" aria-current="page" href="./index.jsp" style="color:white">Home</a>
        <a class="nav-link" href="./loginServ?option=profile&user=${userName}" style="color:white">profile</a>
        <a class="nav-link" href="./product-form.jsp" style="color:white">Follow Users</a>
        <a class="nav-link" href="./loginServ?option=listAll" style="color:white">Display tweets</a>
        <a class="nav-link" href="./product-form.jsp" style="color:white">Tweet a user</a>
        <a class="nav-link" href="./product-form.jsp" style="color:white">Display followers</a>
        <a class="nav-link" href="./product-form.jsp" style="color:white">Logout</a>
         <input class="navbar navbar-expand-lg navbar-light bg-light justify-content-right" type="search" placeholder="Search" aria-label="Search">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        
      </div>
    </div>
  </div>
</nav>



</body>
</html>