
	
	function searchmyWord(){
		
		var chatacters = $("#character_range").val(); 
	    var word_length = $("#word_length").val(); 
	    var  repeat_character="N"; 
	    if ($("#repeat_character").is(":checked")) {
	    	repeat_character="Y"; 
	    }
	    
	      $.ajax({  
            type: "POST",  
            url: "LoadForm",
//            data: {"usernameC=": usernameC}, 
            
            data: {chatacters: chatacters, word_length: word_length, repeat_character:repeat_character },
            
            success: function(msg){  
            	chatacters,
          	  $("#result_search_word").html(msg);
            
//                 $(".status").ajaxComplete(function(event, request, settings){  
                       
//                     $(".status").html(msg);  

//                 });  
            }  
        });
	    
	    
	  	
	  	//$("#result").append("<td id='error'>Please enter your valid email address.</td>").css({'color':'red'});	  
	     
	  	
	}; 

	
	

