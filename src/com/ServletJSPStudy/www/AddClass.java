package com.ServletJSPStudy.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddClass extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8"); 

		PrintWriter out = response.getWriter();
		
		String x_ = request.getParameter("x");
		String y_ = request.getParameter("y");

		int x = 0;
		int y = 0;
		
		if(!x_.equals("")) x = Integer.parseInt(x_);
		if(!y_.equals("")) y = Integer.parseInt(y_);

		out.println("x + y 결과값은 : " + (x + y) + "입니다.");
		
		/*
		try {
			String x_ = request.getParameter("x");
			String y_ = request.getParameter("y");
			
			int x = Integer.parseInt(x_);
			int y = Integer.parseInt(y_);

			int result = x + y;
			out.println("x + y 결과값은 : " + result + "입니다.");
			
		}catch (Exception e) {
			// TODO: handle exception
			out.println("숫자만 입력 가능합니다.");
		}
		*/
	}

}
