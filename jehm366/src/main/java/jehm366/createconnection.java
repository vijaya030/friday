package jehm366;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		System.out.println("connection established");
		
		Statement statement= connection.createStatement();
		
		statement.execute("create database JEHM366");
		System.out.println("Database is created in the port");
		
		connection.close();
	}

}
