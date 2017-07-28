package com.servelet.file;

	import java.io.*;  
import java.sql.*;  
import java.util.LinkedHashMap;


import java.util.Map;







	import javax.servlet.ServletException;  
import javax.servlet.http.*;  

import com.PlayWithWords.BO.Play_With_Word_BO;
import com.mysql.jdbc.Connection;
			// class to check if the userid is already used or not for saving the credential in RegisterCredential.jsp. 

			public class ajax_call_servelet extends HttpServlet {  
			  
				
				 private static final long serialVersionUID = -734503860925086969L;  
				 
				 
				 protected void doPost(HttpServletRequest request, HttpServletResponse response)  
				            throws ServletException, IOException {  
				        response.setContentType("text/html;charset=UTF-8");  
				        PrintWriter out = response.getWriter();  
				        try {  
				  		    
				            String chatacters = request.getParameter("chatacters");
				            String word_length = request.getParameter("word_length"); 
				            String character_repeat = request.getParameter("repeat_character"); 
				            System.out.println("repeat  "+character_repeat); 
				           
				           // call to business logic and set the word list.
				            Play_With_Word_BO play_With_Word_BO = new Play_With_Word_BO(); 
				            String result= (play_With_Word_BO.CallingBoMethod(chatacters, word_length, character_repeat)).toString(); 
				            
				               
						   
				           
				           if(result!=null){
								   out.println(result);  
				           }else{
				        	   out.println("<font color=red> <b>cannot find any word</font>");
				           }
				                

				        } catch (Exception ex) {  
				            out.println("Error ->" + ex.getMessage());  
				        } finally {  
				            out.close();  
				        }  
				    }  
				  
				    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
				            throws ServletException, IOException {  
				        doPost(request, response);  
				    }  
				}
				


			
