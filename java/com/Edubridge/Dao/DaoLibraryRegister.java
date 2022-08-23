package com.Edubridge.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Edubridge.LibraryRegister;

public interface DaoLibraryRegister extends JpaRepository<LibraryRegister,String>{

	LibraryRegister findByEmail(String email); 

}
