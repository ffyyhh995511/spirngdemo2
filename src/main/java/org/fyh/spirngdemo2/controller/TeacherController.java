package org.fyh.spirngdemo2.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.fyh.spirngdemo2.entity.Teacher;
import org.fyh.spirngdemo2.service.TeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/teacher")
public class TeacherController extends BaseController{
	Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	@Resource
	TeacherService teacherService;
	
	/**
	 * 测试客户端发送json数据到后端
	 
	 postman --> header --> 设置 Content-Type = application/json --> body --> raw --> 下面的json数据
	 {
        "id": "233",
        "name": "222222222222222",
        "createTime": 1506665480575
     }
     
	 * @param teacher
	 * @return
	 */
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public Object save(@RequestBody Teacher teacher){
		int save = teacherService.save(teacher);
		if(save > 0){
			return responseSuccess("保存成功",teacher);
		}
		return responseFail("保存失败");
	}
	
	/**
	 * 测试使用mybitas的参数，不用之前的对象作为参数查询
	 * @param name
	 * @return
	 */
	@RequestMapping(value="/searchByName",method=RequestMethod.GET)
	public Object searchByName(String name){
		logger.info(getParameterMap());
		logger.info(getHeadsMap());
		List<Teacher> searchByName = teacherService.searchByName(name);
		return responseSuccess(searchByName);
	}
	
	/**
	 * 测试批量插入
	 * @return
	 */
	@RequestMapping(value="/insertBatch",method=RequestMethod.GET)
	public Object insertBatch(){
		return responseSuccess(teacherService.insertBatch());
	}
	
	/**
	 * 测试批量删除，用的是mybatis的foreach:数据是数组
	 * @param ids
	 * @return
	 */
	@RequestMapping(value="/deleteBatch",method=RequestMethod.GET)
	public Object deleteBatch(String ids){
		return responseSuccess(teacherService.deleteBatch(ids));
	}
	
	/**
	 * 一对多关联查询（运用mybatis的collection关键字）
	 * @return
	 */
	@RequestMapping(value="/queryWithRelevanceDetails",method=RequestMethod.GET)
	public Object queryWithRelevanceDetails(HttpServletResponse res){
		res.setHeader("Access-Control-Allow-Origin", "*");
		return responseSuccess(teacherService.queryWithRelevanceDetails());
	}
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value="/queryPage",method=RequestMethod.GET)
	public Object query(Integer pageNum,Integer pageSize){
		pageNum = pageNum == null ? 1 : pageNum;
		pageSize = pageSize == null ? 10 :pageSize; 
		pageSize = pageSize > 500 ? 500 : pageSize;
		try {
			PageInfo<Teacher> pageQuery = teacherService.pageQuery(pageSize, pageSize);
			return responseSuccess("成功", pageQuery);
		} catch (Exception e) {
			logger.error("查询不成功",e);
			logger.error(getHeadsMap());
			logger.error(getParameterMap());
		}
		return responseFail("查询不成功");
	}
	
}
