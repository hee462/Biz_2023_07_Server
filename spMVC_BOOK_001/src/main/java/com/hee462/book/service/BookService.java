package com.hee462.book.service;

import java.util.List;

import com.hee462.book.models.bookDto;

public interface BookService {
	
	public List<bookDto> selectAll();
	public int insert(bookDto bookDto);
	public int update(bookDto bookdto);
	

}
