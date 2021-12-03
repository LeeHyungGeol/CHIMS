package com.chims.biz.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chims.biz.vo.MemberVO;
import com.chims.biz.vo.OrderDetailVO;
import com.chims.biz.vo.OrderVO;

@Service("orderService")
public class OrderServiceImpl {

	@Autowired
	private OrderDAO orderDAO;

	public OrderServiceImpl() {
		System.out.println("===> OrderService 객체 생성");
	}

	public List<OrderVO> getOrderList(OrderVO orderVO) {
		System.out.println("===> orderService getOrderList 호출");
		return orderDAO.getOrderList(orderVO);
	}

	public List<OrderVO> getConfirmList(OrderVO orderVO) {
		System.out.println("===> orderService getConfirmList 호출");
		return orderDAO.getConfirmList(orderVO);
	}

	public List<OrderVO> getMemberOrderList(MemberVO memberVO) {
		System.out.println("==> orderService getMemberOrderList 호출");
		return orderDAO.getMemberOrderList(memberVO);
	}

	public List<OrderDetailVO> getOrderDetail(OrderVO orderVO) {
		System.out.println("==> orderService getOrderDetail 호출");
		return orderDAO.getOrderDetail(orderVO);

	}

}
