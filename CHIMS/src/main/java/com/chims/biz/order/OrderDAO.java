package com.chims.biz.order;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chims.biz.vo.MemberVO;
import com.chims.biz.vo.OrderVO;


@Repository("orderDAO")
public class OrderDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;

	public OrderDAO() {
		System.out.println("===> OrderDAO 媛앹껜 �깮�꽦");
	}
	
	public List<OrderVO> getOrderList(OrderVO orderVO){
		System.out.println("===> Mybatis濡� getOrderList() 湲곕뒫 泥섎━");
		return mybatis.selectList("OrderDAO.getOrderList", orderVO);
	}
	
	public List<OrderVO> getConfirmList(OrderVO orderVO){
		System.out.println("===> Mybatis濡� getConfirmList() 湲곕뒫 泥섎━");
		return mybatis.selectList("OrderDAO.getConfirmList", orderVO);
	}
	
	public List<OrderVO> getMemberOrderList(MemberVO memberVO) {
		System.out.println("==> MyBatis濡� getMemberOrderList() 湲곕뒫 泥섎━");
		return mybatis.selectList("OrderDAO.getMemberOrderList", memberVO);
	}

}
