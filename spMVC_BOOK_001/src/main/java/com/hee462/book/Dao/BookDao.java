package com.hee462.book.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hee462.book.models.bookDto;

public interface BookDao {
	@Select("SELECT * FROM tbl_books ORDER BY b_year DESC")
	public List<bookDto> selectAll();

	public int insert(bookDto bookDto);

	public int update(bookDto bookDto);
}
