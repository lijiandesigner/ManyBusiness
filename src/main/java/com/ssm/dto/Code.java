package com.ssm.dto;

public class Code {
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode_name() {
		return code_name;
	}
	public void setCode_name(String code_name) {
		this.code_name = code_name;
	}
	public String getCode_pic() {
		return code_pic;
	}
	public void setCode_pic(String code_pic) {
		this.code_pic = code_pic;
	}
	public String getCode_zh() {
		return code_zh;
	}
	public void setCode_zh(String code_zh) {
		this.code_zh = code_zh;
	}
	private String code_name;
	private String code_pic;
	private String code_zh;
	

}
