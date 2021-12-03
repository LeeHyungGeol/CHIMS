package com.chims.view.product;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.chims.biz.product.ProductServiceImpl;
import com.chims.biz.vo.MemberVO;
import com.chims.biz.vo.ProductVO;

@Controller
@SessionAttributes("product")
public class ProductController {
	@Autowired
	private ProductServiceImpl productService;

	public ProductController() {
		System.out.println("===> ProductController 객체 생성");
	}

	@RequestMapping(value = "/adminMain.do")
	public String adminProductList(MemberVO memberVO, ProductVO productVO, Model model) {
		System.out.println("===> 어드민 메인페이지 모든 제품 목록 출력");
		System.out.println("adminMain ===> model" + model.toString());
		System.out.println("adminMain ===> memberVO" + memberVO.toString());
		model.addAttribute("productList", productService.getAdminProductList(memberVO));
		return "adminMain.jsp";
	}

	@RequestMapping(value = "/memberMain.do", method = RequestMethod.POST)
	public String memberProductList(MemberVO memberVO, ProductVO productVO, Model model) {
		System.out.println("===> 멤버 메인페이지 멤버부서 제품 목록 출력 post");
		System.out.println("memberMain ===> " + model.toString());
		model.addAttribute("productList", productService.getMemberProductList(memberVO));
		List<ProductVO> list = productService.getMemberProductList(memberVO);
		for (ProductVO vo : list) {
			System.out.println("vo : " + vo);
		}

		return "memberMain.jsp";
	}

	@RequestMapping(value = "/memberMain.do", method = RequestMethod.GET)
	public String memberProductList(MemberVO memberVO, ProductVO productVO, Model model, HttpSession session) {
		System.out.println("===> 멤버 메인페이지 멤버부서 제품 목록 출력 get");
		System.out.println("memberMain ===> " + model.toString());
		System.out.println(session.getAttribute("member_id"));
		memberVO.setMember_id((String) session.getAttribute("member_id"));
		model.addAttribute("productList", productService.getMemberProductList(memberVO));
		return "memberMain.jsp";
	}

	@RequestMapping(value = "/memberProductInsert.do", method = RequestMethod.GET)
	public String memberProductInsertView(ProductVO productVO) {
		System.out.println("===> ProductController memberProductInsert() 제품 추가");

		return "memberProductInsert.jsp";
	}

	@RequestMapping(value = "/memberProductInsert.do", method = RequestMethod.POST)
	public String memberProductInsert(ProductVO productVO) {
		System.out.println("===> ProductController memberProductInsert() 제품 추가");

		return "memberMain.do";
	}

	@RequestMapping(value = "/memberProductUpdate.do", method = RequestMethod.GET)
	public String memberProductUpdateView(ProductVO productVO) {
		System.out.println("===> ProductController memberProductUpdate() get 제품 수정");

		return "memberProductUpdate.jsp";
	}

	@RequestMapping(value = "/memberProductUpdate.do", method = RequestMethod.POST)
	public String memberProductUpdate(ProductVO productVO, Model model) {
		System.out.println("===> ProductController memberProductUpdate() post 제품 수정");

		productService.updateProduct(productVO);

		return "memberMain.do";
	}

	@RequestMapping(value = "/memberProductDelete.do", method = RequestMethod.GET)
	public String memberProductDelete(ProductVO productVO) {
		System.out.println("===> ProductController memberProductDelete() 제품 삭제");

		return "memberMain.do";
	}

	@RequestMapping(value = "/adminProductInsert.do", method = RequestMethod.GET)
	public String adminProductInsertView(ProductVO productVO, Model model) {
		System.out.println("===> ProductController adminProductInsert() get 제품 추가");
		return "adminProductInsert.jsp";
	}

	@RequestMapping(value = "/adminProductInsert.do", method = RequestMethod.POST)
	public String adminProductInsert(ProductVO productVO, Model model) {
		System.out.println("===> ProductController adminProductInsert() post 제품 추가");

		productService.insertProduct(productVO);

		return "adminMain.do";
	}

	@RequestMapping(value = "/adminProductUpdate.do", method = RequestMethod.GET)
	public String adminProductUpdateView(ProductVO productVO, Model model) {
		System.out.println("===> ProductController adminProductUpdate() get 제품 수정");

		model.addAttribute("product", productService.getProduct(productVO));

		return "adminProductUpdate.jsp";
	}

	@RequestMapping(value = "/adminProductUpdate.do", method = RequestMethod.POST)
	public String adminProductUpdate(ProductVO productVO) {
		System.out.println("===> ProductController adminProductUpdate() post 제품 수정");

		productService.updateProduct(productVO);

		return "adminMain.do";
	}

	@RequestMapping(value = "/adminProductDelete.do", method = RequestMethod.GET)
	public String adminProductDelete(ProductVO productVO) {
		System.out.println("===> ProductController adminProductDelete() get 제품 삭제");

		productService.deleteProduct(productVO);

		return "adminMain.do";
	}

}
