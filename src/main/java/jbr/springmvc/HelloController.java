package jbr.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView hello() {
		return new ModelAndView("welcome", "message", "Welcome to Spring MVC using Maven!!!");
	}

	@RequestMapping(value = "/burhan" ,method = RequestMethod.GET)
	public String burhan(){
		return "burhan";
	}

	@RequestMapping(value = "/husamettin", method = RequestMethod.GET)
	public String husamettin(){
		return "husamettin";
	}
}
