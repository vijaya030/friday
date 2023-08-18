package jehm366;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateusingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/rcb_congress","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("update royalchallengers set Player_name=?,Player_country=? where Player_id=? ");
		
		System.out.println("enter the player name");
		String name=sc.next();
		preparedStatement.setString(1, name);
		
		System.out.println("enter the player country");
		String country=sc.next();
		preparedStatement.setString(2, country);
		
		System.out.println("enter the player id");
		int id=sc.nextInt();
		preparedStatement.setInt(3, id);
		
		preparedStatement.execute();
		
		System.out.println("The value are updated with respective primary key");
		
		
	}

}
