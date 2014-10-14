

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.EmployeeBean;
import bean.EmployeeUpdation1;

/**
 * Servlet implementation class EmployeeUpdation
 */
public class EmployeeUpdation extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeUpdation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String id = request.getParameter("id1");
		String basic = request.getParameter("basic");
		String hra = request.getParameter("hra");
		String da = request.getParameter("da");
		String pi = request.getParameter("pi");
		EmployeeBean empBean = new EmployeeBean();
		empBean.setId(id);
		empBean.setBasic(basic);
		empBean.setHra(hra);
		empBean.setDa(da);
		empBean.setPi(pi);
		int status = EmployeeUpdation1.addEmp(empBean);
		if(status ==1) {
			session.setAttribute("id", id);
			response.sendRedirect("updatesuc.jsp");
		}
		else {
			session.setAttribute("id", id);
			response.sendRedirect("updatefail.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
