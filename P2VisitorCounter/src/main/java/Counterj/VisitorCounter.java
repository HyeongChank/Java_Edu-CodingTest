package Counterj;

import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Counterj/visitor.do")
public class VisitorCounter extends HttpServlet{
	//
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		String tel = req.getParameter("tel");
		String ment = req.getParameter("ment");
        String filePath = "./visitor2.txt"; // 저장할 파일 경로 및 이름
        System.out.println(name + tel + ment +  "\n"); // 데이터를 파일에 쓰기
    //true를 붙이면 데이터가 누적해서 쌓임
        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write(name + tel + ment +  "\n"); // 데이터를 파일에 쓰기
            writer.write("\n");
            writer.close(); // 파일 쓰기 종료
            System.out.println("저장 성공");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

		
	
}
