package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/odd")
public class Odd extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.print("<html><head><title>Ȧ¦�Ǻ�</title></head><body>");
		int a=3;
		// a�� Ȧ¦�Ǻ��ؼ� ��½�Ű��
		if(a%2==0) {
			//¦��
			out.print("<h1>¦��</h1>");
		}else {
			//Ȧ��
			out.print("<h1>Ȧ��</h1>");
		}
		out.print("</body></html>");
	}
}
