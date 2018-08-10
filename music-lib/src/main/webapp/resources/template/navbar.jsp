<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

	<nav class="navbar navbar-default">
	  <div class="container-fluid">
		<div class="navbar-header">
		  <a class="navbar-brand" href="#">Music Library</a>
		</div>
		<ul class="nav navbar-nav">
		  <li class="home"><a href="<c:url value='/cd'></c:url>">Home</a></li>
		  <li class="cdDetails"><a href="<c:url value='/cd_details'/>'">Music-CD</a></li>
		  <li class="artist"><a href="<c:url value='artist'/>">Artist</a></li>
		</ul>
	  </div>
	</nav>