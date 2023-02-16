package edu.pnu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/myservlet05")
public class MyServlet05 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Myservlet05");
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<table border=1>");
		out.print("<tr>");
		out.print("<th>번호</th>");
		out.print("<th>나라</th>");
		out.print("<th>수도</th>");
		out.print("<th>인구</th>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>1</td>");
		out.print("<td>대한민국</td>");
		out.print("<td>서울</td>");
		out.print("<td>1000</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>2</td>");
		out.print("<td>미국</td>");
		out.print("<td>워싱턴</td>");
		out.print("<td>500</td>");
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
	
		//super.service(req,resp) 작성하면 밑에 do get도 실행됨
		super.service(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do get"+req.getMethod());
		
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<table border=1>");
		out.print("<tr>");
		out.print("<th>번호</th>");
		out.print("<th>나라</th>");
		out.print("<th>수도</th>");
		out.print("<th>인구</th>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>1</td>");
		out.print("<td>대한민국</td>");
		out.print("<td>서울</td>");
		out.print("<td>1000</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>2</td>");
		out.print("<td>미국</td>");
		out.print("<td>워싱턴</td>");
		out.print("<td>500</td>");
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
		out.close();
	}
	
}
