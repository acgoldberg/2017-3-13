package Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import CustomerDao.CustomerDao;
import CustomerDaoImple.CustomerDaoImple;
import IdEntity.Customer;
import JdbcUtil.ConnectionFactory;

public class CustomerService {
	private CustomerDao customerdao = new CustomerDaoImple();
	
	public boolean checkCustomer(Customer c){
		try {
			Connection con = null;
			con = ConnectionFactory.getInstance().makeConnection();
			con.setAutoCommit(false);
			ResultSet rs = customerdao.getCustomerDao(con, c);
			
			while(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
