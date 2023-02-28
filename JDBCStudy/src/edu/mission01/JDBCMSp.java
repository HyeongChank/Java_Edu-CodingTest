package edu.mission01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import edu.pnu.JDBCClientMySQL2;

public class JDBCMSp extends JDBCParent {
	
	public void meth() {
	this.printColumnName();
	this.StudyStatement();
	
	}
	public static void main(String[] args) throws Exception  {
		//매서드를 사용하기 위해 객체 생성!!!!!!!!!!
		JDBCMSp cli = new JDBCMSp();
		ResultSet rs = st.executeQuery("SELECT * FROM board");

		Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "musthave", "jsk281988");) {
			
			System.out.println("<=== StudyStatement ===>");
			cli.StudyStatement(con);
			System.out.println();

		}		
	}
	
}
