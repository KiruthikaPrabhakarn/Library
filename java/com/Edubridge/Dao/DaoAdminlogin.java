package com.Edubridge.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Edubridge.LibraryAdminlogin;

public interface DaoAdminlogin extends JpaRepository<LibraryAdminlogin,Integer> {

	LibraryAdminlogin findByEmail(String email);

}
