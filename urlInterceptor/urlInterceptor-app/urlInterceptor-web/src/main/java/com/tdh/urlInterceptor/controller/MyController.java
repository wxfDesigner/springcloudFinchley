package com.tdh.urlInterceptor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.google.gson.Gson;
import com.tdh.urlInterceptor.Application;
import com.tdh.urlInterceptor.model.Student;
import com.tdh.urlInterceptor.service.StudentService;

@RestController
@RequestMapping("/test")
public class MyController {

	private final Logger logger = LoggerFactory.getLogger(Application.class);
	@Reference
	private StudentService studentService;

	@RequestMapping("/helloWorld")
	public String helloWorld() {
		Gson gson = new Gson();
		logger.info(gson.toJson(studentService.selectByPrimaryKey(1)));
		return "helloWorld";
	}

	@RequestMapping("/add")
	public String add() {
		Student record = new Student();
		record.setAge(11);
		record.setClassid(11);
		record.setName("小明");
		for (int i = 0; i < 10000; i++) {
			studentService.insert(record);
		}
		return "ok";
	}

}
