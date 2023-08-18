package jehm366;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertusingPreparedStatementandScanner {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/rcb_congress","root","root");
		PreparedStatement preparedStatement= connection.prepareStatement("insert into royalchallengers values(?,?,?)");
	
		
		System.out.println("enter the Player_id");
		int id=scanner.nextInt();
		preparedStatement.setInt(1, id);
		
		System.out.println("enter the name");
		String name= scanner.next();
		preparedStatement.setString(2, name);
		
		System.out.println("enter the Player_country");
		String country=scanner.next();
		preparedStatement.setString(3, country);
		
		preparedStatement.execute();
		System.out.println("data is inserted successfully");
			     
	}

}
