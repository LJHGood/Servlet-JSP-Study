package com.ServletJSPStudy.www;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub

		// 받을 때 UTF-8형식으로 해라.
		request.setCharacterEncoding("UTF-8");

		// 흐름 넘기기(다음 필터 또는 다음 서블릿 실행시키기)
		chain.doFilter(request, response);
	}
}
