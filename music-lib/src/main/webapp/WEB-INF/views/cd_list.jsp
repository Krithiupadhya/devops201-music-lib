<!DOCTYPE html>
<html>
<head>
  <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
  <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
  <%@page contentType="text/html;charset=UTF-8" language="java" %>
  <%@page isELIgnored="false" %>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="<c:url value='/resources/js/navbar-loader.js'></c:url>"></script>
  <link rel="stylesheet" href="<c:url value='/resources/css/common.css'></c:url>">
  <link rel="stylesheet" href="<c:url value='/resources/css/cd_list.css'></c:url>">
</head>
<body id="home">
	<div class="jumbotron text-center mybackground" >
	  <h1>Music Library</h1>  
	</div>
	<div id="nav-placeholder">
	</div>
	<div class="container">
	  <div class="row is-flex" >
	  
	  <c:forEach var="cd" items="${cdSummaries}">
	    <div class="col-md-4">
		 <div class="thumbnail">
		  <a href="cd/${cd.cd_id}">
	      <h4>${fn:toUpperCase(cd.title)} (${cd.yearOfRelease})</h4>
		  </a>
	      <p> 
	      	 <c:forEach var="artist" items="${cd.artists}" varStatus="loop">
	      	 	${artist.artistName}
	      	 	<c:if test="${!loop.last}">,</c:if>
	      	 </c:forEach>
	      </p>
	      <p>Number Of Tracks: ${cd.noOfTracks}</p>
		  <p>Playing time: ${cd.playingTimeStr}</p>
		  </div>
		  
	    </div>
		</c:forEach>
	  </div>
	</div>
</body>
</html>