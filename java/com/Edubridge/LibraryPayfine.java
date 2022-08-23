package com.Edubridge;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LibraryPayfine {
	@Id
	int id;
	String bookname;
	String studentname;
	int fineamount;
	
	public LibraryPayfine() {

	}

	public LibraryPayfine(int id, String bookname, String studentname,int fineamount) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.studentname = studentname;
		this.fineamount = fineamount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getFineamount() {
		return fineamount;
	}

	public void setFineamount(int fineamount) {
		this.fineamount = fineamount;
	}
	
}
