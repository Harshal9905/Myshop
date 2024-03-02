package com.kbplibrary.borrower;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

import com.kbplibrary.Connection.MyConnection;

public class BorrowerOp {
	static Scanner sc = new Scanner(System.in);
	public static void getBorrDetails() {
		BorrowVar bov = new BorrowVar();
		System.out.println("Enter Your ID: ");
		int borid = sc.nextInt();
		bov.getBorrId();
		String borName = sc.next();
		bov.getBorrName();
		Connection co =MyConnection.getMyConnection();
		System.out.println("check");
		try {
			Statement st =co.createStatement();
			ResultSet rst = st.executeQuery("SELECT * FROM borrower");
			while(rst.next()) {
				int existingId= rst.getInt("borrowerId");
				if(borid==existingId) {
					System.out.println("Enter book Id");
					int bookId =sc.nextInt();
					PreparedStatement pst = co.prepareStatement("SELECT * FROM books WHERE bookId=?");
					
					pst.setInt(1, bookId);
					ResultSet resultset = pst.executeQuery();
					PreparedStatement borrower = co.prepareStatement("UPDATE borrower SET bookname=?, bookid=?, issuedate=? WHERE borrowerid="+existingId+";");
					while(resultset.next()) {
						int ids = resultset.getInt("bookId");
						String bName= resultset.getString("bookname");
						LocalDate date= LocalDate.now();
						Date d = Date.valueOf(date);
						borrower.setString(1, bName);
						borrower.setInt(2, ids);
						borrower.setDate(3, d);
						borrower.executeUpdate();
						System.out.println("Book Issued");
					}
					
				}
				
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}
}
