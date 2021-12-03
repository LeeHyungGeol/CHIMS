package com.chims.biz.member;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chims.biz.vo.MemberVO;


@Repository("memberDAO")
public class MemberDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public MemberDAO() {
		System.out.println("===> MemberDAO 媛앹껜 �깮�꽦");
	}
	
	public void insertMember(MemberVO vo){
		System.out.println("===> mybatis濡� insertMember �샇異�");
		mybatis.insert("MemberDAO.insertMember",vo);
	}
	
	public void updateMember(MemberVO vo){
		System.out.println("===> mybatis濡� updateMember �샇異�");
		System.out.println(vo.toString());
		
		mybatis.update("MemberDAO.updateMember",vo);
	}
	
	public MemberVO getMember(MemberVO vo){
		System.out.println("===> mybatis濡� getMember �샇異�");
		return (MemberVO)mybatis.selectOne("MemberDAO.getMember",vo);
	}
	
	public List<MemberVO> getMemberList(MemberVO vo){
		System.out.println("===> mybatis濡� getMemberList �샇異�");
		
		return mybatis.selectList("MemberDAO.getMemberList",vo);		
	}

}
