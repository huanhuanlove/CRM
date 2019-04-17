package com.kang.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.kang.dao.UserDao;
import com.kang.domin.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public User login(User user) {
		List<User> list = (List<User>) this.getHibernateTemplate().find("from User where name=? and password=?", user.getName(),user.getPassword());
		if (list.size()>0) {
			User u = list.get(0);
			return u;
		}
		return null;
	}

}
