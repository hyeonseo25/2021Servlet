package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginmvc")
public class LoginMVC extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		if(id.equals("kim")&&pw.equals("1111")) {
			req.setAttribute("id", id);
			req.setAttribute("pw", pw);
			// request������ model�̶� ������ ���� result ���� �����Ѵ�.
			RequestDispatcher dispatcher = req.getRequestDispatcher("loginresult.jsp");
			dispatcher.forward(req, resp);
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("loginform2.jsp");
			dispatcher.forward(req, resp);
		}
		
		//�������� �ڹٽ�ũ��Ʈ ȣ��
		/*PrintWriter out = resp.getWriter();
		String str="";
		str = "<script>alter('hi');</script>";
		out.print(str);*/
	}
}
