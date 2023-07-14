package com.hee462.car.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class carDto {
	private int c_seq;			//int
	private String c_div;			//varchar(10)
	private String c_startDate;	//varchar(10)
	private String c_startTime;	//varchar(10)
	private String c_startKm;		//varchar(10)
	private String c_endDate;		//varchar(10)
	private String c_endTime;		//varchar(10)
	private String c_endKm;		//varchar(10)
	private String c_place;		//varchar(10)
	private String c_cost;			//varchar(10)

}
