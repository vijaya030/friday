package jehm366;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertvaluesintothetable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jehm366","root","root");
		Statement statement=connection.createStatement();
		statement.execute("insert into student values(1,'Gagan',900823736999)");
		System.out.println("Data is inserted successfully");

	}

}
