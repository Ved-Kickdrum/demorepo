package com.ajay.springcloud.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class CouponRestController {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String getCoupon() {
		return "Welcome to kickdrum";
	}

	@RequestMapping(value = "/health", method = RequestMethod.GET)
	public String getHealth() {
		return "your health";
	}
	
}
