package com.chims.biz.vo;

import java.util.Date;

public class OrderDetailVO {

	private int order_no;
	private Date order_date;
	private String product_code;
	private String product_name;
	private String dept_no;
	private String order_product_cnt;
	private String order_member_id;
	private String order_member_name;

	public OrderDetailVO() {
		System.out.println("===> OrderDetailVO °´Ã¼ »ý¼º");
	}

	public int getOrder_no() {
		return order_no;
	}

	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getDept_no() {
		return dept_no;
	}

	public void setDept_no(String dept_no) {
		this.dept_no = dept_no;
	}

	public String getOrder_product_cnt() {
		return order_product_cnt;
	}

	public void setOrder_product_cnt(String order_product_cnt) {
		this.order_product_cnt = order_product_cnt;
	}

	public String getOrder_member_id() {
		return order_member_id;
	}

	public void setOrder_member_id(String order_member_id) {
		this.order_member_id = order_member_id;
	}

	public String getOrder_member_name() {
		return order_member_name;
	}

	public void setOrder_member_name(String order_member_name) {
		this.order_member_name = order_member_name;
	}

	@Override
	public String toString() {
		return "OrderDetailVO [order_no=" + order_no + ", order_date=" + order_date + ", product_code=" + product_code
				+ ", product_name=" + product_name + ", dept_no=" + dept_no + ", order_product_cnt=" + order_product_cnt
				+ ", order_member_id=" + order_member_id + ", order_member_name=" + order_member_name + "]";
	}

}