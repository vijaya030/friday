package jehm366;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUsingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/rcb_congress","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("delete from royalchallengers where Player_id=?");
		 
		System.out.println("enter the Player_id");
		int id=sc.nextInt();
		preparedStatement.setInt(1, id);
		
		preparedStatement.execute();
		System.out.println("The data is deleted");
	}

}
