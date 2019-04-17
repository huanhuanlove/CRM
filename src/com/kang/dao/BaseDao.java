package com.kang.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface BaseDao<T> {
	
	//添加
	void add(T t);
	
	//删除
	void delete(T t);
	
	//修改
	void update(T t);
	
	//根据id查询
	T findOne(int id);
	
	//查询所有
	List<T> findAll();
	
	//查询总数
	int totalCount(T t);
	
	//根据条件查询总数
	int findCountByCondition(DetachedCriteria criteria);
	
	//根据条件分页
	List<T> findPageByCondition(DetachedCriteria criteria, Integer begin, Integer pageSize);

}
