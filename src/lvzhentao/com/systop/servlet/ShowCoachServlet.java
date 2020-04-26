package lvzhentao.com.systop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lvzhentao.com.systop.dao.CoachDao;
import lvzhentao.com.systop.dao.impl.CoachDaoImpl;
import lvzhentao.com.systop.domain.Coach;

/**
 * Servlet implementation class ShowCoach
 */
@WebServlet("/ShowCoachServlet")
public class ShowCoachServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str=request.getParameter("id");
		int id=Integer.parseInt(str);
		String img =request.getParameter("img");
		CoachDao coachdao=new CoachDaoImpl();
		Coach coach=coachdao.showCoach(id);
		request.setAttribute("coach", coach);
		request.setAttribute("img", img);
		//跳转
		request.getRequestDispatcher("/ShowCoach.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
