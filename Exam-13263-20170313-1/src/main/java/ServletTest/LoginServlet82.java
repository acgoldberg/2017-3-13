package ServletTest;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import FilmDao.FilmDao;
import FilmDaoImple.FilmDaoImple;
import JdbcUtil.ConnectionFactory;

/*@WebServlet(name="LoginServlet82",urlPatterns="/LoginServlet82")*/
public class LoginServlet82 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private FilmDao filmdao = new FilmDaoImple();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("=====doGet=====");
		doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("=====doPost=====");
		Connection con = null;
		RequestDispatcher rd = null;
		con = ConnectionFactory.getInstance().makeConnection();
		try {
			con.setAutoCommit(false);
			ResultSet rs = filmdao.selectAll(con);
			//int c = (int)rs;
			System.out.println("rs="+rs);
			int i=0;
			while(rs.next()){
				req.setAttribute("a["+i+"]", rs.getString("film_id"));
				req.setAttribute("b["+i+"]", rs.getString("title"));
				req.setAttribute("c["+i+"]", rs.getString("description"));
				req.setAttribute("d["+i+"]", rs.getString("language.name"));
				i++;	
			}
			req.setAttribute("i", i);
			rd = req.getRequestDispatcher("/081/show.jsp");
			rd.forward(req, resp);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
