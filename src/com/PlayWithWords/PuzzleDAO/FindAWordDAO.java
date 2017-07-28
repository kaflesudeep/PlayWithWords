package com.PlayWithWords.PuzzleDAO;

public class FindAWordDAO {
	 private String character_range; 
	 private int word_length; 
	 private String character_position;
	
	 public FindAWordDAO(){}
	 
	 public FindAWordDAO(String character_range, int word_length, String character_position){
		 super();
		 this.character_range=character_range; 
		 this.word_length=word_length; 
		 this.character_position= character_position; 
		 
	 }

	public String getCharacter_range() {
		return character_range;
	}
	public void setCharacter_range(String character_range) {
		this.character_range = character_range;
	}
	public int getWord_length() {
		return word_length;
	}
	public void setWord_length(String string) {
		this.word_length = Integer.parseInt(string);
	}
	public String getCharacter_position() {
		return character_position;
	}
	public void setCharacter_position(String character_position) {
		this.character_position = character_position;
	}
	
}
