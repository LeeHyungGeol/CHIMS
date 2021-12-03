package com.chims.biz.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chims.biz.vo.MemberVO;
import com.chims.biz.vo.ProductVO;

@Service("productService")
public class ProductServiceImpl {

	@Autowired
	private ProductDAO productDAO;

	public ProductServiceImpl() {
	}

	public void insertProduct(ProductVO vo) {
		this.productDAO.insertProduct(vo);
	}

	public void updateProduct(ProductVO vo) {
		this.productDAO.updateProduct(vo);
	}

	public void deleteProduct(ProductVO vo) {
		this.productDAO.deleteProduct(vo);
	}

	public ProductVO getProduct(ProductVO vo) {
		return productDAO.getProduct(vo);
	}

	public List<ProductVO> getAdminProductList(MemberVO vo) {
		return productDAO.getAdminProductList(vo);
	}

	public List<ProductVO> getMemberProductList(MemberVO vo) {
		return productDAO.getMemberProductList(vo);
	}

}
