package org.fyh.spirngdemo2.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.fyh.spirngdemo2.mapper.TeacherMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	@Resource
	TeacherMapper teacherMapper;
	
	@RequestMapping("/hello")
    public Integer index() {
        return 999;
    }
    
    @RequestMapping("/hello2")
    public Object index2() {
    	Map<String,String> map = new HashMap<>();
    	map.put("1", "1");
    	map.put("2", "2");
    	map.put("3", "3");
    	map.put("4", "4");
        return map;
    }
    
    @RequestMapping("/hello3")
    public String index3() {
    	return "test service";
    }
    
    @RequestMapping("/test4")
    public Object test4() {
    	return teacherMapper.selectByPrimaryKey("1");
    }
}