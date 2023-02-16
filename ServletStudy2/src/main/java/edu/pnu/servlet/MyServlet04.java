package edu.pnu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myservlet04")
public class MyServlet04 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Myservlet04");
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		out.print("<table border=1 border-collapse = collapse>");
	
		out.print("<tr>");
		out.print("<th>번호</th>");
		out.print("<th>나라</th>");
		out.print("<th>수도</th>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>1</td>");
		out.print("<td>대한민국</td>");
		out.print("<td>서울</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>2</td>");
		out.print("<td>미국</td>");
		out.print("<td>워싱턴</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>3</td>");
		out.print("<td>일본</td>");
		out.print("<td>도쿄</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>4</td>");
		out.print("<td>중국</td>");
		out.print("<td>베이징</td>");
		out.print("</tr>");
		
		out.print("</table>");
	}
}
