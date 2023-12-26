package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.FOUND)
public class ResourceFoundException extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	private String resourceName;

	public ResourceFoundException(String resourceName) {
		super(String.format("User Name %s is already exits ",resourceName));
		this.resourceName = resourceName;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	@Override
	public String toString() {
		return "ResourceFoundException [resourceName=" + resourceName + "]";
	}

	public ResourceFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResourceFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ResourceFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ResourceFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}


	

	
	
	
	
}
