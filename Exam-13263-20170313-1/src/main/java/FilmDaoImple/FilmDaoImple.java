package FilmDaoImple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import FilmDao.FilmDao;
import IdEntity.Film;

public class FilmDaoImple implements FilmDao{

	public ResultSet selectAll(Connection con) throws Exception {
		PreparedStatement ps = con.prepareStatement("select film_id,title,description,language.name from film,language where film.language_id = language.language_id");
		return ps.executeQuery();
	}

	public void save(Connection con, Film f) throws Exception {
/*		PreparedStatement ps = con
				.prepareCall("INSERT INTO USER(t_user,t_pass,t_id) values(?,?,?)");
		System.out.println("user=" + u.getUser());
		System.out.println("pass=" + u.getPass());
		ps.setString(1, u.getUser());
		ps.setString(2, u.getPass());
		ps.setInt(3, u.getId());
		ps.execute();*/
		
	}

	public String getLanguageId(Connection con, Film f, String language)
			throws Exception {
		PreparedStatement ps = con.prepareStatement("select language.id from language where language_name=?");
		ps.setString(1, language);
		ResultSet rs = ps.executeQuery();
		return rs.getString("language.id");
		
	}


	
}
