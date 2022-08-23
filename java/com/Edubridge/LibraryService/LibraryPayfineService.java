package com.Edubridge.LibraryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Edubridge.LibraryPayfine;
import com.Edubridge.Dao.DaoLibraryPayfine;

@Service
public class LibraryPayfineService {
	@Autowired
	DaoLibraryPayfine dcas;
	
	public LibraryPayfineService() {

	}
	
	// post or save student
	public void savePayfine(LibraryPayfine p) {
		dcas.save(p);
	}

	
	public List<LibraryPayfine> getAllAddpayfinedetails() {
		return dcas.findAll();
	}

	// Get player by id
	@SuppressWarnings("deprecation")
	public LibraryPayfine getAddpayfinedetails(int id) {
		return dcas.getOne(id);
	}
}
