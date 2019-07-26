package com.servlets.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout.do")
public class LogoutServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		 req.getSession().invalidate();
		 //res.sendRedirect("/login.do");
		 req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, res);	
	}
		
}
