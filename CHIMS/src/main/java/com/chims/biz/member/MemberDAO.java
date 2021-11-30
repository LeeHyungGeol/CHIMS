package com.chims.biz.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.chims.biz.JDBCUtil;
import com.chims.biz.vo.MemberVO;

@Repository("memberDAO")
public class MemberDAO {

	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;

	private final String MEMBER_INSERT = "insert into member (member_id,member_pwd,member_name,member_role,dept_no) values (?,?,?,?,?)";
	private final String MEMBER_GET = "select * from member where member_id=?";
	private final String MEMBER_LIST = "select * from member";

	public MemberDAO() {
	}

	public void insertBoard(MemberVO vo) {
		System.out.println("===> JDBC占쏙옙 insertBaord() 占쏙옙占� 처占쏙옙 : " + vo.toString());

		try {
			this.conn = JDBCUtil.getConnection();
			this.stmt = this.conn.prepareStatement(MEMBER_INSERT);
			this.stmt.setString(1, vo.getMember_id());
			this.stmt.setString(2, vo.getMember_pwd());
			this.stmt.setString(3, vo.getMember_name());
			this.stmt.setInt(4, vo.getMember_role());
			this.stmt.setInt(5, vo.getDept_no());
			this.stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	} // insertBoard(BoardVO vo) END

	/*
	 * public MemberVO getBoard(MemberVO vo) {
	 * System.out.println("===> JDBC占쏙옙 getBoard() 占쏙옙占� 처占쏙옙"); MemberVO board
	 * = null;
	 * 
	 * try { this.conn = JDBCUtil.getConnection(); this.stmt =
	 * this.conn.prepareStatement(BOARD_GET); this.stmt.setInt(1, vo.getSeq());
	 * this.rs = this.stmt.executeQuery();
	 * 
	 * if (this.rs.next()) { board = new MemberVO();
	 * board.setSeq(this.rs.getInt("seq"));
	 * board.setTitle(this.rs.getString("title"));
	 * board.setWriter(this.rs.getString("writer"));
	 * board.setContent(this.rs.getString("content"));
	 * board.setRegDate(this.rs.getDate("regdate"));
	 * board.setCnt(this.rs.getInt("cnt")); } } catch (Exception e) {
	 * e.printStackTrace(); } finally { JDBCUtil.close(rs, stmt, conn); } return
	 * board; } // getBoard(BoardVO vo) END
	 * 
	 * 
	 * 
	 * 
	 * // 占쏙옙 占쏙옙占� 占쏙옙회 public List<MemberVO> getBoardList(MemberVO vo) {
	 * System.out.println("===> JDBC占쏙옙 getBoardList() ;;;;;");
	 * 
	 * List<MemberVO> boardList = new ArrayList<MemberVO>();
	 * 
	 * try { this.conn = JDBCUtil.getConnection(); // this.stmt =
	 * this.conn.prepareStatement(BOARD_LIST);
	 * 
	 * if(vo.getSearchCondition().equals("TITLE")){ this.stmt =
	 * this.conn.prepareStatement(BOARD_LIST_T); }
	 * 
	 * if(vo.getSearchCondition().equals("CONTENT")){ this.stmt =
	 * this.conn.prepareStatement(BOARD_LIST_C); }
	 * 
	 * this.stmt.setString(1, vo.getSearchKeyword()); this.rs =
	 * this.stmt.executeQuery();
	 * 
	 * while (this.rs.next()) { MemberVO board = new MemberVO();
	 * board.setSeq(this.rs.getInt("seq"));
	 * board.setTitle(this.rs.getString("title"));
	 * board.setWriter(this.rs.getString("writer"));
	 * board.setContent(this.rs.getString("content"));
	 * board.setRegDate(this.rs.getDate("regdate"));
	 * board.setCnt(this.rs.getInt("cnt")); boardList.add(board); } } catch
	 * (SQLException e) {
	 * System.out.println("===> JDBC占쏙옙 getBoardList() 오류처리"); } finally {
	 * JDBCUtil.close(rs, stmt, conn); } return boardList; } //
	 * getBoardList(BoardVO vo) END
	 */

}
