package com.air.service;

import java.sql.SQLException;

import com.air.domain.Registration;
import com.air.dao.*;

public class RegistrationServiceImpl implements RegistrationService {
	
	
	RegistrationDAO dao= new RegistrationDAOImpl();

	@Override
	public Registration getUser(String emailid, String pass) throws Exception {
		// TODO Auto-generated method stub
		
		Registration user = dao.getUser(emailid, pass);
		if(null!=user){
			return user;
		}
		
		
		return null;
	}

	@Override
	public long saveUser(String fname,String lname,String email, String country, String mnum, String passport,String address) throws Exception {
		// TODO Auto-generated method stub
		
		long user = dao.saveUser(fname,lname,email,country,mnum,passport,address);
		
		return user;
	}

	@Override
	public void updateUser(long userid,String fname,String lname,String email, String country, String mnum, String passport,String address) throws Exception {
		// TODO Auto-generated method stub
		dao.updateUser(userid,fname, lname, email, country, mnum, passport, address);
	}

	@Override
	public int deleteUser(long userid) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int createUser(long userid, String password) throws Exception {
		return dao.createUser(userid,password);
	}

}
