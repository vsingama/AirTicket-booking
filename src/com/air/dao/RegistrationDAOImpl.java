package com.air.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.air.domain.Registration;
import com.air.Constants;

public class RegistrationDAOImpl implements RegistrationDAO {
	
	  Connection con;
	  PreparedStatement stmt;
	  PreparedStatement stmt1;
	  PreparedStatement pstmt;
	  ResultSet rs;
	  ResultSet rs1;
		
	@Override
	public Registration getUser(String emailid, String pass) throws Exception {
		// TODO Auto-generated method stub
		
		Registration reg = null;
		try{
			con=DriverManager.getConnection(Constants.DB_URL,Constants.DB_USER,Constants.DB_PWD);
		
		stmt=con.prepareStatement("select * from Registration where emailid=? and password=?");
		
		stmt.setString(1, emailid);
		stmt.setString(2,pass);
		rs=stmt.executeQuery();
		
		if(rs.next())
		{
			reg = new Registration();
			reg.setUserid(rs.getInt(1));
			reg.setFirstname(rs.getString(2));
			reg.setLastname(rs.getString(3));
			reg.setEmailID(rs.getString(4));
			reg.setNationality(rs.getString(6));
			reg.setPhonenum(rs.getLong(7));
			reg.setPassportnun(rs.getString(8));
			reg.setAddress(rs.getString(10));
		}
		}catch(Exception e){
			
			throw new Exception("Could not fetch details");
		}finally{
			if(null!=con){
				con.close();
			}
		}
		
		return reg;
	}

	@Override
	public long saveUser(String fname,String lname,String email,String country,String mnum,String passport,String address) throws Exception {
		
		try{
			con=DriverManager.getConnection(Constants.DB_URL,Constants.DB_USER,Constants.DB_PWD);
					
			/*String que = "select * from Registration where emailid = " + email;
			pstmt=con.prepareStatement(que);
		
			rs=pstmt.executeQuery();
			
			Registration rd = null;
			
			if(rs.next()){
				rd= new Registration();
				rd.setUserid(rs.getInt(1));
				System.out.println("User ID : " + rd.getUserid());
			}else
			{
				System.out.println("no value for the given email ID : " +email);
			}*/
			
			/*Registration rd = null;
			
			String que = "select * from Registration where emailid = " + email;
			pstmt=con.prepareStatement(que);
		
			rs=pstmt.executeQuery();	
			
			if(rs.next()){
				rd= new Registration();
				rd.setUserid(rs.getLong(1));
			}
		
			
			if(rd.getUserid() > 0){
		
				return rd.getUserid();
				
			}
			else{
				System.out.println("inside else part : " );
		*/	stmt=con.prepareStatement("select max(userid) from Registration");
			rs1=stmt.executeQuery();	
			
			long userid =0;
			if(rs1.next()){
				userid= rs1.getLong(1);
			}
			
			
			userid++;
			
			String pass = null;
			String query = "insert into Registration values (?,?,?,?,?,?,?,?,?,?)";
			
		stmt1=con.prepareStatement(query);
		
		stmt1.setLong(1, userid);
		stmt1.setString(2, fname);
		stmt1.setString(3, lname);
		stmt1.setString(4, email);
		stmt1.setString(5, pass);
		long mobile = Long.parseLong(mnum);
		stmt1.setLong(7, mobile);
		stmt1.setString(6, country);
		stmt1.setString(8, passport);
		stmt1.setString(9, "user");
		stmt1.setString(10, address);
		
		stmt1.executeUpdate();
		return userid;
				
		}catch(Exception e){
			
			throw new Exception("Could not fetch details");
		}finally{
			if(null!=con){
				con.close();
			}
		}
		
	}

	@Override
	public void updateUser(long userid,String fname,String lname,String email, String country, String mnum, String passport,String address)
			throws Exception {
		// TODO Auto-generated method stub
		
		long mobile = Long.parseLong(mnum);
		
		try{
			con=DriverManager.getConnection(Constants.DB_URL,Constants.DB_USER,Constants.DB_PWD);
		
		stmt=con.prepareStatement("update Registration set firstname =? , lastname = ? , nationality= ? , phnum = ?, passport =? ,address =? where userid =?");
		
		stmt.setString(1, fname);
		stmt.setString(2,lname);
		stmt.setString(3,country);
		stmt.setLong(4, mobile);
		stmt.setString(5, passport);
		stmt.setString(6, address);
		stmt.setLong(7, userid);
		
		
		int i=stmt.executeUpdate();
		
		if(i==1){
			System.out.println("update user complete");
		}else{
			System.out.println("couldnt update the user");
		}
		
		}catch(Exception e){
			
			throw new Exception("Could not fetch details");
		}finally{
			if(null!=con){
				con.close();
			}
		}
		
		
		
	}

	@Override
	public int deleteUser(long userid) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int createUser(long userid, String password) throws Exception {
		// TODO Auto-generated method stub
		
		try{
		con=DriverManager.getConnection(Constants.DB_URL,Constants.DB_USER,Constants.DB_PWD);
		
		stmt=con.prepareStatement("update registration set password=? where userid=?");
		stmt.setString(1, password);
		stmt.setLong(2, userid);
		System.out.println("pass : " + password);
		System.out.println("userid : " + userid);
		int i =stmt.executeUpdate();
		
		if(i==1)
		{
			System.out.println("update Successfull");
			
		}
		else
		{
			System.out.println("update not successfull");
		}
		return i;
		}
		catch(Exception e){
			
			throw new Exception("Could not fetch details");
		}finally{
			if(null!=con){
				con.close();
			}
		}
		
	}
	
	
}
