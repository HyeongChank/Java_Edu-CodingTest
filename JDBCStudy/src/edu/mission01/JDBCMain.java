package edu.mission01;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCMain {

	public static void main(String[] args) throws Exception {
		//매서드를 사용하기 위해 객체 생성!!!!!!!!!!
		JDBCMSp cli = new JDBCMSp();
		JDBCH2p cli2 = new JDBCH2p();
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "musthave", "jsk281988");) {
			
			System.out.println("<=== StudyStatement ===>");
			cli.StudyStatement(con);
			System.out.println();

			System.out.println("<=== StudyPrepareStatement ===>");
			cli.StudyPrepareStatement(con);
		}		
	}

}
