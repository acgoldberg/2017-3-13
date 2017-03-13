package JdbcUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactoryTest {

	public static void main(String[] args) throws SQLException {
		
			ConnectionFactory cf = ConnectionFactory.getInstance();
			Connection con = cf.makeConnection();
			System.out.println(con.getAutoCommit());

	}

}
