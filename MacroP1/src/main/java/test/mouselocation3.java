package test;

import java.awt.MouseInfo;
import java.awt.Point;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//마우스포인터를 main.jsp 파일로 넘겨줘야함
//main.jsp파일에서 모든 좌표값을 받도록 버튼 여러개 만들어서 각각 좌표 받도록 해야함

@WebServlet("/test/mouselocation3.do")
public class mouselocation3 extends HttpServlet {

	private static int e =0;
	private static int r =0;
	private static Scanner kb = new Scanner(System.in);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        List<Integer> list = new ArrayList<>();
		HttpSession session = req.getSession();
//		list = (List<Integer>) session.getAttribute("mousePositions");
//        System.out.println(list+ "        sd");
        
        
        Point p;
        p = MouseInfo.getPointerInfo().getLocation();
        e = (int) p.getX();
        r = (int) p.getY();
        System.out.println("Clicked mouse position: (" + e + ", " + r + ")");
//        list.add(x);
//        list.add(y);
//        session.setAttribute("mousePositions", list);        
		session.setAttribute("e", e);
		session.setAttribute("r", r);
		
		req.getRequestDispatcher("../01macro/mouseclick4.jsp").forward(req, resp);
	}

	
}
