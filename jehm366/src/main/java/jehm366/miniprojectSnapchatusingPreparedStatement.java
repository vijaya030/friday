package jehm366;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class miniprojectSnapchatusingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
        PreparedStatement preparedStatement=connection.prepareStatement("create database meta1");
        preparedStatement.execute();
        System.out.println("database created");
        
        
        Connection connection1=DriverManager.getConnection("jdbc:mysql://localhost:3306/meta1","root","root");
        PreparedStatement preparedStatement1=connection1.prepareStatement("create table snapchat (username varchar(25) not null, phone bigint primary key, email_id varchar(15)");
        preparedStatement1.execute();
        System.out.println("table is created");
        
        PreparedStatement preparedStatement2=connection1.prepareStatement("insert into snapchat values('gagan',00112233445566,'gagan1234@gmail.com')");
        preparedStatement2.execute();
        System.out.println("data is inserted");
        
        PreparedStatement preparedStatement3=connection1.prepareStatement("update snapchat set username='Kiran' where phone=00112233445566");
        preparedStatement3.execute();
        System.out.println("data is updated");
        
        PreparedStatement preparedStatement4=connection1.prepareStatement("select * from snapchat");
        ResultSet resultSet=preparedStatement4.executeQuery();
        resultSet.next();
        System.out.println("username:"+resultSet.getString(1)+"phone:"+resultSet.getLong(2)+"email_id:"+resultSet.getString(3));
        System.out.println("data is fetched");
        
        PreparedStatement preparedStatement5=connection1.prepareStatement("delete from snapchat where phone=00112233445566");
        preparedStatement5.execute();
        System.out.println("data deleted");
        
        PreparedStatement preparedStatement6=connection1.prepareStatement("drop table snapchat");
        preparedStatement6.execute();
        System.out.println("table is dropped");
        
        
	}

}
