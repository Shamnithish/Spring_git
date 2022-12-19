package com.example.demo;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {
	        @RequestMapping("index")
            public ModelAndView index(UserDetails ud)
            {
	        	ModelAndView mav= new ModelAndView();
	        	mav.addObject("details",ud);
	        	mav.setViewName("index");
            	return mav;
            }
	       
}
