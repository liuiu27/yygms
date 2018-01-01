package com.fz.common.exception;

import java.text.MessageFormat;

import org.springframework.util.StringUtils;

import com.fz.common.enums.ErrorEnum;

public class BizException extends RuntimeException{
	
private static final long serialVersionUID = 7946023196149777499L;
	
	protected ErrorEnum errorCode;
	
	protected String realCode;
	
	protected String errorMsg;
	
	protected String[] arguments;


	public ErrorEnum getErrorCode() {
		return errorCode;
	}
	


	public BizException(ErrorEnum ErrorEnum, String... arguments) {
		super();
		this.errorCode = ErrorEnum;
		this.realCode = ErrorEnum.getErrorCode();
		this.arguments =arguments;
	}
	public BizException(ErrorEnum errorCode, Throwable cause) {
		super(cause);
		this.errorCode = errorCode;
		this.realCode = errorCode.getErrorCode();
	}
	@Override
	public String getMessage() {
		
		String notMessage = "not error, not message";
		String defaultMessage = "";
		
		if(!StringUtils.isEmpty(errorMsg)){
			defaultMessage = errorMsg;
		}else{
			if (errorCode != null ) {
				defaultMessage = errorCode.getDefaultMessage();
			}
		}		
		if (StringUtils.isEmpty(defaultMessage)) {
			return notMessage;
		}
		return MessageFormat.format(defaultMessage, this.arguments);
	}
	
/*	public String getRealCode() {
		return realCode;
	}*/

	
	

}
