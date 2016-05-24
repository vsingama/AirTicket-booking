package com.air.dao;

import java.sql.SQLException;

import com.air.domain.*;

public interface RegistrationDAO {

	public Registration getUser(String emailid, String pass) throws  Exception;	
	public long saveUser(String fname,String lname,String email, String country, String mnum, String passport,String address) throws SQLException, Exception;
	public void updateUser(long userid,String fname,String lname,String email, String country, String mnum, String passport,String address) throws Exception;	
	public int deleteUser(long userid) throws SQLException;
	public int createUser(long userid,String password) throws Exception;

}
