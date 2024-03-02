package com.kbplibrary.Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kbplibrary.Bookvar;

public class MyDatabase {
	public static void save(ArrayList<Bookvar> list) {
		Connection co = MyConnection.getMyConnection();
		
		try {
			PreparedStatement ps = co.prepareStatement("INSERT INTO books (bookid, bookname, bookAuthor) VALUES(?,?,?)");
			for (Bookvar bk : list) {
				int bookId = bk.getBookid();
				String bookName = bk.getBookname();
				String bookAuthor = bk.getBookauthor();
				ps.setInt(1, bookId);
				ps.setString(2, bookName);
				ps.setString(3, bookAuthor);
				int data = ps.executeUpdate();
				System.out.println(data+" Inserted Sucesfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
