package com.chims.biz.vo;

public class ProductVO {

	private String product_code;
	private String product_category;
	private String product_name;
	private int product_cnt;
	private String product_etc;

	public ProductVO() {
		System.out.println("===> ProductVO 媛앹껜�깮�꽦");
	}

	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public String getProduct_category() {
		return product_category;
	}

	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_cnt() {
		return product_cnt;
	}

	public void setProduct_cnt(int product_cnt) {
		this.product_cnt = product_cnt;
	}

	public String getProduct_etc() {
		return product_etc;
	}

	public void setProduct_etc(String product_etc) {
		this.product_etc = product_etc;
	}

	@Override
	public String toString() {
		return "ProductVO [product_code=" + product_code + ", product_category=" + product_category + ", product_name="
				+ product_name + ", product_cnt=" + product_cnt + ", product_etc=" + product_etc + "]";
	}

}
