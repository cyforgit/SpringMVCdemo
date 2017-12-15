package com.myspring.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myspring.dao.BaseDao;
import com.myspring.dao.impl.BaseDaoHibernate;
import com.myspring.dao.pojo.Person;

@Controller
@RequestMapping("/api")
public class HelloSpring {
	@Resource
	private BaseDaoHibernate<Person> baseDaoHibernate;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	@ResponseBody

	public String printHello(HttpServletRequest request) {
		return request.getParameter("name");
	}

	@RequestMapping("/getUser")
	@ResponseBody
	public String getUser(HttpServletRequest request) {

		return "/editUser";
	}

	@RequestMapping("/addUser")
	@ResponseBody
	public String addUser(HttpServletRequest request) {
		Person pseron=new Person();
		pseron.setAge(123);
		pseron.setName("teanam");
		return baseDaoHibernate.save(pseron).toString();
		
	}
}