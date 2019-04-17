package com.kang.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.kang.domin.User;
import com.kang.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	//实现setter注入及模型驱动
	private static final long serialVersionUID = 1L;
	private User user = new User();
	private UserService userService;
	
	@Override
	public User getModel() {
		return user;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	//登录
	public String login() {
		
		User u1 = userService.login(user);
		String msg = null;
		if (u1!=null) {
			addFieldError(msg, "登录成功");
			ServletActionContext.getRequest().getSession().setAttribute("user", u1);
			return "loginSuccess";
		}
		
		addFieldError(msg, "登录失败，用户名或密码错误！！！");
		return "loginError";
	}
	
	
	
}
