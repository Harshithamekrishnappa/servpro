package student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.dto.studentdto;
import studentdao.studentdao;
@WebServlet("/stu")
public class studentcontroller extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String id = req.getParameter("id");
		int cid = Integer.parseInt(id);
		String name =  req.getParameter("name");
		String phno =  req.getParameter("phno");
		int l = Integer.parseInt(phno);
		String email =  req.getParameter("email");
		String gen =  req.getParameter("gen");
		String place =  req.getParameter("place");
		String terms =  req.getParameter("terms");
		
		studentdto d1 = new studentdto();
		d1.setId(cid);
		d1.setName(name);
		d1.setPhno(l);
		d1.setEmail(email);
		d1.setGender(gen);
		d1.setPlace(place);
		d1.setTerms(terms);
		studentdao d2 = new studentdao();
		d2.insert(d1);
		
	}

}
