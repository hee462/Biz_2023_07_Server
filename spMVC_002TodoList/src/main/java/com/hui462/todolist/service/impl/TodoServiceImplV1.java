package com.hui462.todolist.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hui462.todolist.Dao.TodoDao;
import com.hui462.todolist.models.TodoDto;
import com.hui462.todolist.service.TodoService;
@Service
public class TodoServiceImplV1 implements TodoService{
	protected final TodoDao todoDao;	
	

	public TodoServiceImplV1(TodoDao todoDao) {
		this.todoDao = todoDao;
	}

	@Override
	public List<TodoDto> selectAll() {
		
		return todoDao.selectAll();
	}

	@Override
	public TodoDto findeById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(TodoDto dto) {
		// TODO Auto-generated method stub
		return todoDao.insert(dto);
	}

	@Override
	public int update(TodoDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
