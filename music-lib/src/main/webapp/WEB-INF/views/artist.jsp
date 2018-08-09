<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
  <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
  <%@page contentType="text/html;charset=UTF-8" language="java" %>
  <%@page isELIgnored="false" %>
  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="/music-lib/resources/css/bootstrap-select.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="/music-lib/resources/js/bootstrap-select.min.js"></script>
</head>
<body>
	<div id="nav">
		<nav class="navbar navbar-default">
		  <div class="container-fluid">
			<div class="navbar-header">
			  <a class="navbar-brand" href="#">Music Library</a>
			</div>
			<ul class="nav navbar-nav">
			  <li ><a href="cd">Home</a></li>
			  <li ><a href="cd_details">Music-CD</a></li>
			  <li class="active"><a href="#">Artist</a></li>
			</ul>
		  </div>
		  
		</nav>
	</div>
	<div class="container">
		<div class="page-header">
			<h1>Artist</h1>
		</div>
				
			
			
			  <form:form class="form-horizontal" method="POST" action="/music-lib/artist"  modelAttribute="artist">
			  	  <form:input path="artistId" type="hidden" class="form-control"/>
				  <div class="form-group">
					<label class="control-label col-sm-2" for="email">Name:</label>
					<div class="col-sm-8">
					  <form:input path="artistName" type="text" class="form-control" placeholder="Enter Name" required="true"/>
					</div>
				  </div>
				  <div class="form-group"> 
					<div class="col-sm-offset-2 col-sm-10">
					  <button type="submit" id="submit" name="submit" class="btn ">Add</button>
					</div>
				  </div>
				</form:form>
			
			
		</div>
</body>
</html>
