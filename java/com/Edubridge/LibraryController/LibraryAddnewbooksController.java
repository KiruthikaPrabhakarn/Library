package com.Edubridge.LibraryController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Edubridge.LibraryAddnewbooks;
import com.Edubridge.Dao.DaoLibraryAddnewbooks;
import com.Edubridge.LibraryService.LibraryAddnewbooksService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class LibraryAddnewbooksController {
	@Autowired
	DaoLibraryAddnewbooks ps;
	@Autowired
	LibraryAddnewbooksService ls;
	

	@PostMapping("insertAddnewbook")
	public void savep(@RequestBody LibraryAddnewbooks p) {
		ls.saveAddnewbooks(p);
		
	}
	
	@GetMapping("viewBooks")
	public List<LibraryAddnewbooks> getAll(){
		return ls.getAllAddbooksdetails();
	}
	
	//get method for single player
	
	public LibraryAddnewbooks getp(@PathVariable int id) {
		return ls.getAddbooksdetails(id);
	
	}
	
}
