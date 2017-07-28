<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script>
<%@ include file="/Resource/js/homepageMenu.js"%>

</script>



<style><%@ include file="/Resource/css/homepage_layout.css"%>
<%@ include file="/Resource/css/homepage_menu.css"%>

		
</style>

<style>


</style>

</head>
<body>
<div class="header">
<%@include file="PuzzleSolver_HomePage.jsp" %>
</div>

 <div id= 'mainbody' class="clearfix">
	 	   
	 	   
	 	    <div class="column content" id="wordP" >   
			     <%@include file="Find_A_Word.jsp" %> 
 			</div>
	  
	 
	       <div class="column content" id="boxP" >   
			      <%@include file="Find_Word_Box.jsp" %> 
		   </div>
	  
	  		 
			 <div class="column content" id="sudokuP" >   
			      <%@include file="sodoku.jsp" %> 
			</div>
			
	 			 <div class="column content" id="commingsoonP" >   
			      <%@include file="Comming_Soon.jsp" %> 
			</div>
			
			 <div class="column content" id="contactusP" >   
			      <%@include file="Contactus.jsp" %> 
			</div>
			


        
       </div>


</div>
</body>
</html>