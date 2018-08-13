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
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="<c:url value='/resources/js/navbar-loader.js'></c:url>"></script>
  <link rel="stylesheet" href="<c:url value='/resources/css/common.css'></c:url>">
</head>
<body id="artist">
	<div id="nav-placeholder">
	</div>
	<div class="container">
		<div class="page-header">
			<h1>Artist</h1>
		</div>
			  <form:form class="form-inline" method="POST" action="/music-lib/artist"  modelAttribute="artist">
			  	  
				  <div class="form-group">
					<label class="control-label col-sm-2" for="email">Name:</label>
					<div class="col-sm-8">
					  <form:input path="artistName" type="text" class="form-control" placeholder="Enter Name" required="true"/>
					</div>
				  </div>
					  <button type="submit" id="submit" name="submit" class="btn ">Add</button>
					  <c:if test="${successMsg!=null}">
					  <br/>
						<div class="alert alert-success  ">
		  					<strong>${successMsg } </strong>
						</div>
					</c:if>
					<c:if test="${successMsg==null}">
					  <br/><br/>
					</c:if>
				</form:form>
				
				
				<table class="table table-striped table-fixed">
					<thead>
						<tr>
							<td><strong>Artist Id</strong></td>
							<td><strong>Artist Name</strong></td>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${artists}" var="art">
						<tr>
							<td>${art.artistId }</td>
							<td>${art.artistName}</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
		</div>
</body>
</html>
