package com.markettingApp.controller;

import java.io.IOException;

import com.markettingApp.model.DAOService;
import com.markettingApp.model.DAOServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/verifylogin")
public class loginController extends HttpServlet {
    
	
	
	public loginController() {
		super();
		
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		DAOService service=new DAOServiceImpl();
		service.connectDB();
		boolean result=service.verifyCredentials(email, password);
		
		if(result==true) {
			
		}else {
			request.setAttribute("error", "invalid username/passwordservice");
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}
	

}
