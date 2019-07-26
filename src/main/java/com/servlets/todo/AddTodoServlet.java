package com.servlets.todo;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/add-todo.do")
public class AddTodoServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{	
		Todo todo1=new Todo(req.getParameter("todofromjsp"));
		TodoService.setToDoList(todo1);
		List<Todo> todos1=TodoService.getTodoList();
		req.setAttribute("todos", todos1);
//Everytime when ever the form page todo.jsp is loaded, post request is initiated.
//To avoid this problem after the post request load a get request instead of below.
//req.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(req, res);
		res.sendRedirect("/list-todo.do");
	}
}
