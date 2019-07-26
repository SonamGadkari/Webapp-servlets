package com.servlets.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		/* Using the hard coding
		PrintWriter out=res.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<p>I love Servlets</p>");
		out.println("</body>");
		out.println("</html>");	*/
		// Using JSP
		 String name=req.getParameter("name");
		 req.setAttribute("nameforjsp", name);
		 req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, res);	
	}
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String name=req.getParameter("name");
		req.setAttribute("name1", name);
		String password=req.getParameter("password");
		req.setAttribute("password1", password);
		UserValidationService sr=new UserValidationService();
		boolean isValid=sr.isvalidUser(name, password);
		if(isValid)
		{	
		//You need username to be retaned acros multiple requests. Hence you need put that in session
			req.getSession().setAttribute("name", name);
			res.sendRedirect("/list-todo.do");
		//	req.getRequestDispatcher("/WEB-INF/views/todo.jsp");			
		}
		else 
		{
			req.setAttribute("errorMessage", "Enter a valid username and password");
			req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, res);	
		}			
	
	}

	

}
