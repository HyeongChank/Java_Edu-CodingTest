package Counterj;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import counterDao.CounterDao;

@WebServlet("/Counterj/visitor.do")
public class VisitorCounter extends HttpServlet{
	//
	public CounterDao cd = new CounterDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		String tel = req.getParameter("tel");
		String ment = req.getParameter("ment");
        System.out.println(name + " "+ tel + " "+ ment +  "\n"); // 데이터를 파일에 쓰기
//	    String filePath = getServletContext().getRealPath("/report.txt");
	    
//	    if (!file.exists()) {
//	        file.createNewFile();
//	    }
        String filePath = "D:\\김형찬\\javanew\\P2VisitorCounter\\src\\main\\webapp\\report.txt"; // 저장할 파일 경로 및 이름
        File file = new File(filePath);
        
    //true를 붙이면 데이터가 누적해서 쌓임
        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write(name + " "+ tel + " "+ ment +  "\n"); // 데이터를 파일에 쓰기
            writer.write("\n");
            writer.close(); // 파일 쓰기 종료
            System.out.println("저장 성공");
            
            HttpSession session = req.getSession();
            if(session.getAttribute("num") != null) {
            	int num = (Integer)session.getAttribute("num");
            	num++;
                session.setAttribute("num", num);           	
            }
            else {
            	int num =1;
            	session.setAttribute("num", num);
            }
            int score = (Integer)session.getAttribute("num");
            cd.insertVisitor(name, tel, ment, score);
 
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        
        req.getRequestDispatcher("../Counter/Login.jsp").forward(req, resp);
    }

		
	
}
