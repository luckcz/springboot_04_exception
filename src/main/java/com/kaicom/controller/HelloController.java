package com.kaicom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kaicom.enums.BusinessCode;
import com.kaicom.exception.BusinessException;
@Controller
public class HelloController {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		/*int i = 1/0;*/
		throw new BusinessException(BusinessCode.YEWU_EXECEPTION.getKey(),BusinessCode.YEWU_EXECEPTION.getValue());
	}
}
