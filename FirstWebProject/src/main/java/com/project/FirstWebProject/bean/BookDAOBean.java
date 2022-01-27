package com.project.FirstWebProject.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.FirstWebProject.pojo.BookPojo;
@Repository
public class BookDAOBean {

	@Autowired
	private DataSource ds;
	
	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	public void addBook(BookPojo bp) {
		try {
			Connection con =ds.getConnection();
			PreparedStatement prep =con.prepareStatement("insert into book values(?,?,?)");
			
			prep.setInt(1, bp.getId());
			prep.setString(2, bp.getName());
			prep.setString(3, bp.getAuthor());
			
			prep.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	public List<BookPojo> readAll() {
		List<BookPojo> al = new ArrayList<>();
		try {
			Connection con =ds.getConnection();
			PreparedStatement prep = con.prepareStatement("select * from book");
			ResultSet rs = prep.executeQuery();
			while(rs.next()) {
				al.add(new BookPojo(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return al;
	}			
	
}
