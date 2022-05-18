package com.controller;

public class DeleteOfficeException extends RuntimeException {
	
	private String adminemailId;
	public DeleteOfficeException(String adminemailId)
	{
		super("adminemailId"+adminemailId+"not found");
		this.adminemailId=adminemailId;
	}
	@Override
	public String toString() {
		return "DeleteOfficeException [adminemailId=" + adminemailId + "]"+"not avilable";
	}
	
	

}