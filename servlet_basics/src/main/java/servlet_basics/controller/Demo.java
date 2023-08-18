package servlet_basics.controller;

import java.io.IOException;         

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlet_basics.dao.PatientDao;
import servlet_basics.dto.PatientDto;

@WebServlet("/insert")
public class Demo implements Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		System.out.println("welcome to servlet");
//		res.getWriter().print("welcome");
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pwd=req.getParameter("password");
		String num=req.getParameter("number");
		String gender=req.getParameter("gender");
		String checkbox=req.getParameter("checkbox");
		String country=req.getParameter("country");
		String state=req.getParameter("state");
		
	    int	cid=Integer.parseInt(id);
        int	cpassword=Integer.parseInt(pwd);
        long cnumber =Long.parseLong(num);
   
   PatientDto dto=new PatientDto();
   dto.setId(cid);
   dto.setName(name);
   dto.setEmail(email);
   dto.setPassword(cpassword);
   dto.setNumber(cnumber);
   dto.setCountry(country);
   dto.setCheckbox(checkbox);
   dto.setGender(gender);
   
   System.out.println(dto);
   
   PatientDao dao=new PatientDao();
   dao.insert(dto);
   
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
