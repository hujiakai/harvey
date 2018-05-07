package com.harvey.web.controller.base;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class DefaultController extends BaseController {

	@RequestMapping(value="")
	public ModelAndView toIndexPage(){

		ModelAndView mv = new ModelAndView();
		mv.addObject("test", new Date());
		mv.setViewName("index");
		return mv;
	}

}
