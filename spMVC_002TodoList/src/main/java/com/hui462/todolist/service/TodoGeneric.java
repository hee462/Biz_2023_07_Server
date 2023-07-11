package com.hui462.todolist.service;

import java.util.List;



public interface  TodoGeneric<DTO, PK> {

	public List<DTO> selectAll();

	public DTO findeById(PK id);

	public int insert(DTO dto);

	public int update(DTO dto);

	public int delete(PK id);

}
