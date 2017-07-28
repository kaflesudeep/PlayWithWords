<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Let's Find the Word: </title>

<script>
<%@ include file="/Resource/js/StringPosition.js"%>
<%@ include file="/Resource/js/searchmyWordAjax.js"%>
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
	
}); 

</script>
</head>
<h2>Let's Find the Word:</h2>

<div class="input">
<h3>Give Your Word Informaion </h3>


 
 <form action=""   method="post" id="submitForm">
    <div class="form-group">
      <label for="usr">Character in your words:</label>
      <input type="text" class="form-control" id="character_range" >
    </div>
    <div class="form-group">
      <label for="pwd">Length of Word:</label>
      <input type="text" class="form-control" id="word_length" >
    </div>
    
    <div  class="form-group">
       <input type="checkbox" name="vehicle1"  id="repeat_character" value="Y"> Do you want to repeat character?<br>
      
    </div>
   
    
<!--     // for finding a word no needs for position -->
<!--     <div class="form-group"> -->
<!--       <label for="pwd" style="width:100%">Any Guess About the Position of Letter</label> -->
<!--       <div id="add_char_fields"></div> -->
<!--     </div> -->
    
   
    
    <div id="string_position"></div>
  </form>

<button  class="submit-button1" onclick="searchmyWord()" id="findMyWord">Find My Word </button>
<span class="status"></span>

<H4> Result for Your Word is:</H4>

<div id="result_search_word"></div>

</div>



</html>