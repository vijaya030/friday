package servlet_basics.controller;

import java.io.IOException;   
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlet_basics.dao.PatientDao;
import servlet_basics.dto.PatientDto; 

@WebServlet("/delete")
public class Delete extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	String id=req.getParameter("pk");
		System.out.println(id);
	 int cid=Integer.parseInt(id);
	 
	 PatientDao dao=new PatientDao();
	String msg=dao.deletebyid(cid); 
//	res.getWriter().print(msg);
	
	List<PatientDto> d1=dao.fetchall();
	req.setAttribute("objects", d1);
	
     RequestDispatcher dispatcher=req.getRequestDispatcher("download.jsp");
     dispatcher.forward(req, res);
	 
	}

}
