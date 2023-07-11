package com.hee462.address.dao;

import java.util.List;

import com.hee462.address.models.HobbyByAidVO;

public interface HobbyDao {
	
	public List<HobbyByAidVO> findHobbyByAID(String aid);
	
	
	
	
	
}
