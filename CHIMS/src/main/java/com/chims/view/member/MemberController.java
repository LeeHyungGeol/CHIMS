package com.chims.view.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.chims.biz.member.MemberServiceImpl;
import com.chims.biz.vo.MemberVO;


@Controller
@SessionAttributes("member")
public class MemberController {

	@Autowired
	private MemberServiceImpl memberService;
	
	public MemberController() {
		System.out.println("===> MemberController 媛앹껜 �깮�꽦");
	}
	
	@RequestMapping(value="/login.do",method=RequestMethod.GET)
	public String login(MemberVO vo){
		System.out.println("===> login.do get");
		return "login.jsp";
	}
	
	@RequestMapping(value="/login.do", method = RequestMethod.POST)
	public String getMember(MemberVO vo, HttpSession session,Model model){
		System.out.println("===> 濡쒓렇�씤 �씤利앹쿂由�" + vo.toString());
		
		if(vo.getMember_id() == null || vo.getMember_id().equals("")){
			throw new IllegalArgumentException("�븘�씠�뵒�뒗 諛섎뱶�떆 �엯�젰�빐�빞 �빀�땲�떎.");
		}
		
		MemberVO member = memberService.getMember(vo);
		
		if(member != null){
			model.addAttribute(member);
			vo.setDept_no(member.getDept_no());
			
			session.setAttribute("member_id", member.getMember_id());
			session.setAttribute("member_name", member.getMember_name());
			session.setAttribute("member_role", member.getMember_role());
			
			System.out.println(member.toString());
			if(member.getMember_role().equals("admin") && member.getMember_pwd().equals(vo.getMember_pwd())){
				return "adminMain.do";
			}
			else
				return "memberMain.do";
		}else{
			return "login.jsp";
		}	
	}
	
	@RequestMapping(value="adminMemberList.do")
	public String getMemberList(MemberVO memberVO,Model model){
		System.out.println("===> MemberController getMemberList �샇異�");
		
		model.addAttribute("memberList",memberService.getMemberList(memberVO));
		
		return "adminMemberList.jsp";
	}
	
	@RequestMapping(value="adminMemberInsert.do",method=RequestMethod.GET)
	public String memberInsertView(MemberVO memberVO,Model model){
		System.out.println("===> MemberController memberInsert get �샇異�");

		return "adminMemberInsert.jsp";
	}
	
	@RequestMapping(value="adminMemberInsert.do",method=RequestMethod.POST)
	public String memberInsert(MemberVO memberVO,Model model){
		System.out.println("===> MemberController memberInsert post �샇異�");
		
		memberService.insertMember(memberVO);
		
		return "adminMemberList.do";
	}
	
	@RequestMapping(value="adminMemberUpdate.do",method=RequestMethod.GET)
	public String memberUpdateView(MemberVO memberVO, HttpSession session, Model model){
		System.out.println("===> MemberController memberUpdate get �샇異�");
		
		memberVO.setMember_role((String) session.getAttribute("member_role"));
		
		System.out.println(memberVO.toString());
		
		model.addAttribute("memberUpdate",memberService.getMember(memberVO));
		
		return "adminMemberUpdate.jsp";
	}
	
	@RequestMapping(value="adminMemberUpdate.do",method=RequestMethod.POST)
	public String memberUpdate(MemberVO memberVO,Model model, HttpSession session){
		System.out.println("===> MemberController memberUpdate post �샇異�");
		System.out.println(memberVO.toString());
		
		memberVO.setMember_role((String) session.getAttribute("member_role"));

		memberService.updateMember(memberVO);
		
		return "adminMemberList.do";
	}
	
	@RequestMapping(value="memberMypage.do")
	public String memberMypage(MemberVO memberVO){
		System.out.println("===> memberController memberMypage �샇異�");
		
		
		
		return "memberMypage.jsp";
	}
	
	
	
	
	
	
	
	

}
