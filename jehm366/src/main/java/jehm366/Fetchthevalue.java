package jehm366;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetchthevalue {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jehm366","root","root");
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("Select * from student where id=1");
		while (resultSet.next())
		{
			System.out.println("id:"+resultSet.getInt(1)+" "+"Name:"+resultSet.getString(2)+" "+"phone:"+resultSet.getLong(3));
			
		}
	}

}
