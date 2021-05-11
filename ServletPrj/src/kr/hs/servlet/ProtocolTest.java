package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/protocolTest")
public class ProtocolTest extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>프로토콜</title></head><body>");
		out.print("getRequestURI : "+req.getRequestURI());
		out.print("<br>getServerName : "+req.getServerName());
		out.print("<br>getServerPort : "+req.getServerPort());
		out.print("<br>getRemoteAddr : "+req.getRemoteAddr());
		out.print("<br>getRemoteHost : "+req.getRemoteHost());
		out.print("<br>getRemotePort : "+req.getRemotePort());
		out.print("<br></body></html>");
	}
}
