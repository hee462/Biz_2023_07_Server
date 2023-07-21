package com.hee462.book.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RentDto {
	private int r_seq;		//VARCHAR(15)
	private String r_date;		//VARCHAR(255)
	private String r_edate;		//VARCHAR(20)
	private String r_bcode;		//VARCHAR(20)
	private String r_ucode;		//VARCHAR(15)
	private String r_nyes;		//VARCHAR(15)
	private int r_point;		//int


}
