package com.servlets.todo;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/delete-todo.do")
public class DeleteServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		Todo todo=new Todo(req.getParameter("todo"));				
		TodoService.deleteToDo(todo);
		List<Todo> todos=TodoService.getTodoList();
		req.setAttribute("todos", todos);
		res.sendRedirect("/list-todo.do");
		//req.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(req, res);
	}
	
}
