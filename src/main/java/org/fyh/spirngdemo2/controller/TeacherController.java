package org.fyh.spirngdemo2.controller;

import java.util.List;

import javax.annotation.Resource;

import org.fyh.spirngdemo2.entity.Teacher;
import org.fyh.spirngdemo2.service.TeacherService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	
	
	@Resource
	TeacherService teacherService;
	
	@RequestMapping(value="/searchByName",method=RequestMethod.GET)
	public Object searchByName(String name){
		List<Teacher> searchByName = teacherService.searchByName(name);
		return searchByName;
	}
	
	@RequestMapping(value="/insertBatch",method=RequestMethod.GET)
	public Object insertBatch(){
		return teacherService.insertBatch();
	}
	
	@RequestMapping(value="/deleteBatch",method=RequestMethod.GET)
	public Object deleteBatch(String ids){
		return teacherService.deleteBatch(ids);
	}
	
	@RequestMapping(value="/queryWithRelevanceDetails",method=RequestMethod.GET)
	public Object queryWithRelevanceDetails(){
		return teacherService.queryWithRelevanceDetails();
	}
	
	
}
