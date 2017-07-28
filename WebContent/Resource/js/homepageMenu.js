
$(document).ready(function(){
		$("#wordP").show();
		$("#boxP").hide();
		$("#sudokuP").hide();
		$("#commingsoonP").hide();
		$("#contactusP").hide();
	});
	
	
$(document).ready(function(){
	$("#wordM").click(function(){
		$("#wordP").show();
		$("#boxP").hide();
		$("#sudokuP").hide();
		$("#commingsoonP").hide();
		$("#contactusP").hide();
	});
	
	$("#boxM").click(function(){
		$("#wordP").hide();
		$("#boxP").show();
		$("#sudokuP").hide();
		$("#commingsoonP").hide();
		$("#contactusP").hide();
	}); 
	
	$("#sudokuM").click(function(){
		$("#wordP").hide();
		$("#boxP").hide();
		$("#sudokuP").show();
		$("#commingsoonP").hide();
		$("#contactusP").hide();
	}); 
	
		
	
	$("#commingsoonM").click(function(){
		$("#wordP").hide();
		$("#boxP").hide();
		$("#sudokuP").hide();
		$("#commingsoonP").show();
		$("#contactusP").hide();
		
	}); 
	$("#contactusM").click(function(){
		$("#wordP").hide();
		$("#boxP").hide();
		$("#sudokuP").hide();
		$("#commingsoonP").hide();
		$("#contactusP").show();
		
	}); 	
	
	
}); 

