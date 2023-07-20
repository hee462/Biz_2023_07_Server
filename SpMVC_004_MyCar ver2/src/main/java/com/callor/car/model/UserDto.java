package com.callor.car.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class UserDto {
	private String username;		//VARCHAR(15)		PRIMARY KEY
	private String password;		//VARCHAR(255)		NOT NULL	
	private String u_name	;		//VARCHAR(20)		NOT NULL	
	private String u_nickname;		//VARCHAR(20)		
	private String u_tel;			//VARCHAR(15)		
	private String u_roll;			//VARCHAR(15)		NOT NULL	
}
