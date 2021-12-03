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
		System.out.println("===> OrderController 객체 생성");
	}

	@RequestMapping(value = "adminOrderList.do")
	public String adminOrderList(OrderVO orderVO, Model model) {
		System.out.println("===> adminOrderList.do 실행");

		model.addAttribute("orderList", orderService.getOrderList(orderVO));

		return "adminOrderList.jsp";
	}

	@RequestMapping(value = "adminConfirmList.do")
	public String adminConfirmList(OrderVO orderVO, Model model) {
		System.out.println("===> adminConfirmList.do 실행");

		model.addAttribute("orderList", orderService.getConfirmList(orderVO));

		return "adminConfirmList.jsp";
	}

	@RequestMapping(value = "memberOrder.do", method = RequestMethod.GET)
	public String memberOrder(OrderVO orderVO) {
		System.out.println("===> memberOrder.do get 실행");

		return "memberOrder.jsp";
	}

	@RequestMapping(value = "memberOrder.do", method = RequestMethod.POST)
	public String memberOrderView(OrderVO orderVO) {
		System.out.println("===> memberOrder.do post 실행");

		// 청구 기능 추가해야함

		return "memberOrderList.do";
	}

	@RequestMapping(value = "memberOrderList.do", method = RequestMethod.GET)
	public String memberOrderList(MemberVO memberVO, HttpSession session, Model model) {
		System.out.println("===> memberOrderList.do 실행");
		memberVO.setMember_id((String) session.getAttribute("member_id"));
		model.addAttribute("memberOrderList", orderService.getMemberOrderList(memberVO));

		return "memberOrderList.jsp";
	}

	@RequestMapping(value = "adminOrderDetail.do", method = RequestMethod.GET)
	public String adminOrderDetail(OrderVO orderVO, HttpSession session, Model model) {
		System.out.println("===> adminOrderDetail.do  get 실행");

		model.addAttribute("adminOrderDetail", orderService.getOrderDetail(orderVO));

		return "adminOrderDetail.jsp";
	}

	@RequestMapping(value = "memberOrderDetail.do", method = RequestMethod.GET)
	public String memberOrderDetail(OrderVO orderVO, HttpSession session, Model model) {
		System.out.println("===> memberOrderDetail.do  get 실행");

		model.addAttribute("memberOrderDetail", orderService.getOrderDetail(orderVO));

		return "memberOrderDetail.jsp";
	}

}