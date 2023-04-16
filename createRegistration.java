package com.markettingApp.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.markettingApp.model.DAOService;
import com.markettingApp.model.DAOServiceImpl;

@WebServlet("/save")
public class CreateRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CreateRegistration() {
        super();
        

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		
	    DAOService service=new DAOServiceImpl();
	    service.connectDB();
	    
	    
	   service.saveRegistration(name,city,email,mobile);
	   
	   request.setAttribute("msg", "Record is saved!");
	   RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/views/create_registration.jsp");
	   rd.forward(request, response);
	}

}
