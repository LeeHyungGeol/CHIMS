package com.chims.view.order;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chims.biz.order.OrderServiceImpl;
import com.chims.biz.vo.MemberVO;
import com.chims.biz.vo.OrderVO;

@Controller
public class OrderController {

	@Autowired
	private OrderServiceImpl orderService;

	public OrderController() {
		System.out.println("===> OrderController 媛앹껜 �깮�꽦");
	}

	@RequestMapping(value = "adminOrderList.do")
	public String adminOrderList(OrderVO orderVO, Model model) {
		System.out.println("===> adminOrderList.do �떎�뻾");

		model.addAttribute("orderList", orderService.getOrderList(orderVO));

		return "adminOrderList.jsp";
	}

	@RequestMapping(value = "adminConfirmList.do")
	public String adminConfirmList(OrderVO orderVO, Model model) {
		System.out.println("===> adminConfirmList.do �떎�뻾");

		model.addAttribute("orderList", orderService.getConfirmList(orderVO));

		return "adminConfirmList.jsp";
	}

	@RequestMapping(value = "memberOrder.do", method = RequestMethod.GET)
	public String memberOrder(OrderVO orderVO) {
		System.out.println("===> memberOrder.do get �떎�뻾");

		return "memberOrder.jsp";
	}

	@RequestMapping(value = "memberOrder.do", method = RequestMethod.POST)
	public String memberOrderView(OrderVO orderVO) {
		System.out.println("===> memberOrder.do post �떎�뻾");
		
		// 泥�援� 湲곕뒫 異붽��빐�빞�븿
		
		return "memberOrderList.do";
	}

	@RequestMapping(value = "memberOrderList.do", method = RequestMethod.GET)
	public String memberOrderList(MemberVO memberVO, HttpSession session, Model model) {
		System.out.println("===> memberOrderList.do �떎�뻾");
		memberVO.setMember_id((String) session.getAttribute("member_id"));
		model.addAttribute("memberOrderList", orderService.getMemberOrderList(memberVO));
		
		return "memberOrderList.jsp";
	}
	
}
