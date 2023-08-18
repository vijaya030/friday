package servlet_basics.controller;

import java.io.IOException; 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_basics.dao.PatientDao;
import servlet_basics.dto.PatientDto;
@WebServlet("/updatedetails")
public class Updateall extends HttpServlet{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	 
	 String id=req.getParameter("pid");
	 String name=req.getParameter("uname");
	 String email=req.getParameter("uemail");
	 String password=req.getParameter("upassword");
	 String number=req.getParameter("unumber");
	 String gender=req.getParameter("ugender");
	 String country=req.getParameter("ucountry");
	 String checkbox=req.getParameter("ucheck");
	 
	 System.out.println(id);
	 System.out.println(name);
	 System.out.println(email);
	 System.out.println(password);
	 System.out.println(number);
	 System.out.println(gender);
	 System.out.println(country);
	 System.out.println(checkbox);
	 
	 int cid=Integer.parseInt(id);
	 int cpassword=Integer.parseInt(password);
	 long cnumber=Long.parseLong(number);
	 
	 
	 PatientDto dto=new PatientDto();
	 dto.setId(cid);
	 dto.setName(name);
	 dto.setEmail(email);
	 dto.setPassword(cpassword);
	 dto.setNumber(cnumber);
	 dto.setGender(gender);
	 dto.setCountry(country);
	 dto.setCheckbox(checkbox);
	 
	 PatientDao dao=new PatientDao();
	 dao.updateall(dto);
}
}


















