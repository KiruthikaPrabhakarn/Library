package com.Edubridge;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LibraryAddnewbooks {
	@Id
	int id;
	String bookname;
	String authorname;
	String publisher;
	int bookcount;
	public LibraryAddnewbooks() {

	}

	public LibraryAddnewbooks(int id, String bookname, String authorname,int bookcount,String publisher) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.authorname = authorname;
		this.publisher = publisher;
		this.bookcount = bookcount;
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

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getBookcount() {
		return bookcount;
	}

	public void setBookcount(int bookcount) {
		this.bookcount = bookcount;
	}
	
	
}
