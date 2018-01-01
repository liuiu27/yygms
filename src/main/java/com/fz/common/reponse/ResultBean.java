package com.fz.common.reponse;

import java.io.Serializable;

public class ResultBean<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 853790189533726803L;
	
	public static final String  SUCCESS ="0000";
	
	public static final String FAIL ="1111";
	
	private String msg = "success";
	
	private String code  =SUCCESS;
	
	private T data;

	
	
	public ResultBean() {
		super();
	}
	
	public ResultBean(T data) {
		super();
		this.data =data;
	}
	
	
	public ResultBean(Throwable ex) {
		super();
		 this.msg =ex.getMessage();
		 this.code =FAIL;
	}

	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public static String getSuccess() {
		return SUCCESS;
	}

	public static String getFail() {
		return FAIL;
	}

	
	
	
	
	

}
