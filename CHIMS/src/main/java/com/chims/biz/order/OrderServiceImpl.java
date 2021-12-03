package com.chims.biz.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chims.biz.vo.MemberVO;
import com.chims.biz.vo.OrderVO;

@Service("orderService")
public class OrderServiceImpl {

	@Autowired
	private OrderDAO orderDAO;

	public OrderServiceImpl() {
		System.out.println("===> OrderService 媛앹껜 �깮�꽦");
	}

	public List<OrderVO> getOrderList(OrderVO orderVO) {
		System.out.println("===> orderService getOrderList �샇異�");
		return orderDAO.getOrderList(orderVO);
	}

	public List<OrderVO> getConfirmList(OrderVO orderVO) {
		System.out.println("===> orderService getConfirmList �샇異�");
		return orderDAO.getConfirmList(orderVO);
	}

	public List<OrderVO> getMemberOrderList(MemberVO memberVO) {
		System.out.println("==> orderServic getMemberOrderList �샇異�");
		return orderDAO.getMemberOrderList(memberVO);
	}

}
