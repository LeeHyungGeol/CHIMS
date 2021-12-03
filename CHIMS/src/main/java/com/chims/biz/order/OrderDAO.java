package com.chims.biz.order;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chims.biz.vo.MemberVO;
import com.chims.biz.vo.OrderDetailVO;
import com.chims.biz.vo.OrderVO;

@Repository("orderDAO")
public class OrderDAO {

	@Autowired
	private SqlSessionTemplate mybatis;

	public OrderDAO() {
		System.out.println("===> OrderDAO 객체 생성");
	}

	public List<OrderVO> getOrderList(OrderVO orderVO) {
		System.out.println("===> Mybatis로 getOrderList() 기능 처리");
		return mybatis.selectList("OrderDAO.getOrderList", orderVO);
	}

	public List<OrderVO> getConfirmList(OrderVO orderVO) {
		System.out.println("===> Mybatis로 getConfirmList() 기능 처리");
		return mybatis.selectList("OrderDAO.getConfirmList", orderVO);
	}

	public List<OrderVO> getMemberOrderList(MemberVO memberVO) {
		System.out.println("==> MyBatis로 getMemberOrderList() 기능 처리");
		return mybatis.selectList("OrderDAO.getMemberOrderList", memberVO);
	}

	public List<OrderDetailVO> getOrderDetail(OrderVO orderVO) {
		System.out.println("==> MyBatis로 getOrderDetail() 기능 처리");
		System.out.println(orderVO.toString());
		return mybatis.selectList("OrderDAO.getOrderDetail", orderVO);
	}

}