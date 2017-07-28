function createBox_to_String(){
	
	
	var $inputs = jQuery('#box_create :input');
	var values = ""; 
	$inputs.each(function() {
	    values = values+( jQuery(this).val());
	});

	
	return values; 

	}


