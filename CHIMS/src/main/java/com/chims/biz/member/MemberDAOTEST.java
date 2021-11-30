package com.chims.biz.member;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.chims.biz.vo.MemberVO;

public class MemberDAOTEST {

	public static void main(String[] args) {
		// 1. Spring Container를 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");

		// 2. Spring Container로부터 BoardServiceImpl 객체를 요청(lookup)한다.
		MemberDAO memberDAO = (MemberDAO) container.getBean("memberDAO");

		// 3. 글 등록 기능 테스트
		MemberVO vo = new MemberVO();
		vo.setMember_id("test");
		vo.setMember_pwd("pwdtest");
		vo.setMember_name("test1");
		vo.setMember_role(1);
		vo.setDept_no(1);

		memberDAO.insertBoard(vo);

		/*// 4. 글 목록 검색 기능 테스트
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for (BoardVO board : boardList) {
			System.out.println("===> " + board.toString());
		}*/

		// 5. Spring Container 종료
		container.close();

	}

}
