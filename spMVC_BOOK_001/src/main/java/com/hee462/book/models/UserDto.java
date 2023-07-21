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
public class UserDto {
	private String u_code;	//VARCHAR(6)
	private String u_name;	//VARCHAR(125)
	private String u_tel;	//VARCHAR(125)
	private String u_addr;	//VARCHAR(125)

	
}
