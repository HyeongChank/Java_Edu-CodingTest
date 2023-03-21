package eltest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;



@WebServlet("/eltest/write.do")

public class eltest extends HttpServlet{


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	/* 값 받기 */
		String ty = req.getParameter("name");
		System.out.println(ty);
		int ty2 = Integer.parseInt(ty) * 2;
		System.out.println(ty2);
		
	/* 값 저장하기 */
		req.setAttribute("ty", ty);
		req.setAttribute("ty2", ty2);
		
		
	//배열 넘기기 foreach로
		int [] array = new int[ty2];
		for(int i=0; i<=ty2-1;i++) {
			array[i] = i;
		}
		int ar1 = array[1];
		req.setAttribute("ar1", ar1);
		req.setAttribute("array", array);
		
	//hashmap 으로 넘기기(requestScope로 받아야 함)
		HashMap<Integer,String> hm = new HashMap<>();
		for(int i=0; i<=ty2-1;i++) {
			hm.put(i, "hash");
		}
		req.setAttribute("hm", hm);
		
		
		if(ty != null) {
			/* null이 아니면 el2 페이지로 이동 */
		req.getRequestDispatcher("../mission1/el2.jsp").forward(req, resp);
		

		}
	}		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}
