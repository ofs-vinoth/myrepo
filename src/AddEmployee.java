


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.EmployeeBean;
import bean.EmployeeInsertion;

/**
 * Servlet implementation class AddEmployee
 */
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String name = request.getParameter("name");
		String id = request.getParameter("id1");
		String dept = request.getParameter("dept");
		EmployeeBean addEmp = new EmployeeBean();
		addEmp.setName(name);
		addEmp.setId(id);
		addEmp.setDept(dept);
		int status = EmployeeInsertion.addEmp(addEmp);
		if(status==1) {
			session.setAttribute("id", id);
			response.sendRedirect("addsuc.jsp");
		}
		else {
			session.setAttribute("id", id);
			response.sendRedirect("addfail.jsp");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
