package com.PlayWithWords.BO;

import java.util.Iterator;
import java.util.List;

import com.PlayWithWords.CommonMethod.JumpingOrderMaintain;

public class Find_a_Box_BO {

	public List find_a_Box_BO_Method(String character, int Word_length_int, String condition){
		
		Find_a_word_BO find_a_word_BO = new Find_a_word_BO();
		
		List wordlist = find_a_word_BO.find_a_word(character, Word_length_int, condition); 
		
		find_a_word_BO= null; 
		
		JumpingOrderMaintain jumpingOrderMaintain = new JumpingOrderMaintain(); 
		
		//System.out.println(wordlist);
		
		List newWordList= jumpingOrderMaintain.JumpingOrderMaintainingMethod(character,Word_length_int, wordlist ); 
		
		System.out.println(newWordList);
		return newWordList;
		
	}
}
