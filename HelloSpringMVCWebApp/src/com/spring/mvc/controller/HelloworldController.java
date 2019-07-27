package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.service.HelloService;

@Controller
@RequestMapping(value = "/")
public class HelloworldController {
	@Autowired
	HelloService hs;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getHelloMsg()
	{
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("HomeMsg", hs.getMsg());
		//new ModelAndView("home","HomeMsg", "Hello Welcome to Spring MVC World");
		return mv;
	}
	
	@RequestMapping(value = "again", method = RequestMethod.GET)
	public ModelAndView getHelloMsgagain()
	{
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("HomeMsg", hs.getMsgAgain());
		//new ModelAndView("home","HomeMsg", "Hello Welcome to Spring MVC World");
		return mv;
	}

}
