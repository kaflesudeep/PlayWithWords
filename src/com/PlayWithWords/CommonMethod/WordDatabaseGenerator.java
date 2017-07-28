package com.PlayWithWords.CommonMethod;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordDatabaseGenerator {
	
	// to get word starting with specific character give the character and it will reurn the list of all the word
	public static String search_sp_char_word(String filename) {
	     String file_location_name = "C:\\Users\\sudeep\\Desktop\\word_list\\"+filename+".txt";
	     String word_list=""; 
	     try (BufferedReader br = new BufferedReader(new FileReader(file_location_name))) {
	          String line;
	          														
	          while ((line = br.readLine()) != null) {
	        	  word_list=word_list+" "+line; 
	          }
	      } catch (IOException e) {
	          e.printStackTrace();
	      }
			return word_list;
	  }
}
