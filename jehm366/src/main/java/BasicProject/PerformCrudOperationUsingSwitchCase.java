package BasicProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PerformCrudOperationUsingSwitchCase {
	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/google","root","root");
		boolean b=true;
		while(b)
		{
			System.out.println("select any one of the option below shown");
			
			System.out.println("1.Insert 2.Update 3.Fetch 4.Delete 5.ThankYou 6.Default");
			System.out.println("enter here");
			int a=sc.nextInt();
			
			switch(a)
			{
			case 1:{
				     PreparedStatement preparedStatement= connection.prepareStatement("insert into gmail values(?,?,?,?,?)");
				     
				     System.out.println("enter the user phone number");
				     long Phone=sc.nextLong();
				     
				     System.out.println("enter the user First name");
				     String First_name=sc.next();
				     
				     System.out.println("enter the user last name");
				     String Last_name=sc.nextLine();
				     sc.nextLine();
				     
				     System.out.println("enter the user User_name");
				     String User_name=sc.next();
				     
				     System.out.println("enter the user password");
				     String password=sc.next();
				     
				     preparedStatement.setLong(1, Phone);
				     preparedStatement.setString(2, First_name);
				     preparedStatement.setString(3, Last_name);
				     preparedStatement.setString(4, User_name);
				     preparedStatement.setString(5, password);
				     
				     preparedStatement.execute();
				     System.out.println("The values are inserted into the table");
				     break;    
			}
			case 2:{
				    PreparedStatement preparedStatement= connection.prepareStatement("update gmail set First_name=?,Last_name=?,User_name=?,password=? where Phone=?");
				     
				     System.out.println("enter the user First name to update");
				     String First_name=sc.next();
				     
				     System.out.println("enter the user last name to update");
				     String Last_name=sc.nextLine();
				     sc.nextLine();
				     
				     System.out.println("enter the user User_name to update");
				     String User_name=sc.next();
				     
				     System.out.println("enter the user password to update");
				     String password=sc.next();
				     
				     System.out.println("enter the primary key as user phone number");
				     long Phone=sc.nextLong();
				     
				     preparedStatement.setString(1, First_name);
				     preparedStatement.setString(2, Last_name);
				     preparedStatement.setString(3, User_name);
				     preparedStatement.setString(4, password);
				     preparedStatement.setLong(5, Phone);
				     
				     preparedStatement.executeUpdate();
				     System.out.println("The values are updated into the table");
				     break;
			}
			case 3:{
				    PreparedStatement preparedStatement= connection.prepareStatement("select * from gmail where Phone=?");
				    
				    System.out.println("enter the user phone number to fetch");
				     long Phone=sc.nextLong();
				     
				     preparedStatement.setLong(1, Phone);
				     
				     ResultSet resultSet=preparedStatement.executeQuery();
				     resultSet.next();
				     
				     System.out.println("Phone:"+resultSet.getLong(1)+" "+"First_name"+resultSet.getString(2)+" "+"Last_name"+resultSet.getString(3)+" "+"User_name"+resultSet.getString(4)+"password"+resultSet.getString(5));
				     break;
			}
			case 4:{
				     PreparedStatement preparedStatement= connection.prepareStatement("delete from gmail where Phone=?");
				     
				     System.out.println("enter the Phone number to delete");
				     long phone=sc.nextLong();
				     
				     preparedStatement.setLong(1,phone);
				     preparedStatement.execute();
				     
				     System.out.println("the data is deleted");
				     break;
			}
			}
		}

	}

}
