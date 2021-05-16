package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class connexion {
	private static Connection con;
private static Statement stm;

public static void connect() throws SQLException, ClassNotFoundException {
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost/perss";
	con=(Connection) DriverManager.getConnection(url,"root","");
	stm=(Statement) con.createStatement();
	
}

public static void disconnect() throws SQLException {
	stm.close();
	con.close();
}
public static int Maj (String sql) throws SQLException {
	return stm.executeUpdate(sql);
			
}
public static ResultSet select (String sql) throws SQLException {
	return stm.executeQuery(sql);
	
}


}
