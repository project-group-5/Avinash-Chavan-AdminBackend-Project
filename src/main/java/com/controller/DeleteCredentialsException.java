package com.controller;

public class DeleteCredentialsException extends RuntimeException{
	
	private String adminName;
	public DeleteCredentialsException(String adminName)
	{
		super("adminName"+adminName+"not found");
		this.adminName=adminName;
		
	}
	@Override
	public String toString() {
		return "DeleteCredentialsException [adminName=" + adminName + "]";
	}
	
}