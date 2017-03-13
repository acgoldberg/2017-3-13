package CustomerDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import IdEntity.Customer;

public interface CustomerDao {
	public ResultSet getCustomerDao(Connection con ,Customer c) throws SQLException;
}
