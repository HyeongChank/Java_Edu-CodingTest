package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class MySql02 {

	public int printColumnName(ResultSet rs) throws Exception {
		ResultSetMetaData meta = rs.getMetaData();
		int count = meta.getColumnCount();
		
		//컬럼명
		StringBuilder sb = new StringBuilder("Language");
		for (int i = 1 ; i <= count ; i++) {
			sb.append("," + meta.getColumnName(i));
		}
		System.out.println(sb);
		System.out.println("-".repeat(sb.length()));
		
		return count;
	}
	
	public void StudyStatement(Connection con) throws Exception {

		Statement st = con.createStatement();
//		Statement st2 = con.createStatement();
		ResultSet rs = st.executeQuery("select Language from countrylanguage, country where countrylanguage.CountryCode=country.Code and country.name in (\"south korea\")");		
//		ResultSet rs2 = st2.executeQuery("seleselect continent, name from countrylanguage, country where language in (\"english\") and countrylanguage.CountryCode=country.Code and IsOfficial in (\"T\")");
		int colCount = printColumnName(rs);
//		int colCount2 = printColumnName(rs2);
//		int colCount = getColumnCount(rs);
		int rowCount = 1;
//		int rowCount2 = 44;
		while(rs.next()) {
			for(int i = 1 ; i <= colCount ; i++) {
				if (i == 1)	System.out.print((rowCount++) + ",");
				else		System.out.print(",");
				System.out.print(rs.getString(i));
			}
			System.out.println();
		}
		rs.close();
		st.close();
//		while(rs2.next()) {
//			for(int i = 1 ; i <= colCount2 ; i++) {
//				if (i == 1)	System.out.print((rowCount2++) + ",");
//				else		System.out.print(",");
//				System.out.print(rs2.getString(i));
//			}
//			System.out.println();
//		}
//		rs2.close();
//		st2.close();
	}

	public static void main(String[] args) throws Exception  {
		//매서드를 사용하기 위해 객체 생성!!!!!!!!!!
		MySql02 cli = new MySql02();

		Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "musthave", "jsk281988");) {
			
			System.out.println("<=== StudyStatement ===>");
			cli.StudyStatement(con);
			System.out.println();

		}		
	}
}
