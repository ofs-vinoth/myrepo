

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.EmployeeBean;
import bean.GetDetails;

/**
 * Servlet implementation class AllDetails
 */
public class AllDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllDetails() {
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
		EmployeeBean ae = new EmployeeBean();
		ae.setId(id);
		ArrayList<EmployeeBean> status = GetDetails.getEmp(ae);
		if(status.size()==0) {
			session.setAttribute("id1", id);
			response.sendRedirect("wrongid.jsp");
		}
		else {
			request.setAttribute("ale", status);
			RequestDispatcher view = request.getRequestDispatcher("indetail.jsp");
			view.forward(request, response);

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
