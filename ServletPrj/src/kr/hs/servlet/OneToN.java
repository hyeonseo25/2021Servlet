package kr.hs.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/oneToN")
public class OneToN extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num = Integer.parseInt(req.getParameter("n"));
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		req.setAttribute("sum", sum);
		RequestDispatcher dispatcher = req.getRequestDispatcher("one_to_n_reuslt.jsp");
		dispatcher.forward(req, resp);
	}
}
