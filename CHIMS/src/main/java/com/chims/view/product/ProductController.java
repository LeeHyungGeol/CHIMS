package com.chims.view.product;

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
		System.out.println("===> ProductController 媛앹껜 �깮�꽦");
	}

	@RequestMapping(value = "/adminMain.do")
	public String adminProductList(MemberVO memberVO, ProductVO productVO, Model model) {
		System.out.println("===> �뼱�뱶誘� 硫붿씤�럹�씠吏� 紐⑤뱺 �젣�뭹 紐⑸줉 異쒕젰");
		System.out.println("adminMain ===> model" + model.toString());
		System.out.println("adminMain ===> memberVO" + memberVO.toString());
		model.addAttribute("productList", productService.getAdminProductList(memberVO));
		return "adminMain.jsp";
	}

	@RequestMapping(value = "/memberMain.do", method = RequestMethod.POST)
	public String memberProductList(MemberVO memberVO, ProductVO productVO, Model model) {
		System.out.println("===> 硫ㅻ쾭 硫붿씤�럹�씠吏� 硫ㅻ쾭遺��꽌 �젣�뭹 紐⑸줉 異쒕젰 post");
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
		System.out.println("===> 硫ㅻ쾭 硫붿씤�럹�씠吏� 硫ㅻ쾭遺��꽌 �젣�뭹 紐⑸줉 異쒕젰 get");
		System.out.println("memberMain ===> " + model.toString());
		System.out.println(session.getAttribute("member_id"));
		memberVO.setMember_id((String) session.getAttribute("member_id"));
		model.addAttribute("productList", productService.getMemberProductList(memberVO));

		return "memberMain.jsp";
	}

	@RequestMapping(value = "/memberProductInsert.do", method = RequestMethod.GET)
	public String memberProductInsertView(ProductVO productVO) {
		System.out.println("===> ProductController memberProductInsert() �젣�뭹 異붽�");

		return "memberProductInsert.jsp";
	}

	@RequestMapping(value = "/memberProductInsert.do", method = RequestMethod.POST)
	public String memberProductInsert(ProductVO productVO) {
		System.out.println("===> ProductController memberProductInsert() �젣�뭹 異붽�");

		return "memberMain.do";
	}

	@RequestMapping(value = "/memberProductUpdate.do", method = RequestMethod.GET)
	public String memberProductUpdateView(ProductVO productVO) {
		System.out.println("===> ProductController memberProductUpdate() get �젣�뭹 �닔�젙");

		return "memberProductUpdate.jsp";
	}

	@RequestMapping(value = "/memberProductUpdate.do", method = RequestMethod.POST)
	public String memberProductUpdate(ProductVO productVO) {
		System.out.println("===> ProductController memberProductUpdate() post �젣�뭹 �닔�젙");

		return "memberMain.do";
	}

	@RequestMapping(value = "/memberProductDelete.do", method = RequestMethod.GET)
	public String memberProductDelete(ProductVO productVO) {
		System.out.println("===> ProductController memberProductDelete() �젣�뭹 �궘�젣");

		return "memberMain.do";
	}

	@RequestMapping(value = "/adminProductInsert.do", method = RequestMethod.GET)
	public String adminProductInsert(ProductVO productVO) {
		System.out.println("===> ProductController adminProductInsert() get �젣�뭹 異붽�");

		return "adminProductInsert.jsp";
	}

	@RequestMapping(value = "/adminProductUpdate.do", method = RequestMethod.GET)
	public String adminProductUpdateView(ProductVO productVO) {
		System.out.println("===> ProductController adminProductUpdate() get �젣�뭹 �닔�젙");

		return "adminProductUpdate.jsp";
	}

	@RequestMapping(value = "/adminProductUpdate.do", method = RequestMethod.POST)
	public String adminProductUpdate(ProductVO productVO) {
		System.out.println("===> ProductController adminProductUpdate() post �젣�뭹 �닔�젙");

		return "adminMain.do";
	}

	@RequestMapping(value = "/adminProductDelete.do", method = RequestMethod.GET)
	public String adminProductDelete(ProductVO productVO) {
		System.out.println("===> ProductController adminProductDelete() get �젣�뭹 �궘�젣");

		return "adminMain.do";
	}

}
