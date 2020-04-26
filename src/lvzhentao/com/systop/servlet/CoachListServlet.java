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
 * Servlet implementation class CoachListServlet
 */
@WebServlet("/CoachListServlet")
public class CoachListServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*	// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		CoachDao coachdao=new CoachDaoImpl();
		List<Coach> list=coachdao.showList();
		request.setAttribute("list", list);
		//跳转
		request.getRequestDispatcher("/CoachList.jsp").forward(request, response);*/
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
