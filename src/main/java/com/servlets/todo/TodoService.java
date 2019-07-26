package com.servlets.todo;
import java.util.*;

public class TodoService {

	private static List<Todo> todoList=new ArrayList<Todo>();
	
	static {
	   todoList.add(new Todo("Learn Web app development"));
	   todoList.add(new Todo("Learn Spring MVC"));
	   todoList.add(new Todo("Learn Spring Rest"));	   
	}
	
	public static List<Todo> getTodoList() {
		return todoList;
	}
	
	public static void setToDoList(Todo todo) {
		todoList.add(todo);
	}
	
	public static void deleteToDo(Todo todo) {
		todoList.remove(todo);
	}
}
