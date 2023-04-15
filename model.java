package com.markettingApp.model;

public interface DAOService {
	public void connectDB();
	public boolean verifyCredentials(String email,String password);

}
