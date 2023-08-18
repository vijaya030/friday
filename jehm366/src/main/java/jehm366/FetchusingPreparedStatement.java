package jehm366;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchusingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/rcb_congress","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("Select * from royalchallengers where Player_id=? ");
		
		System.out.println("enter the id");
		int id=sc.nextInt();
		preparedStatement.setInt(1, id);
		
		ResultSet resultSet=preparedStatement.executeQuery();
		resultSet.next();
		
		
		System.out.println("Player_id:"+resultSet.getInt(1)+" "+"Player_name:"+resultSet.getString(2)+" "+"Player_country:"+resultSet.getString(3));
		
	}

}
