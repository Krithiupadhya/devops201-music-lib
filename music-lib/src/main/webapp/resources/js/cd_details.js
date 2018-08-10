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
