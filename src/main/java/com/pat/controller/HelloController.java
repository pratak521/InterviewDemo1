package com.pat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pat.service.BPOClass;

@RestController
public class HelloController {
	@RequestMapping
	public String getMsg()
	{
		return BPOClass.getMsgFromBPO();
	}
	

}
