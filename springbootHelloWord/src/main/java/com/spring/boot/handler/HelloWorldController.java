package com.spring.boot.handler;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration
@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "HELLO　ケイシン君";
	}
}
