package test;

import java.awt.MouseInfo;
import java.awt.Point;
import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//마우스포인터를 main.jsp 파일로 넘겨줘야함
//main.jsp파일에서 모든 좌표값을 받도록 버튼 여러개 만들어서 각각 좌표 받도록 해야함

@WebServlet("/test/mouselocation.do")
public class mouselocation extends HttpServlet {

	private static int x =0;
	private static int y =0;
	private static Scanner kb = new Scanner(System.in);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Point p;
        p = MouseInfo.getPointerInfo().getLocation();
        x = (int) p.getX();
        y = (int) p.getY();
        System.out.println("Clicked mouse position: (" + x + ", " + y + ")");

		req.setAttribute("x", x);
		req.setAttribute("y", y);
	}
	public static int [] mouselocation() {
		int [] array = new int[2];
        Point p;
        p = MouseInfo.getPointerInfo().getLocation();
        x = (int) p.getX();
        y = (int) p.getY();
        System.out.println("Clicked mouse position: (" + x + ", " + y + ")");
		array[0] = x;
		array[1] = y;
		return array;
	}
}
