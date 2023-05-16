package com.JDBC_OPERATORS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL_DML_Commands {

	public static void main(String[] args) throws SQLException {
	
		Connection con = DriverManager.getConnection("jdbc:mysql//127.0.0.1:3306/wiprotable", "root", "Vaishnavi");
        Statement stat = con.createStatement();
        String s = "Select book_no, title, sub_code, author from book_delt";
        
        ResultSet rs = stat.executeQuery(s);
        
        
        
	}

}
