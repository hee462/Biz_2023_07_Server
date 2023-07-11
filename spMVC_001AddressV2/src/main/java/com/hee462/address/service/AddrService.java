package com.hee462.address.service;

import java.util.List;

import com.hee462.address.models.AddrDto;

/*
 * Service Spring Project 에서 비즈니스 로직을 담당하는 부분
 * 
 * Controller 에서 데이터를 받고, 일부 데이터를 가공하여 Dao로 전달
 * Dao 에서 return 데이터를 받고, 일부 데이터를 가공하여 Controller로 전달
 * 
 * 
 */
public interface AddrService {
	public List<AddrDto> selectAll();
	public AddrDto findById(String id);
	public String idCheck(String id);
	public List<AddrDto> findByName(String name);
	public List<AddrDto> findByTel(String tel);
	
	
	public int insert(AddrDto addrdto);
	public int update(AddrDto addrdto);
	public int delete(String id);


}
