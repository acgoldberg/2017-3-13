/*package Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import IdEntity.Film;
import JdbcUtil.ConnectionFactory;

public class FilmService {
	public String getLanguageId(Connection con, Film f, String language){
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
	}
}*/
