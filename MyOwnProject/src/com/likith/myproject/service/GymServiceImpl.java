package com.likith.myproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.likith.myproject.dao.gymDAO;
import com.likith.myproject.entity.gym;
  


@Service
public class GymServiceImpl implements GymService {

    @Autowired
	private gymDAO gymdao;

	@Override
	@Transactional
	public List<gym> getGyms() {
		// TODO Auto-generated method stub
		return gymdao.getGyms();
	}

	@Override
	@Transactional
	public void saveGym(gym theGym) {
		// TODO Auto-generated method stub
		gymdao.saveGym(theGym);
	}

	@Transactional
	@Override
	public gym getGym(int theId) {
		// TODO Auto-generated method stub
		return gymdao.getGym(theId);
	}

	@Transactional
	@Override
	public void deleteItem(int theId) {
		// TODO Auto-generated method stub
              gymdao.deleteItem(theId);		
	}
	

}
