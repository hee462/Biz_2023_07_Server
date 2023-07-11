package com.hui462.todolist.service;

import com.hui462.todolist.models.CategoryDto;

public interface CatService extends TodoGeneric<CategoryDto, String>{
	public void printCatgory();
}
