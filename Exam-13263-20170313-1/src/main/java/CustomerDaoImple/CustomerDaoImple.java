package CustomerDaoImple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import CustomerDao.CustomerDao;
import IdEntity.Customer;

public class CustomerDaoImple implements CustomerDao{

	public ResultSet getCustomerDao(Connection con, Customer c)
			throws SQLException {
		PreparedStatement ps = con.prepareStatement("select * from customer where first_name= ?");
		ps.setString(1, c.getFirstname());		
		return ps.executeQuery();
	}

}
