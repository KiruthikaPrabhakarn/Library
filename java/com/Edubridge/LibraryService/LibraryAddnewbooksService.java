package com.Edubridge.LibraryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Edubridge.LibraryAddnewbooks;
import com.Edubridge.Dao.DaoLibraryAddnewbooks;

@Service
public class LibraryAddnewbooksService {
	@Autowired
	DaoLibraryAddnewbooks dcas;
	
	public LibraryAddnewbooksService() {

	}
	
	// post or save student
	public void saveAddnewbooks(LibraryAddnewbooks p) {
		dcas.save(p);
	}
	
	public List<LibraryAddnewbooks> getAllAddbooksdetails() {
		return dcas.findAll();
	}

	// Get player by id
	@SuppressWarnings("deprecation")
	public LibraryAddnewbooks getAddbooksdetails(int id) {
		return dcas.getOne(id);
	}

}
