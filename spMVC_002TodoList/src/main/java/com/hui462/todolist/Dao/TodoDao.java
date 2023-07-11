package com.hui462.todolist.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.hui462.todolist.models.TodoDto;
import com.hui462.todolist.service.TodoGeneric;


public interface TodoDao extends TodoGeneric<TodoDto,Long>{

	@Select("SELECT * FROM tbl_todolist")
	public List<TodoDto> selectAll();
	
	@Select("SELECT * FROM tbl_todolist WHERE to_seq = #{id}")
	public TodoDto findeById(long id);
	
//	public int insert(TodoDto dto);
//	public int update(TodoDto dto);
	
	@Delete("DELECT FROM tbl_todolist WHERE to_seq =#{id}")
	public int delete(long id);
}
