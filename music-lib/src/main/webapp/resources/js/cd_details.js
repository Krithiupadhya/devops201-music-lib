$(document).ready(  $(function()
		{
			$(document).on('click', '.btn-add', function(e)
			{
				e.preventDefault();

				var controlForm = $('.controls'),
					currentEntry = $(this).parents('.entry:first'),
					newEntry = $(currentEntry.clone()).appendTo(controlForm);

				newEntry.find('input').val('');
					
				newEntry.find('.selectpicker').data('selectpicker', null)
				newEntry.find('.bootstrap-select').replaceWith(function() { return $('select', this); });;
				newEntry.find('.selectpicker').selectpicker('deselectAll');
				newEntry.find('.selectpicker').selectpicker();
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
	            			artGroup = $('.artists-group')
	            			for(var j=0;j<slecteditem.length;j++){
	            				var input = $("<input/>", {
	            					  type: "hidden",
	            					  
	            					  name: "musicTracks["+i+"].artists["+j+"].artistId",
	            					 value: slecteditem[j]
	            					});
	            				
	            				var newEnt= (input).appendTo(artGroup);
	            			 
	            			}
	            			}
	            			);
            })
		}));
