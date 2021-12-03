package com.chims.biz.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * @description
 * member_role : "member", "admin"
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class MemberVO {

	@XmlAttribute
	private String member_id;
	private String member_pwd;
	private String member_name;
	private String member_role;
	private int dept_no;
	

	public MemberVO() {
		System.out.println("===> MemberVO 媛앹껜 �깮�꽦");
	}

	public String getMember_id() {
		return member_id;
	}


	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}


	public String getMember_pwd() {
		return member_pwd;
	}


	public void setMember_pwd(String member_pwd) {
		this.member_pwd = member_pwd;
	}


	public String getMember_name() {
		return member_name;
	}


	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}


	public String getMember_role() {
		return member_role;
	}


	public void setMember_role(String member_role) {
		this.member_role = member_role;
	}


	public int getDept_no() {
		return dept_no;
	}


	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}

	@Override
	public String toString() {
		return "MemberVO [member_id=" + member_id + ", member_pwd=" + member_pwd + ", member_name=" + member_name
				+ ", member_role=" + member_role + ", dept_no=" + dept_no + "]";
	}
	
	

}
