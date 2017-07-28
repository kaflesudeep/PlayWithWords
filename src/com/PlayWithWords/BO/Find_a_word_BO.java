package com.PlayWithWords.BO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.PlayWithWords.CommonMethod.Common_operation_methods;
import com.PlayWithWords.CommonMethod.WordDatabaseGenerator;

public class Find_a_word_BO {

	
	public List find_a_word(String characters, int word_length, String condition) {
		
		Set sp_char_words = new HashSet();
		String patternString = "\\b["+characters+"]{"+word_length+"}\\b"; 
        Pattern pattern = Pattern.compile(patternString);
        HashMap<String, Integer> frequency_characters = new HashMap(); 
        Common_operation_methods common_operation_methods = new Common_operation_methods(); 
        frequency_characters= common_operation_methods.character_frequency(characters); 
        
		WordDatabaseGenerator WordDatabaseGenerator = new WordDatabaseGenerator(); 
		for(int i = 0; i< characters.length(); i++){
			String character_i= ""+characters.charAt(i); 
			String word_list = WordDatabaseGenerator.search_sp_char_word(character_i);
			 Matcher matcher = pattern.matcher(word_list);
			 while(matcher.find()) {
		    	   String word =  matcher.group();
		    	   
		    	   boolean test_frequency = true;
		    	   
		    	  if(!condition.equalsIgnoreCase("Y")){
		    		  HashMap<String, Integer> frequency_word_characters =  new HashMap();  
			           frequency_word_characters= common_operation_methods.character_frequency(word);
			           test_frequency= common_operation_methods.verify_frequency_words(frequency_characters, frequency_word_characters);
			           
		    	  }
		    	    
		          if(test_frequency){
		        	   sp_char_words.add(word);   
		           }
		              		     		  
		    	  }
		}
		
	
		
		
		List sortedList = new ArrayList(sp_char_words);
		Collections.sort(sortedList);
		
		// TODO Auto-generated method stub
		return sortedList;
	}
	// method 1 will take character string and #character as parameter, call diffetrent methods  and return the word list
	
	
	// method 2 will generate the word list with sp lenght
	
	
}
