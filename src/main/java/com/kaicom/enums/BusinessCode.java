package com.kaicom.enums;

public enum BusinessCode {
	YEWU_EXECEPTION(-1,"业务异常");
	private Integer key ;
	private String value ;
	private BusinessCode(Integer key, String value) {
		this.key = key;
		this.value = value;
	}
	public Integer getKey() {
		return key;
	}
	public void setKey(Integer key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
