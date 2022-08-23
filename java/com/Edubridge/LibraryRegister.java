package com.Edubridge;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LibraryRegister {
	@Id
	@GeneratedValue
	int id;
	String name;
	String email;
	String password;
	String repassword;
	public LibraryRegister() {

	}

	public LibraryRegister(int id,String name, String email,String password,String repassword) {
		super();
		this.id=id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.repassword = repassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	

}
