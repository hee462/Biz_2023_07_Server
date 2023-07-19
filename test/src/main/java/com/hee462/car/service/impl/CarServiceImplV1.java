package com.hee462.car.service.impl;

import org.springframework.stereotype.Service;

import com.hee462.car.model.CarDto;
import com.hee462.car.persistance.CarDao;
import com.hee462.car.service.CarService;

@Service
public class CarServiceImplV1 implements CarService {

	protected final CarDao carDao;
	public CarServiceImplV1(CarDao carDao) {
		this.carDao = carDao;
	}

	@Override
	public CarDto findTachoByCarNum(String carnum) {
		
		
		return carDao.findTachoByCarNum(carnum);
		
		
	}

}
