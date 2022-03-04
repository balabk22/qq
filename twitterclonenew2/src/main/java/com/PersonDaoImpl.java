package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.callback.UsernameCallback;

public class PersonDaoImpl implements PersonDao {
	
	
	
	Connection con=DBUtils.getConnection();
	
	public Person userDetails(String userName) {
		Person per = new Person();
		try {
			String s1="select user_id,fullName,email from person where user_id=?";
			PreparedStatement ps=con.prepareStatement(s1);
			ps.setString(1, userName);
			ResultSet rs=ps.executeQuery();
			
			if (rs.next()) {
				
				per.setUser_id(rs.getString("user_id"));
				per.setFullName(rs.getString("fullName"));
				per.setEmail(rs.getString("email"));
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return per;

	}

	@Override
	public void register(Person personDetails) {
		try {
			String q1 = "insert into person values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(q1);
			ps.setString(1, personDetails.getUser_id());
			ps.setString(2, personDetails.getPassword());
			ps.setString(3, personDetails.getFullName());
			ps.setString(4, personDetails.getEmail());
			ps.setTimestamp(5, personDetails.getJoined());
			ps.setBoolean(6, true);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public List<Tweet> findAll() {
		
			List<Tweet> tweets = new ArrayList<>();
			try {
				String q1 = "select * from tweet";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(q1);

				while (rs.next()) {
					Tweet tweet = new Tweet();
					tweet.setTweetId(rs.getInt("tweet_id"));
					tweet.setUser(rs.getString("user_id"));
					tweet.setMessage(rs.getString("message"));
					tweet.setCreated(rs.getDate(0));

					tweets.add(tweet);

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			return tweets;
		}


}	
	