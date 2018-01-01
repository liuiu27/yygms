package com.fz.common.enums;

public enum ErrorEnum {
	
		// 参数校验错误可自行定义, 0 开头
		/*0 :参数名称 ，1参数字段名*/
		PARAM_CHECK_NOTPASS("0001","{0}{1}校验不通过,请重新输入"),
		PARAM_CHECK_NOTEMPTY("0002","{0}{1}为空,请输入"),
		// 系统错误可自行定义, 1 开头
		
		// 业务错误，2开头
		//登录
		LOGIN_NOTUSER("2001","用户名或密码错误"),
		
		// db数据库业务操作错误, 3开头
		
	;
	
	private String code;

	private String defaultMessage;

	ErrorEnum(String code, String defaultMessage) {
		this.code = code;
		this.defaultMessage = defaultMessage;
	}

	public String getErrorCode() {
		return this.code;
	}

	public String getDefaultMessage() {
		return defaultMessage;
	}

}
