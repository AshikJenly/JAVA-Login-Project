package com.jenly.user.login;

import jakarta.servlet.http.HttpServlet;

import java.io.*;

import jakarta.servlet.http.*;

public class LoginValue extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException{
		PrintWriter out=res.getWriter();
		out.println("Reached Request");
		System.out.println(req.getParameter("u_name")+"\n"
		+req.getParameter("u_password"));
	}

}
