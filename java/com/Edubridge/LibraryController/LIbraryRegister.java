package com.Edubridge.LibraryController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Edubridge.LibraryRegister;
import com.Edubridge.Dao.DaoLibraryRegister;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class LIbraryRegister {
	@Autowired
	DaoLibraryRegister ps;
	
	@PostMapping("insertRegister")
	public ResponseEntity<?> signUpUser(@RequestBody LibraryRegister signUpEntityData) {
//		System.out.println("In Controller");
		return ResponseEntity.ok(ps.save(signUpEntityData));
}
}