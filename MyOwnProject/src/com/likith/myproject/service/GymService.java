package com.likith.myproject.service;

import java.util.List;

import com.likith.myproject.entity.*;
public interface GymService {

	public List<gym>getGyms();
	
	public void saveGym(gym theGym);

	public gym getGym(int theId);

	public void deleteItem(int theId);
}
