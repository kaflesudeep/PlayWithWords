package com.PlayWithWords.PuzzleSolver;



import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;

import com.PlayWithWords.PuzzleDAO.FindAWordDAO;




		@Controller
		public class PuzzleSolver_Controller extends HttpServlet {
		 
			@RequestMapping("/welcome")
			public ModelAndView homePage() {
					 
				ModelAndView modelandview = new ModelAndView("Page_Layout"); // jsp name without .jsp
				modelandview.addObject("welcomeMessage", "using object we are setting this message to the welcomemessage object that can be used in jsp");
				
				return modelandview;
			}
			
			
			@RequestMapping(value="/submitForm", method=RequestMethod.POST)
			public @ResponseBody String processWord(@ModelAttribute FindAWordDAO findaworddAO) {
				
					 
				
			

							
				return "sudeep";
			}
			
			


	
	
}
