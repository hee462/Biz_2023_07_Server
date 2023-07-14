package com.hee462.car.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hee462.car.models.carDto;

public interface carDao {
	@Select("SELECT * FROM tbl_car ORDER BY c_startDate DESC, c_startTime DESC ")
	public List<carDto> selectAll();
	
	public int insert(carDto dto);
	public int update(carDto dto);
	
}
