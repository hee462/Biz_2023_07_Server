package com.hee462.address.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hee462.address.models.AddrDto;

import lombok.Delegate;

public interface AddrDao {
	
	@Select("SELECT * FROM tbl_address ORDER BY a_id")
	public List<AddrDto> selectAll();
	/*
	 * Dto return 할때와 List return할때
	 * 만약 찾는 값이 없으면?
	 * 
	 * 	 Dto return 할때는 null 값
	 *	 List return 할때는 empty값 
	 * 값이 있는지 없는지 검사할때
	 * 	 Dto return if(dto == null)
	 *   List return if(list.isEmpty())
	 * 
	 */
	@Select("SELECT *FROM tbl_address WHERE a_id =#{id}")
	public AddrDto findById(String id);

	public List<AddrDto> findByName(String name);
	
	public int insert(AddrDto addrdto);
	
	public int update(AddrDto addrdto);
	
	@Delete("DELETE FROM tbl_address WHERE a_id = #{id}")
	public int delete(String id);
}
