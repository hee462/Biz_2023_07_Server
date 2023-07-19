package com.hee462.car.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarDto {
	private long c_seq; 		// bigint
	private String c_carnum; 	// varchar(15)
	private String c_qty; 		// varchar(10)
	private String c_username;  // varchar(20)
	private String c_sdate; 	// varchar(10)
	private String c_stime; 	// varchar(10)
	private String c_goal; 		// varchar(30)
	private String c_edate; 	// varchar(10)
	private String c_etime; 	// varchar(20)
	private int c_skm; 			// int
	private int c_ekm; 			// int
	private int c_cost; 		// int

}
