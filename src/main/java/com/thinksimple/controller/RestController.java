package com.thinksimple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {


	@RequestMapping(value = "/getresponse", method = RequestMethod.GET)
	@ResponseBody
	public String restResponse(){
		return "Server Response";
	}
}
