package jdbc_product;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProductUpdate {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","root");
		
		Statement statement = connection.createStatement();
		
		int count = statement.executeUpdate("UPDATE PRODUCT SET NAME='EARPHONES', MANUFACTURER='BOAT' WHERE id='3'");
		
		if (count!=0) 
		{
			System.out.println("Data Updated");
		} 
		else 
		{
			System.out.println("Data Not Updated");
		}
		
		connection.close();
	}
}
