package com.hee462.book.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hee462.book.Dao.BookDao;
import com.hee462.book.models.bookDto;
import com.hee462.book.service.BookService;

@Service
public class BookServiceImplV1 implements BookService {

	protected final BookDao bookDao;

	public BookServiceImplV1(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<bookDto> selectAll() {

		return bookDao.selectAll();
	}

	@Override
	public int insert(bookDto bookDto) {
		String bookCode = bookDto.getB_code();
		String bookName = bookDto.getB_name();
		BookDto bookDto = bookDto.

		return result;
	}

	@Override
	public int update(bookDto bookDto) {
		int result = bookDao.update(bookDto);

		return result;
	}

}
