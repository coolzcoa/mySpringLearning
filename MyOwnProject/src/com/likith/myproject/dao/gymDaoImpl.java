package com.likith.myproject.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.likith.myproject.entity.gym;

@Repository
public class gymDaoImpl implements gymDAO {

	
	@Autowired
	public SessionFactory sessionfactory;
	
	@Override
	@Transactional
	public List<gym> getGyms() {
		// TODO Auto-generated method stub4
		Session session = sessionfactory.getCurrentSession();
	    Query<gym>theQuery = session.createQuery("from gym",gym.class);   
	    List<gym>gyms = theQuery.getResultList();
	    return gyms;
	}

}
