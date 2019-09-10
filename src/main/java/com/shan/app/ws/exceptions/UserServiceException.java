package com.shan.app.ws.exceptions;

public class UserServiceException extends RuntimeException{
	private static final long serialVersionUID = -4936200546437096222L;

	public UserServiceException(String message)
	{
		super(message);
	}
}
