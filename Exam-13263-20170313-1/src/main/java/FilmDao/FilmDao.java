package FilmDao;

import java.sql.Connection;
import java.sql.ResultSet;

import IdEntity.Film;

public interface FilmDao {
	public  ResultSet selectAll(Connection con) throws Exception;
	public abstract String getLanguageId(Connection con,Film f,String language) throws Exception;
	public abstract void save(Connection con,Film f) throws Exception;
	
}
