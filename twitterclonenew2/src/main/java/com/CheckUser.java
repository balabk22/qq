package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

public class CheckUser {
	
	Connection con=DBUtils.getConnection();
	
	public boolean checkUser(String userName,String password) {
		boolean b= false;
		
		
		try {
			String s1="select user_id,password from person where user_id=?";
			PreparedStatement ps=con.prepareStatement(s1);
			ps.setString(1, userName);
			ResultSet rs=ps.executeQuery();
			if (rs.next()) {
				String user=rs.getString("user_id");
				String password1=rs.getString("password");
				if(userName.equals(user)&&password.equals(password1)) {
					b=true;
				}
			}
			

			return b;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return b;
		
	}

}
