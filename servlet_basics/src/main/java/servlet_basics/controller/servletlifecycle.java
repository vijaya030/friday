package servlet_basics.controller;

import java.io.IOException;     

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/call")
public class servletlifecycle implements Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method is invoked");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service method is executed");
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		System.out.println("destroy method is invoked and object is destroyed");
		
	}
	
	}
	

	
	


