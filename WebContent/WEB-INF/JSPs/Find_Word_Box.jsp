<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Let's Find the Word: </title>

<script>
<%@ include file="/Resource/js/StringPosition.js"%>
<%@ include file="/Resource/js/search_box_word_FormAjax.js"%>
</script>
<style>
.form-group {

margin-left:50px;

}

.form-control{

width:25px;
margin-left:20px;  
display:inline;
width:250px; 
}

.word_position{
width:25px;

}
</style>

<script>
$(document).ready(function(){
    $("#create_Box_button").click(function(){
    $( "#box_create").children().remove();
    var chatacters_xaxis = $("#character_xandY").val(); 
    var chatacters_yaxis = $("#character_xandY").val(); 
    alert(chatacters_xaxis); 
   
    for (var j = 0; j<chatacters_yaxis; j++){
   		 var create="";
     	 for (var i = 0; i<chatacters_xaxis; i++){
                 create = create+"<input name='txtId' type='text' style='width: 25px; margin:10px;' maxlength='1'/> ";
                }
      create= create+ "<br>";
      $("#box_create").append(create);
       }
    
    });
});



	


</script>


</head>
<h2>Let's Find the Word:</h2>

<div class="input">
<h3>Give Your Word Informaion </h3>


 

    <div class="form-group">
      <label for="usr">Dimention of Your Box</label>
      <input type="text" class="" id="character_xandY" placeholder="Length of X axis" >
<!--       <input type="text" class="" id="character_y" placeholder="Length of Y axis"> -->
      <button id="create_Box_button">Create Boc</button>
    </div>
    
   <div id="box_create" class="form-group"></div>
    <div class="form-group">
      <label for="pwd">Length of Word:</label>
      <input type="text" class="form-control" id="word_length_1" >
    </div>
    
    
   
    
<!--     // for finding a word no needs for position -->
<!--     <div class="form-group"> -->
<!--       <label for="pwd" style="width:100%">Any Guess About the Position of Letter</label> -->
<!--       <div id="add_char_fields"></div> -->
<!--     </div> -->
    
   
    
    <div id="string_position"></div>
  

<button  class="submit-button1" onclick="searchmy_box_Word_ajax()" id="findMyWord">Find My Word </button>
<span class="status"></span>

<H4> Result for Your Word is:</H4>

<div id="result_search_box_word"></div>

</div>



</html>