package com.ajay.springcloud.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/couponapi")
public class CouponRestController {
	
@RequestMapping(value = "/coupons/{code}", method = RequestMethod.GET)
	public String getCoupon(@PathVariable("code") String code) {
		return "Welcome to kickdrum";

	}
}
