<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
  <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
  <%@page contentType="text/html;charset=UTF-8" language="java" %>
  <%@page isELIgnored="false" %>
  <style>
  .mybackground {
    background:url('resources/images/music1.jpg');
	}	
	.row.is-flex {
    display: flex;
    flex-wrap: wrap;
}
.row.is-flex > [class*='col-'] {
    display: flex;
    flex-direction: column;
}

/*
* And with max cross-browser enabled.
* Nobody should ever write this by hand. 
* Use a preprocesser with autoprefixing.
*/
.row.is-flex {
    display: -webkit-box;
    display: -webkit-flex;
    display: -ms-flexbox;
    display: flex;
    -webkit-flex-wrap: wrap;
    -ms-flex-wrap: wrap;
    flex-wrap: wrap;
}

.row.is-flex > [class*='col-'] {
    display: -webkit-box;
    display: -webkit-flex;
    display: -ms-flexbox;
    display: flex;
    -webkit-box-orient: vertical;
    -webkit-box-direction: normal;
    -webkit-flex-direction: column;
    -ms-flex-direction: column;
    flex-direction: column;
}
  </style>
  
</head>
<body>


<div class="jumbotron text-center mybackground" >
  <h1>Music Library</h1>
  
</div>
<div id="nav">
	<nav class="navbar navbar-default">
	  <div class="container-fluid">
		<div class="navbar-header">
		  <a class="navbar-brand" href="#">Music Library</a>
		</div>
		<ul class="nav navbar-nav">
		  <li class="active"><a href="cd_details">Home</a></li>
		  <li><a href="cd_details">Music-CD</a></li>
		  <li><a href="artist">Artist</a></li>
		</ul>
		<!-- <ul class="nav navbar-nav navbar-right">
           <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login  </a></li>
		</ul> -->
	  </div>
	  
	</nav>
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
	  <p>Playing time: ${cd.toPlayingTimeInsec}</p>
	  </div>
	  
    </div>
	</c:forEach>
  </div>
</div>
</body>
</html>