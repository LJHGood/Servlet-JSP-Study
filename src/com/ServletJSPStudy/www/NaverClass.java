package com.ServletJSPStudy.www;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/naver")
public class NaverClass extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// 앞으로 UTF-8로 출력한다고 설정
		resp.setCharacterEncoding("UTF-8");
		// 브라우저 컨텐츠를 UTF-8로 읽어라 설정
		resp.setContentType("text/html; charset=UTF-8"); 
		
		// cnt 인자 값 받기
		String cnt_ = req.getParameter("cnt");

		int cnt = 100;
		
		if (cnt_ != null && !cnt_.equals("")) {
			cnt = Integer.parseInt(cnt_);
		}
		
		PrintWriter out = resp.getWriter();

		for (int i = 0; i < cnt; i++) {
			out.println((i + 1) + ": 안녕 Hello");
		}
	}

}