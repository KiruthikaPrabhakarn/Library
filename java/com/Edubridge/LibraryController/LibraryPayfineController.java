package com.Edubridge.LibraryController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Edubridge.LibraryPayfine;
import com.Edubridge.Dao.DaoLibraryPayfine;
import com.Edubridge.LibraryService.LibraryPayfineService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class LibraryPayfineController {
	@Autowired
	DaoLibraryPayfine ps;
	@Autowired
	LibraryPayfineService ls;

	@PostMapping("insertPayfine")
	public LibraryPayfine savep(@RequestBody LibraryPayfine p) {
		ls.savePayfine(p);
		return p;
	}
	
	@GetMapping("viewPayfine")
	public List<LibraryPayfine> getAll(){
		return ls.getAllAddpayfinedetails();
	}
	
	//get method for single player
	
	public LibraryPayfine getp(@PathVariable int id) {
		return ls.getAddpayfinedetails(id);
	
	}
	
	
}
