package jdbc_product;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProductDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","root");
		
		Statement statement = connection.createStatement();
		
		int count = statement.executeUpdate("DELETE FROM PRODUCT WHERE NAME='DELL'");
		
		if (count!=0) 
		{
			System.out.println("Date Removed");
		} 
		else 
		{
			System.out.println("Data Not Removed");
		}
		
		connection.close();
	}
}
