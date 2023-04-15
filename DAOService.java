

package com.markettingApp.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DAOServiceImpl implements DAOService {
    
	private Connection con;
	private java.sql.Statement stmnt;
	
	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/markettingApp","root","kanaka");
			stmnt=con.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean verifyCredentials(String email, String password) {
		try {
			ResultSet result=stmnt.executeQuery("Select *from login where email='"+email+"' and password='"+password+"'");
			return result.next();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
