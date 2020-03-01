package com.mvcdemo.model;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Fabrizio-W10
 * 
 * This is a class that mock a data source
 *
 */
public class TodoService {

	public List<Todo> getAll(){
		List<Todo> todoList = new ArrayList<>();
		todoList.add(new Todo("titolo 1","dettaglio 1"));
		todoList.add(new Todo("titolo 2","dettaglio 2"));
	    return todoList;
	}
}
