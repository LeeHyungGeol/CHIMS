package com.chims.biz.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chims.biz.vo.MemberVO;


@Service("memberService")
public class MemberServiceImpl {

	@Autowired
	private MemberDAO memberDAO;
	
	public MemberServiceImpl() {
	}

	public MemberVO getMember(MemberVO vo) {
		
		return this.memberDAO.getMember(vo);
	}

	public List<MemberVO> getMemberList(MemberVO vo) {
		
		return this.memberDAO.getMemberList(vo);
	}

	public void insertMember(MemberVO vo) {
		this.memberDAO.insertMember(vo);
	}

	public void updateMember(MemberVO vo) {
		this.memberDAO.updateMember(vo);
	}

}
