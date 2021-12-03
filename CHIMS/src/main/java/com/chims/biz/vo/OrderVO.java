package com.chims.biz.vo;

import java.util.Date;

public class OrderVO {

	private int order_no;
	private Date order_date;
	private Date order_confirm_date;
	private String order_status;
	private String order_opinion;
	private String member_id;

	public OrderVO() {
		System.out.println("===> OrderVO 媛앹껜�깮�꽦");
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

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public String getOrder_opinion() {
		return order_opinion;
	}

	public void setOrder_opinion(String order_opinion) {
		this.order_opinion = order_opinion;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	@Override
	public String toString() {
		return "OrderVO [order_no=" + order_no + ", order_date=" + order_date + ", order_confirm_date="
				+ order_confirm_date + ", order_status=" + order_status + ", order_opinion=" + order_opinion
				+ ", member_id=" + member_id + "]";
	}

	public Date getOrder_confirm_date() {
		return order_confirm_date;
	}

	public void setOrder_confirm_date(Date order_confirm_date) {
		this.order_confirm_date = order_confirm_date;
	}

}
