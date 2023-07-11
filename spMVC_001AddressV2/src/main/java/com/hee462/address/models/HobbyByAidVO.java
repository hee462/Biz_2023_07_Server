package com.hee462.address.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/*
 * VO class
 * vale Object class
 * Dto class 와 유사한 기능을 수행하지만
 * 개발자 입장에서는 Read Only
 * ******** Setter는 mybatis가 사용함
 * 
 * 
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class HobbyByAidVO {

	private long ah_seq;
	private String ah_aid;
	private String ah_hbcode;
	private String hb_name;
	private String hb_descrip;
	
	private List<HobbyByAidVO> hobbyList;
	
	
}
