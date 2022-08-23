package com.Edubridge;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LibraryAdminlogin {
	@Id
	String email;
	String password;
	
	public LibraryAdminlogin() {

	}

	public LibraryAdminlogin(String email,String password) {
		super();
		this.email = email;
		this.password = password;
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
