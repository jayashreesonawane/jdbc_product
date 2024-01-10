package jdbc_product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductFetch {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","root");
		
		Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery("SELECT * FROM PRODUCT");
		
		while (resultSet.next()) 
		{
			System.out.println(resultSet.getInt(1));
			
			System.out.println(resultSet.getString("name"));
			
			System.out.println(resultSet.getDouble(3));
			
			System.out.println(resultSet.getString("manufacturer"));
			
			System.out.println("---------------------");
		}
		
		resultSet.close();
		statement.close();
		connection.close();
	}
}
