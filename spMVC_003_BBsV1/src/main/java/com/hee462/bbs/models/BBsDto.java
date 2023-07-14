package com.hee462.bbs.models;

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
public class BBsDto {
	
private long b_seq;			//bigint
private long b_pseq;			//bigint
private String b_date;			//varchar(10)
private String b_time;			//varchar(10)
private String b_username;		//varchar(125)
private String nickname;		//varchar(125)
// tbl_user table에서 가져온 데이터
private String b_subject;		//varchar(125)
private String b_content;		//text
private int b_count;		//int
//	b_update;		//datetime


}
