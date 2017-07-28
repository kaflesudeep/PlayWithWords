
	
	function searchmy_box_Word_ajax(){
		var chatacters = createBox_to_String(); 
		var word_length = $("#word_length_1").val(); 
		var  repeat_character="B"; 
	    
	     $.ajax({  
            type: "POST",  
            url: "LoadForm",
//            data: {"usernameC=": usernameC}, 
            
            data: {chatacters: chatacters, word_length: word_length, repeat_character:repeat_character },
            
            success: function(msg){  
            	chatacters,
          	  $("#result_search_box_word").html(msg);
            
//                 $(".status").ajaxComplete(function(event, request, settings){  
                       
//                     $(".status").html(msg);  

//                 });  
            }  
        });
	    
	    
	  	
	  	//$("#result").append("<td id='error'>Please enter your valid email address.</td>").css({'color':'red'});	  
	     
	  	
	}; 

	
	

