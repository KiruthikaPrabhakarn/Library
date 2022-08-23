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
public class LibraryAdminlogin {
	@Autowired
	DaoLibraryRegister ps;
	
	@PostMapping("login")
	public ResponseEntity<?> signInUser(@RequestBody LibraryRegister signInEntityData) {
		LibraryRegister signInObj=ps.findByEmail(signInEntityData.getEmail());
		if(signInObj.getPassword().equals(signInObj.getPassword()) && signInObj.getEmail().equals(signInObj.getEmail()))
			return ResponseEntity.ok(signInObj);
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		
	}

}
