package jehm366;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImageInsertion {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jehm366","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(7,'Gagan',?)");
		FileInputStream fileInputStream=new FileInputStream("D://Download.jpg");
		
		preparedStatement.setBinaryStream(1, fileInputStream);
		preparedStatement.execute();
		System.out.println("data inserted successfully");
	}

}
