package com.PlayWithWords.BO;

import java.util.List;

import com.PlayWithWords.BO.Find_a_word_BO; 

public class Play_With_Word_BO {

	public List CallingBoMethod(String character, String Word_length, String condition){
		List listofwords = null;  
		// determing which Bo to call
		
	
		int Word_length_int=Integer.parseInt(Word_length);
		 
		if(!condition.equalsIgnoreCase("B")){
			
		
		
		if(character!=null && Word_length_int>0){
			Find_a_word_BO find_a_word_BO = new Find_a_word_BO(); 
			
			listofwords = find_a_word_BO.find_a_word (character, Word_length_int, condition ); 
		}
		}
		else{
			
			Find_a_Box_BO find_a_Box_BO= new Find_a_Box_BO(); 
			condition = "N"; // condition shouldnt repeat by default.
			listofwords =find_a_Box_BO.find_a_Box_BO_Method(character, Word_length_int, condition); 
			
		}
		
		
		
		// call to the formater method and formart the word that needs to be displayes in string.
		
		return listofwords; 
				
		
	}


	
}
