package com.likith.myproject.dao;

import java.util.List;

import com.likith.myproject.entity.gym;

public interface gymDAO {

	public List<gym>getGyms();

	public void saveGym(gym theGym);

	public gym getGym(int theId);

	public void deleteItem(int theId);
}
