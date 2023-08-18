package jehm366;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MiniProjectPanCard {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jehm366","root","root");
		Statement statement=connection.createStatement();
		statement.execute("create database pancardofIndia");
		connection.close();
		System.out.println("database created");
		
		Connection connection1=DriverManager.getConnection("jdbc:mysql://localhost:3306/pancardofIndia","root","root");
		Statement statement1=connection1.createStatement();
		
		statement1.execute("create table pancard(name varchar(25) not null, phone bigint not null unique, pan_id varchar(20) primary key)");
		System.out.println("table is created");
		
		statement1.execute("insert into pancard values('kia',63641083599999,'kin5678')");
		System.out.println("data is inserted");
		
		statement1.execute("update pancard set name='pucchu', phone=9008237369999 where pan_id='kin5678'");
		System.out.println("data is updated");
		
		ResultSet resultSet=statement1.executeQuery("select * from pancard");
		resultSet.next();
		
		System.out.println("name:"+resultSet.getString(1)+" "+"phone:"+resultSet.getLong(2)+" "+"pan_id:"+resultSet.getString(3));
		
	}
}
