package com.hee462.car.persistance;

import com.hee462.car.model.CarDto;

public interface CarDao {
	public int insert(CarDto carDto);
	
	
	public CarDto findTachoByCarNum(String carnum);
}
