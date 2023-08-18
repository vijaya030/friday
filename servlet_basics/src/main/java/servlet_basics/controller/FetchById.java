package servlet_basics.controller;

import java.io.IOException;  

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_basics.dao.PatientDao;

@WebServlet("/findbyid")
public class FetchById extends HttpServlet{
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	String id=req.getParameter("pk");
	int cid=Integer.parseInt(id);
	System.out.println(cid);
	
	PatientDao dao=new PatientDao();
    Object	o1=dao.findbyid(cid);
	resp.getWriter().print(o1);
	
}

}
