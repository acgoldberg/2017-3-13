package JdbcUtil;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory1 {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	private Connection con;
	private static final  ConnectionFactory1 connectionFactory1  = new ConnectionFactory1();
	public ConnectionFactory1() {	}
	
	public static ConnectionFactory1 getConnectionFactory1(){
		return connectionFactory1;
	}
	static{
		Properties properties = new Properties();
		InputStream in = ConnectionFactory1.class.getClassLoader().getResourceAsStream("jdbcConfig.properties");
		try {
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver = properties.getProperty("driver");
		url = properties.getProperty("url");
		username = properties.getProperty("username");
		password = properties.getProperty("password");
	}
	public Connection createConnectino(){
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
}
