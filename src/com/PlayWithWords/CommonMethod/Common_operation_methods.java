package com.PlayWithWords.CommonMethod;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Common_operation_methods {

	
 public static HashMap<String,  Integer> character_frequency(String Frequency_word) {
		 
		 HashMap<String,  Integer> frequency = new HashMap(); 
		 
		int freq_word_size= Frequency_word.length(); 
		 
  	   for(int j = 0; j<freq_word_size; j++){
  		   String word_character_j= ""+Frequency_word.charAt(j); 
  		 
  			   if(frequency.containsKey(word_character_j)){
  				 frequency.put(word_character_j, frequency.get(word_character_j)+1);
  				 
  			   }
  			   if(!frequency.containsKey(word_character_j)){
  				 frequency.put(word_character_j, 1); 
  			   
  			   }
  		   }
  	  
  	   
  	   
		return frequency;
		 
		 
		 
		 
	 } 
 
 public boolean verify_frequency_words(HashMap<String, Integer> frequency_characters,	HashMap<String, Integer> frequency_word_characters) {
	 boolean result= true;
	 
	 
	 Iterator itr = frequency_word_characters.entrySet().iterator(); 
	 while(itr.hasNext()){
		 
		 Map.Entry char_frequency = (Map.Entry)itr.next();
		 String character=(String) char_frequency.getKey(); 
		 int character_freq = (int) char_frequency.getValue(); 
		 
		 if(frequency_characters.containsKey(character)){
			 if(frequency_characters.get(character) != null && frequency_characters.get(character)<character_freq){
				 result = false; 
				 break; 
			 }
		 }
		
			
	 }
	
	return result;
	 
	 
	 
	
}

 	public String[][] Create2Darray(String character) {
 		int array_size=(int) Math.sqrt(character.length());
 		String twoDarray[][] = new String[array_size][array_size]; 
 		int pos= 0; 
 		for(int i = 0; i<array_size; i++){
 			for(int j = 0; j<array_size; j++){
 				twoDarray[i][j]= ""+character.charAt(pos); 
 				pos++; 
 				}
 		}
 		return twoDarray;
	}

	public HashMap locationDatabaseCreate(String[][] box_array) {
		HashMap word_char_location = new HashMap();
		for(int i = 0; i<box_array.length; i++){
			for(int j = 0; j<box_array[i].length; j++){
				String character = box_array[i][j]; 
				String location=""; 
				if(word_char_location.containsKey(character)){
					location = (String) word_char_location.get(character); 
					location = location+" " + i + " "+j;  
					word_char_location.put(character, location); 
				}else{
					location = i + " "+j;
					word_char_location.put(character, location);
				}
			}
			
		}
				
		return word_char_location;
	}
 
}
