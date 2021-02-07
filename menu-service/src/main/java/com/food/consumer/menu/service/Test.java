package com.food.consumer.menu.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.ds.PGSimpleDataSource;

public class Test {
	static String url = "jdbc:postgresql://localhost:5432/EMP_Managment?currentSchema=public";
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		PGSimpleDataSource dataSource = new PGSimpleDataSource ( );
		dataSource.setServerName ( "ec2-34-198-31-223.compute-1.amazonaws.com" );
		dataSource.setDatabaseName ( "d5bj7hi5g5con7" );
		dataSource.setPortNumber ( 5432 );
		dataSource.setUser ( "oxhwpqsovryiao" );
		dataSource.setPassword ( "001fdab1bc4e7ab7e75192d384b3fcbe20c43a97d437f66c33fbf986b17db997" );
		
		Connection  c = dataSource.getConnection();
		
		
		if(c==null) {
			System.out.println("null");
		}else {
			Statement s = c.createStatement();
			ResultSet rs =s.executeQuery("SELECT * FROM emp1"
					+ "");
			
			if(rs.next()) {
				System.out.println(rs.getString("X"));
			}
			else {
				System.out.println("empty");
			}
			System.out.println("yeaaa");
		}
	}
}
