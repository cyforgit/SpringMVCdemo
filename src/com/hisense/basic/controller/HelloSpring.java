package com.hisense.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloSpring {
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String printHello() {
		return "hello";
	}
}