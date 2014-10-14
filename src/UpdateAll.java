

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.EmployeeBean;
import bean.UpdateBal;

/**
 * Servlet implementation class UpdateAll
 */
public class UpdateAll extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAll() {
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
		String gross=request.getParameter("gross");
		String deduc=request.getParameter("deduc");
		String np=request.getParameter("np");
		EmployeeBean eb = new EmployeeBean();
		eb.setGross(gross);
		eb.setDeduc(deduc);
		eb.setNp(np);
		eb.setId(id);
		int status = UpdateBal.upEmp(eb);
		System.out.println(status);
		if(status==1) {
			session.setAttribute("id", id);
			response.sendRedirect("upsuc.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
