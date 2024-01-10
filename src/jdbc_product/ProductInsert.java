package jdbc_product;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProductInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","root");
		
		Statement statement = connection.createStatement();
		
		int count = statement.executeUpdate("INSERT INTO PRODUCT VALUES(1,'ONEPLUS',45999,'ONEPLUS TECHNOLOGY'),(2,'DELL',47890,'DELL INC.'),(3,'BOAT',1299,'DIXON TECHNOLOGY'),(4,'SMARTWATCH',1099,'FASTRACK'),(5,'CAMERA',30990,'CANON')");
		
		if (count!=0) 
		{
			System.out.println("Data Inserted");
		} 
		else 
		{
			System.out.println("Data Not Inserted");
		}
		
		connection.close();
	}
}
