package org.fyh.spirngdemo2.interceptor;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

public class LoginInterceptor implements HandlerInterceptor{
	
	Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		getParameterMap(request);
		return true;
	}
	
	/**
	 * 打印参数
	 * @return
	 */
	private void getParameterMap(HttpServletRequest request){
		Enumeration<String> enu= request.getParameterNames();
		Map<String,Object> map = new HashMap<String, Object>();
		while(enu.hasMoreElements()){
			String key = (String) enu.nextElement();
			Object value = request.getParameter(key);
			map.put(key, value);
		}
		if(map.size() > 0 ){
			logger.info("params = " + JSON.toJSONString(map));
		}
		
	}

}
