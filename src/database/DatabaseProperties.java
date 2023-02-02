package database;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Properties;

import model.users;

public class DatabaseProperties {

	// init database constants
	protected static final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
	protected static final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/test";
	protected static final String USERNAME = "root";
	protected static final String PASSWORD = "";
	protected static final String MAX_POOL = "250";

	// init connection object
	protected static Connection connection;
	// init properties object
	protected static Properties properties;

	// declare resultset mapping
	public static ArrayList<users> resultList = new ArrayList();

}
