package counterDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import visitorVO.VisitorVO;

public class CounterDao {

	public String insertVisitor(String name, String tel, String story, int score) {
		Connection con;
		PreparedStatement psmt;
		ResultSet rs;	
		System.out.println("넘어옴");
		try {
// db 연결하려면 lib 폴더에 jar 파일 넣어야 함
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/musthave";
			String id = "musthave";
			String pwd = "jsk281988";
			con = DriverManager.getConnection(url, id, pwd);
		}
		catch(Exception e) {
			con = null;
			e.printStackTrace();
		}
		
		int result =0;
		Date date = new Date();
		String query = "insert into visitor(name, tel, story, score) values(?,?,?,?);";
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, name);
			psmt.setString(2, tel);
			psmt.setString(3, story);
			psmt.setInt(4, score);
			result = psmt.executeUpdate();
			System.out.println("db 등록 성공");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
}
