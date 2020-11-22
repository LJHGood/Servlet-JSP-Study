package com.ServletJSPStudy.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/notice-reg")
public class NoticeClass extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// 앞으로 UTF-8로 출력한다고 설정
		response.setCharacterEncoding("UTF-8");
		// 브라우저 컨텐츠를 UTF-8로 읽어라 설정
		response.setContentType("text/html; charset=UTF-8"); 
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");

		PrintWriter out = response.getWriter();
		out.println(title);
		out.println(content);

	}
}
