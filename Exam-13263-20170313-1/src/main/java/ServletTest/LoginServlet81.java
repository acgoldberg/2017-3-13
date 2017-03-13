package ServletTest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import FilmDao.FilmDao;
import FilmDaoImple.FilmDaoImple;
import IdEntity.Film;
import Service.CustomerService;

/*@WebServlet(name="LoginServlet8",urlPatterns="/LoginServlet8")*/
public class LoginServlet81 extends HttpServlet{
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
		/*//删除session对象
		req.getSession().invalidate();
		resp.sendRedirect(req.getContextPath()+"/06/index.jsp");*/
		String forward = null;
		RequestDispatcher rd = null;
		String film_id = req.getParameter("film_id");
		String title = req.getParameter("title");
		String description = req.getParameter("description");
		String language = req.getParameter("language");
		String language_id =null;
		//language_id = filmdao.getLanguageId(con, f, language);
		Film film = new Film();
		film.setFilm_id(film_id);
		film.setTitle(title);
		film.setDescription(description);
		film.setLanguage(language);
	    
	}
}
