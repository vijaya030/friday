package servlet_basics.controller;

import java.io.IOException;   

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_basics.dao.PatientDao;

@WebServlet("/deleteAll")
public class deleteAll extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		PatientDao d1=new PatientDao();
		String msg=d1.deleteAll();
		resp.getWriter().print(msg);
	}
}