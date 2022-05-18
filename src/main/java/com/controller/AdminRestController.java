package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.dao.AdminService;
import com.model.Admin;

@RestController
public class AdminRestController {
	
	@Autowired
	AdminService service;
	
	@PostMapping("/addcredentials")
	public ResponseEntity<?> add(@RequestBody  Admin admin) throws AddCredentialsException
	{
		if(admin==null)
		{
			throw new AddCredentialsException();
			
		}
		service.add(admin);
		return ResponseEntity.ok("credentials added");
	}
	@GetMapping("/findcredentials/{adminName}")
	public Admin find(@PathVariable  String adminName) throws FindCredentialsException
	{
		Admin admin=service.find(adminName);
		if(admin==null)
		{
			throw new FindCredentialsException();
		}
		
		return service.find(adminName);
	}
	@DeleteMapping("/deleteadmin/{adminName}")
	public ResponseEntity<?> delete(@PathVariable String adminName) throws DeleteCredentialsException
	{
		Admin admin=service.find(adminName);
		if(admin==null)
		{
			throw new DeleteOfficeException(adminName);
			
		}
		service.delete(adminName);
		return ResponseEntity.ok("details deleted successfully");
	}
	@PatchMapping("/updateadmin")
	public ResponseEntity<?> updatedetails(@RequestBody  Admin admin)throws UpdateCredentialsException
	{
		Admin admin1=service.find(admin.getAdminName());
		if(admin1==null)
		{
			throw new UpdateCredentialsException();
		}
		service.update(admin);
		return ResponseEntity.ok("updated successfully");
		
	}

}