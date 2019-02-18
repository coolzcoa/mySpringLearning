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
	public List<gym> getGyms() {
		// TODO Auto-generated method stub4
		Session session = sessionfactory.getCurrentSession();
	    Query<gym>theQuery = session.createQuery("from gym order by address",gym.class);   
	    List<gym>gyms = theQuery.getResultList();
	    return gyms;
	}

	@Override
	public void saveGym(gym theGym) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.getCurrentSession();
		session.saveOrUpdate(theGym);	
	}
	
	public gym getGym(int theid) {
		Session session = sessionfactory.getCurrentSession();
		gym theGym = session.get(gym.class,theid);
		return theGym;
	}

	@Override
	public void deleteItem(int theId) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.getCurrentSession();
	    gym theGym = session.get(gym.class,theId);  
		session.delete(theGym);
	}

}
