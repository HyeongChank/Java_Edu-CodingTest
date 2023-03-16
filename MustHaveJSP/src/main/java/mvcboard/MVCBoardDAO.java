package mvcboard;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import common.JDBConnect;
import model1.board.BoardDTO;

public class MVCBoardDAO extends JDBConnect{
	public MVCBoardDAO() {
		super();
	}
	public int selectCount(Map<String, Object> map) {
		int totalCount =0;
		String query = "select count(*) from mvcboard";
		if(map.get("searchWord") != null) {
			query += " WHERE " + map.get("searchField") + " "
					+ "LIKE '%" + map.get("searchWord") + "%";
		}
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			rs.next();
			totalCount = rs.getInt(1);
		}
		catch(Exception e) {
			System.out.println("게시물 수를 구하는 중 예외 발생");
			e.printStackTrace();
		}
		return totalCount;
			
	}
	public List<MVCBoardDTO> selectListPage(Map<String, Object> map){
		List<MVCBoardDTO> board = new Vector<MVCBoardDTO>();
		String query = " select * from ( "
					+ "	select Tb.*, rownum rnum from ( "
					+ "		select * from mvcboard ";
		if(map.get("searchWord") != null) {
			query += " WHERE " + map.get("searchField")
					+ " LIKE '%" + map.get("searchWord") + "%' ";
		
		}
		query += " order by idx desc "
				+ "		) Tb "
				+ " ) "
				+ " where rnum between ? and ?";
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, map.get("start").toString());
			psmt.setString(2, map.get("end").toString());
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				MVCBoardDTO dto = new MVCBoardDTO();
				
				dto.setIdx(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setContent(rs.getString("content"));
				dto.setPostdate(rs.getDate("postdate"));
				dto.setId(rs.getString("id"));
				dto.setVisitcount(rs.getString("visitcount"));
				
				bbs.add(dto);
			}
		}
		catch(Exception e) {
			System.out.println("게시물 조회 중 예외 발생");
			e.printStackTrace();
		}
		return bbs;
	}
}
