package com.SpringBootMVC.demo.services.exceptions;

public class UserNotFoundException extends Throwable{
	private static final long serialVersionUID = 1L;
	
	public UserNotFoundException(String msg) {
		super(msg);
	}
	
	public UserNotFoundException(String msg , Throwable cause) {
		super(msg, cause);
	}

}
