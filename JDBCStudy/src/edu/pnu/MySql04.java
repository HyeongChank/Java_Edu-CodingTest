package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class MySql04 {

//	public int getColumnCount(ResultSet rs) throws Exception {
//		return rs.getMetaData().getColumnCount();
//	}

	public int printColumnName(ResultSet rs) throws Exception {
		ResultSetMetaData meta = rs.getMetaData();
		int count = meta.getColumnCount();
		
		//컬럼명
		StringBuilder sb = new StringBuilder("####");
		for (int i = 1 ; i <= count ; i++) {
			sb.append("," + meta.getColumnName(i));
		}
		System.out.println(sb);
		System.out.println("-".repeat(sb.length()));
		
		return count;
	}
	
	public void StudyStatement(Connection con) throws Exception {

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select continent, count(*) from countrylanguage, country where language in (\"english\") and countrylanguage.CountryCode=country.Code group by continent");
//		String result = rs.getString(1);
//		System.out.println("rkkkkkkkkk" + result);
		int colCount = printColumnName(rs);
		int rowCount = 1;
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
	}

	
	public static void main(String[] args) throws Exception  {
		//매서드를 사용하기 위해 객체 생성!!!!!!!!!!
		MySql04 cli = new MySql04();

		Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "musthave", "jsk281988");) {
			
			System.out.println("<=== StudyStatement ===>");
			cli.StudyStatement(con);
			System.out.println();


		}		
	}
}
