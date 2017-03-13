package ServletTest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import IdEntity.Customer;
import Service.CustomerService;

/*@WebServlet(name="LoginServlet8",urlPatterns="/LoginServlet8")*/
public class LoginServlet8 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private CustomerService Customerservice = new CustomerService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("=====doGet=====");
		doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("=====doPost=====");
		/*//鍒犻櫎session瀵硅薄
		req.getSession().invalidate();
		resp.sendRedirect(req.getContextPath()+"/06/index.jsp");*/
		String message = null;
		String forward = null;
		RequestDispatcher rd = null;
		
		String name = req.getParameter("name");
		Customer c = new Customer();
		c.setFirstname(name);
		if(Customerservice.checkCustomer(c)){
			//System.out.println("鐢ㄦ埗瀛樺湪");
			rd = req.getRequestDispatcher("/081/success.jsp");
			rd.forward(req, resp);
		}
		else{
			//System.out.println("鐢ㄦ埗涓嶅瓨鍦�);
			req.setAttribute("message", "账号或密码错误");
			rd = req.getRequestDispatcher("/081/login.jsp");
			rd.forward(req, resp);
		}
	}
}
