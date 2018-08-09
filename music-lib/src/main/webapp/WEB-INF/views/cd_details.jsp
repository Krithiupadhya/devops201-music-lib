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
  <script type="text/javascript">
	$(document).ready(  $(function()
		{
			$(document).on('click', '.btn-add', function(e)
			{
				e.preventDefault();

				var controlForm = $('.controls'),
					currentEntry = $(this).parents('.entry:first'),
					newEntry = $(currentEntry.clone()).appendTo(controlForm);

				newEntry.find('input').val('');
				controlForm.find('.entry:not(:first) .btn-add')
					.removeClass('btn-add').addClass('btn-remove')
					.removeClass('btn-success').addClass('btn-danger')
					.html('<span class="glyphicon glyphicon-minus"></span>');
			}).on('click', '.btn-remove', function(e)
			{
				$(this).parents('.entry:first').remove();

				e.preventDefault();
				return false;
			}).on('click','#submit', function(e)
            {
	            alert(123);
	
	            $(".trackId").each(function(i) {
                    $(this).attr('name', "musicTracks["+i+"].trackId");
            	});
	            $(".title").each(function(i) {
	                    $(this).attr('name', "musicTracks["+i+"].title");
	            });
	            $(".author").each(function(i) {
	                $(this).attr('name', "musicTracks["+i+"].author");
	        	});
	            $(".playingSec").each(function(i) {
	                $(this).attr('name', "musicTracks["+i+"].playingSec");
	        	});
	            $("select.artists-select").each(function(i){
	            			var slecteditem= $(this).val();  
	            			alert(slecteditem);
	            			//var slecteditemtext= $(this).find("option:selected").text();  
	            			/* if(slecteditem.length>0){
	            				$(this).attr('name',"musicTracks["+i+"].artists[0].artistId");
	            				$(this).value=slecteditem[0];
	            			} */
	            			artGroup = $('.artists-group')
	            			for(var j=0;j<slecteditem.length;j++){
	            				var input = $("<input/>", {
	            					  type: "hidden",
	            					  
	            					  name: "musicTracks["+i+"].artists["+j+"].artistId",
	            					 value: slecteditem[j]
	            					});
	            				
	            				var newEnt= (input).appendTo(artGroup);
	            			 
	            				//newEnt.attr('name',"musicTracks["+i+"].artists["+j+"].artistId");
	            				//newEnt.value=slecteditem[j];
	            			}
	            			}
	            			);

            })

            	//$('.selectpicker').selectpicker('val', [1 , 2]);	
            	
		}));
  </script>
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
			  <li class="active"><a href="#">Music-CD</a></li>
			  <li><a href="#">Artist</a></li>
			</ul>
		  </div>
		  
		</nav>
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

							<div class="controls"> 
								<c:forEach var="track" items="${musicCD.musicTracks}" varStatus="loop">
									<div class="entry form-horizontal"> 
										<div class="form-group col-sm-3 ">
											<input class="form-control trackId" name="musicTracks.trackId" value="${track.trackId}" type="hidden" />
											<input class="form-control title" name="musicTracks.title" value="${track.title}" type="text" placeholder="Title" />
										</div>
										<div class="form-group col-sm-3 ">
											<input class="form-control author" name="musicTracks.author" value="${track.author}" type="text" placeholder="Author" />
										</div>
										<div class="form-group col-sm-2 ">
											<input class="form-control playingSec" name="musicTracks.playingSec" value="${track.playingSec}" type="text" placeholder="Playing time" />
										</div>
										<div class="form-group col-sm-4">
											<div class="input-group">
					
										  	<select class="form-control selectpicker artists-select" data-live-search="true" multiple="true" name="musicTracks.artists.artistId">
											  	<c:forEach var="artist" items="${artists}">
											  		<option value="${artist.artistId}"
											  		<c:if test="${fn:contains(track.artists, artist)}">
											  			<%System.out.println("xyz"); %>
        													selected
    													</c:if>
											  		> ${artist.artistName}</option>
											  	</c:forEach>
											<select>
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
			
			
		</div>
</body>
</html>
