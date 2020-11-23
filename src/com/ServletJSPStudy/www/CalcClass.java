package com.ServletJSPStudy.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calc")
public class CalcClass extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8"); 

		PrintWriter out = response.getWriter();
		
		String x_ = request.getParameter("x");
		String y_ = request.getParameter("y");
		String operator = request.getParameter("operator");

		try {
			int x = Integer.parseInt(x_);
			int y = Integer.parseInt(y_);
			
			int result = 0;
			
			if(operator.equals("더하기")) {
				result = x + y;
		}else if(operator.equals("빼기")) {
				result = x - y;
			}
			
			out.println(operator + "결과 :" + result);
			
		} catch (Exception e) {
			// TODO: handle exception
			out.println("숫자만 입력 가능합니다.");
		}
	
	}
}
