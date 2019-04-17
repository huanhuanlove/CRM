package com.kang.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.kang.dao.BaseDao;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T>{
	
	private Class pClass;
	

	public BaseDaoImpl() {
		//第一步的到当前的class
		Class clazz = this.getClass();
		
		//第二步得到父类的参数化类型BaseDaoImpl<Custom>
		Type type = clazz.getGenericSuperclass();
		ParameterizedType pType = (ParameterizedType) type;
System.out.println(pType);
		
		//得到实际类型参数<Custom>
		Type[] types = pType.getActualTypeArguments();
		Class tClass = (Class) types[0];
		this.pClass = tClass;
System.out.println(pClass);
	}

	@Override
	public void add(T t) {
		this.getHibernateTemplate().save(t);
		
	}

	@Override
	public void delete(T t) {
		this.getHibernateTemplate().delete(t);
		
	}

	@Override
	public void update(T t) {
		this.getHibernateTemplate().update(t);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public T findOne(int id) {
		return (T) this.getHibernateTemplate().get(pClass, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		return (List<T>) this.getHibernateTemplate().find("from "+pClass.getSimpleName());
	}

	@Override
	public int totalCount(T t) {
		List<?> find = this.getHibernateTemplate().find("select count(*) from "+pClass);
		String string = find.toString();
		int count = Integer.parseInt(string);
		return count;
	}

	@Override
	public int findCountByCondition(DetachedCriteria criteria) {
		criteria.setProjection(Projections.rowCount());
		
		//可添加条件
		//criteria.add();
		
		List<Long> list = (List<Long>) this.getHibernateTemplate().findByCriteria(criteria);
		if (list.size()>0) {
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<T> findPageByCondition(DetachedCriteria criteria, Integer begin, Integer pageSize) {
		criteria.setProjection(null);
		
		//可添加条件
		//criteria.add();
		
		return (List<T>) this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
	}

}
