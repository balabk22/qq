package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.jsp.tagext.TryCatchFinally;

public class PasswordCheck {
	
	public static void main(String[] args) {
		Connection con=DBUtils.getConnection();
		try {
			
			String s1="select * from password";
			PreparedStatement ps=con.prepareStatement(s1);
			
			ResultSet rs=ps.executeQuery();
			
			
			
			
			
			String password=rs.getString("password");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	
	
	

}

