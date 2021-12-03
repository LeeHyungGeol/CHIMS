package com.chims.biz.product;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chims.biz.vo.MemberVO;
import com.chims.biz.vo.ProductVO;

@Repository
public class ProductDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	
	public ProductDAO() {
		System.out.println("===> ProductDAO 媛앹껜 �깮�꽦");
	}
	
	public void insertProduct(ProductVO vo){
		System.out.println("===> Mybatis濡� insertProduct() 湲곕뒫 泥섎━");
		mybatis.insert("ProductDAO.insertProduct", vo);
	}
	
	public void updateProduct(ProductVO vo){
		System.out.println("===> Mybatis濡� updateProduct() 湲곕뒫 泥섎━");
		mybatis.update("ProductDAO.updateProduct", vo);
		
	}
	
	public void deleteProduct(ProductVO vo){
		System.out.println("===> Mybatis濡� deleteProduct() 湲곕뒫 泥섎━" + vo.toString());
		mybatis.delete("ProductDAO.deleteProduct", vo);
	}
	
	public ProductVO getProduct(ProductVO vo){
		System.out.println("===> Mybatis濡� getProduct() 湲곕뒫 泥섎━");
		return (ProductVO)mybatis.selectOne("ProductDAO.getProduct",vo);
	}
	
	/*public List<ProductVO> getProductList(ProductVO vo){
		System.out.println("===> Mybatis濡� getProductList() 湲곕뒫 泥섎━");
		return mybatis.selectList("ProductDAO.getProductList", vo);
	}*/
	
	public List<ProductVO> getAdminProductList(MemberVO vo){
		System.out.println("===> Mybatis濡� getAdminProductList() 湲곕뒫 泥섎━");
		return mybatis.selectList("ProductDAO.getAdminProductList", vo);
	}
	public List<ProductVO> getMemberProductList(MemberVO vo){
		System.out.println("===> Mybatis濡� getMemberProductList() 湲곕뒫 泥섎━");
		return mybatis.selectList("ProductDAO.getMemberProductList", vo);
	}

}
