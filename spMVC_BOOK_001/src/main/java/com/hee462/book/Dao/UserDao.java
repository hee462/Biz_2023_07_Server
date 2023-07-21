package com.hee462.book.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hee462.book.models.UserDto;

public interface UserDao {
	@Select("SELECT * FROM tbl_books ORDER BY b_year DESC")
	public List<UserDto> selectAll();

	public int insert(UserDto userDto);

	public int update(UserDto userDto);
}

