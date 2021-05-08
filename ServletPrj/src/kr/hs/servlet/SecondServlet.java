package kr.hs.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		System.out.println("init()호출");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int a=3;
		if(a%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		//홀짝인지 판별해서 콘솔에 출력
	}
}
