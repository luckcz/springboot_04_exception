package com.kaicom.exception;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyControllerAdvice {
	/**
	 * 全局补货异常，只要作用在@RequestMapping方法上，所有的异常信息都会被捕获到
	 * @param e
	 * @return
	 */
	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public Map<String,Object> errorhandler(Exception e){
		Map<String,Object> map = new LinkedHashMap<String, Object>();
		map.put("code", -1);
		map.put("msg", e.getMessage());
		return map;
	}

	@ResponseBody
	@ExceptionHandler(value = BusinessException.class)
	public Map<String,Object> errorhandler(BusinessException e){
		Map<String,Object> map = new LinkedHashMap<String, Object>();
		map.put("code", e.getCode());
		map.put("msg", e.getMsg());
		return map;
	}
}
