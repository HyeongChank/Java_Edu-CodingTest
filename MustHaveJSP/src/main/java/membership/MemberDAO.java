package membership;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.servlet.ServletContext;

import common.JDBConnect;
import model1.board.BoardDTO;


public class MemberDAO extends JDBConnect{
	public MemberDAO(String drv, String url, String id, String pw) {
		super(drv, url, id, pw);
	}
	public MemberDAO(ServletContext application) {
		super(application);
	}
	public MemberDTO getMemberDTO(String uid, String upass) {
		MemberDTO dto = new MemberDTO();
		String query = "select * from member where id=? and pass =?";
//		String query2 = "insert into member(id, pass, name) values('eom','1234',null);";

		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, uid);
			psmt.setString(2, upass);
			rs = psmt.executeQuery();
			
//			psmtt = con.prepareStatement(query2);
//			psmtt.setString(30, dto.getId());
//			psmtt.setString(2, dto.getPass());
//			result = psmtt.executeUpdate();
			
			
			//dao 4개 변수 중 query id, pass 에 dto id, pass 넣기
			if(rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString(3));
				dto.setRegidate(rs.getString(4));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	public int regitMemberDTO(MemberDTO dto) {

		String query2 = "insert into member("
				+ " id, pass, name)"
				+ " values("
				+ " ?,?,?)";
		int result =0;
		try {
			psmt = con.prepareStatement(query2);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPass());
			psmt.setString(3, dto.getName());
			result = psmt.executeUpdate();
			
			//dao 4개 변수 중 query id, pass 에 dto id, pass 넣기

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public List<MemberDTO> selectList(Map<String,Object> map){
		List<MemberDTO> bbs = new Vector<MemberDTO>();
		String query = "select * from member";
		if( map != null &&map.get("searchWord") != null) {
			query += " WHERE " + map.get("searchField") + " "
					+ "LIKE '%" + map.get("searchWord") + "%'";
		}
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setId(rs.getString("id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString("name"));
				
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
