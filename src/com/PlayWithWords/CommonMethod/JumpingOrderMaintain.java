package com.PlayWithWords.CommonMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class JumpingOrderMaintain {

	public List JumpingOrderMaintainingMethod(String character, int word_length_int, List wordlist) {
		// TODO Auto-generated method stub
		HashSet box_words_list = new HashSet();
		HashMap word_char_location = new HashMap();
		Common_operation_methods common_operation_methods = new Common_operation_methods(); 
		String box_array[][] = common_operation_methods.Create2Darray(character); 
		 word_char_location = common_operation_methods.locationDatabaseCreate(box_array);
		Iterator<String> it = wordlist.iterator();
	     while(it.hasNext()){
	    	
	       String possible_word= it.next(); 
	       boolean positiveword = verify_Jumping_orderof_word(possible_word, word_char_location); 
	       if(positiveword){
	    	   box_words_list.add(possible_word); 
	       }       
	      }
	     List sortedList = new ArrayList(box_words_list);
	 	if(!box_words_list.isEmpty()){
	     	Collections.sort(sortedList);
	
	 	}
	 return sortedList;
	 	
	
	}

	private boolean verify_Jumping_orderof_word(String possible_word,HashMap word_char_loc) {
		HashMap word_char_location = word_char_loc;
		boolean test= true; 
		for( int i = 0; i< possible_word.length()-1;i++ ){
			String currentChar= ""+possible_word.charAt(i);
			String nextChar= ""+possible_word.charAt(i+1);
			String[] currentChar_location = test_seq(currentChar, word_char_location ); 
			String[] nextChar_location = test_seq(nextChar, word_char_location ); 
			
			String new_possible_location= newLocationFinder(currentChar_location, nextChar_location ); 
			
			if(new_possible_location.equalsIgnoreCase("")){
				test= false; 
			}else{
				word_char_location.replace(nextChar, new_possible_location); 
			}
		
		//new_location.put(next_char, newlocation); 
			
		
		String s= (String) word_char_location.get(nextChar); 
		if(s==""){
			test=false; 
			break; 
			
		}
		
	}
			
		return test;
	}

	private String newLocationFinder(String[] currentChar_location,	String[] nextChar_location) {
		String newlocation = ""; 
		
		 for(int i = 0; i<currentChar_location.length; i=i+2){
			 int current_y= Integer.parseInt(currentChar_location[i]); 
			 int current_x= Integer.parseInt(currentChar_location[i+1]); 
			 int nextloc_size  = nextChar_location.length; 
			 for(int j=0; j<nextloc_size; j=j+2){
				 boolean test= false; 
				 if(!nextChar_location[j].equalsIgnoreCase("null")){
					 int next_y= Integer.parseInt(nextChar_location[j]); 
					 int nextt_x= Integer.parseInt(nextChar_location[j+1]); 
					 
					 test = test_axis(current_y, current_x, next_y, nextt_x);
					 
					 if(test){
						 newlocation = newlocation + " "+next_y+" "+nextt_x; 
					 }
				 }
			    }
			 }
		return newlocation;
	}

	private boolean test_axis(int yaxis, int xaxis, int next_Yaxis,int next_Xaxis) {
		// TODO Auto-generated method stub
		boolean test = false; 
		int Check_Array[][] = {{1, -1}, {1, 0}, {1, 1}, {-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}};
		if(yaxis==next_Yaxis && xaxis==next_Xaxis){
			test= false; 
			 
		}else{
			boolean xaxis_tes = ((xaxis-next_Xaxis)<=1&&(xaxis-next_Xaxis)>=-1); 
			boolean yaxis_tes = ((yaxis-next_Yaxis)<=1&&(yaxis-next_Yaxis)>=-1); 
			
		  if(xaxis_tes &&  yaxis_tes){
			  test= true; 
		  }
		}

		return test;
		
	}

	private String[] test_seq(String character, HashMap word_char_location) {
		// TODO Auto-generated method stub
		String current_location = (String) word_char_location.get(character); 
		String[] character_location_co = current_location.trim().split(" ");
				return character_location_co;
		
	}

	

}
