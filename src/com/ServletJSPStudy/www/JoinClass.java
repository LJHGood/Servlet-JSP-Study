package com.ServletJSPStudy.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/join")
public class JoinClass extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();
		
		String infos[] = request.getParameterValues("info");

		String id = infos[0];
		String name = infos[1];
		String address = infos[2];
		String birth = infos[3];
		
		out.println("아이디 : " + id);
		out.println("이름 : " + name);
		out.println("주소 : " + address);
		out.println("생년월일 : " + birth);
		out.println("회원가입완료");
	}
}
