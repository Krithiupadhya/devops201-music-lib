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
  <script src="<c:url value='/resources/js/bootstrap-select.min.js'/>"></script>
  <link rel="stylesheet" href="<c:url value='/resources/css/bootstrap-select.min.css'/>">
  <script src="<c:url value='/resources/js/navbar-loader.js'></c:url>"></script>
  <link rel="stylesheet" href="<c:url value='/resources/css/common.css'></c:url>">
  <script src="<c:url value='/resources/js/cd_details.js'></c:url>"></script>
</head>
<body id="cdDetails">
	<div id="nav-placeholder">
	</div>
	<div class="container">
		<div class="page-header">
			<h1>Music CD details</h1>
		</div>
			
			  <form:form class="form-horizontal" method="POST" action="/music-lib/cd"  modelAttribute="musicCD">
			  <!--<fieldset disabled>-->
			  	  <form:input path="cdId" type="hidden" class="form-control" id="cdId"/>
				  <div class="form-group">
					<label class="control-label col-sm-2" for="email">Title:</label>
					<div class="col-sm-8">
					  <form:input path="title" type="text" class="form-control" id="title" placeholder="Enter Title" required="true"/>
					</div>
				  </div>
				  <div class="form-group">
					<label class="control-label col-sm-2" for="pwd">Year of release:</label>
					<div class="col-sm-8"> 
						<form:input path="yearOfRelease" type="text" class="form-control" id="yearOfRelease" placeholder="Enter Year of release" required="true"/>
					</div>
				  </div>
				  <div class="form-group"> 
					<label class="control-label col-sm-2" for="pwd">Tracks:</label>
					
					<div class="col-sm-8 "> 
							<div class="row">
										<div class="form-group col-sm-3 ">
											<input class="form-control .no-border" name="Title" value="Title" type="text" placeholder="Title"  readonly="readonly"/>
										</div>
										<div class="form-group col-sm-3 ">
											<input class="form-control .no-border" name="Author" value="Author" type="text" placeholder="Author"  readonly="readonly"/>
										</div>
										<div class="form-group col-sm-3 ">
											<input class="form-control .no-border" name="Playing sec" value="Playing time(sec)" type="text" placeholder="Playing time"  readonly="readonly"/>
										</div>
										<div class="form-group col-sm-4">
											<input class="form-control .no-border" name="Artist(s)" value="Artist(s)" type="text" placeholder="Playing time" readonly="readonly"/>
										</div>
							</div>
							
							<div class="controls"> 
								<c:forEach var="track" items="${musicCD.musicTracks}" varStatus="loop">
									<div class="entry form-horizontal"> 
										<div class="row">
										<div class="form-group col-sm-3 ">
											<input class="form-control trackId" name="musicTracks.trackId" value="${track.trackId}" type="hidden" />
											<input class="form-control title" name="musicTracks.title" value="${track.title}" type="text" placeholder="Title" />
										</div>
										<div class="form-group col-sm-3 ">
											<input class="form-control author" name="musicTracks.author" value="${track.author}" type="text" placeholder="Author" />
										</div>
										<div class="form-group col-sm-3 ">
											<input class="form-control playingSec" name="musicTracks.playingSec" value="${track.playingSec}" type="text" placeholder="Playing time" />
										</div>
										<div class="form-group col-sm-4">
											<div class="input-group">
					
										  	<select class="form-control selectpicker artists-select" data-live-search="true" multiple="true" name="musicTracks.artists.artistId">
											  	<c:forEach var="artist" items="${artists}">
											  		<option value="${artist.artistId}"
											  		<c:if test="${fn:contains(track.artists, artist)}">
        													selected
    													</c:if>
											  		> ${artist.artistName}</option>
											  	</c:forEach>
											</select>
												<span class="input-group-btn">
													<c:if test="${loop.index==0 }">
														<button class="btn btn-success btn-add" type="button">
															<span class="glyphicon glyphicon-plus"></span>
														</button>
													</c:if>
													<c:if test="${loop.index!=0 }">
														<button class="btn btn-danger btn-remove" type="button">
															<span class="glyphicon glyphicon-minus"></span>
														</button>
													</c:if>
												</span>	
											</div>
										</div>
									</div>
									</div>
							 	</c:forEach>
								<div class="artists-group"></div>
						</div>
					</div>
					</div>
				  
				  <div class="form-group"> 
					<div class="col-sm-offset-2 col-sm-10">
					  <button type="submit" id="submit" name="submit" class="btn ">Submit</button>
					</div>
				  </div>
				  <!--</fieldset>-->
				</form:form>
				
				<c:if test="${successMsg!=null}">
					<div class="alert alert-success  ">
	  					<strong>${successMsg } </strong>
					</div>
				</c:if>
				<c:if test="${errorMsg!=null}">
					<div class="alert alert-danger">
	  					<strong>${errorMsg } </strong>
					</div>
				</c:if>
		</div>
</body>
</html>
