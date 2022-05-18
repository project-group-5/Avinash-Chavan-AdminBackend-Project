package com.sample.adminProject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.AdminService;
import com.model.Admin;

@SpringBootTest
class AdminTestCase {

	@Autowired
	AdminService adminservice;
	
	@Test
	void testAdd() {
		Admin admin = new Admin();
		admin.setAdminName("Avinash");
		admin.setPassword("@123");
		admin.setAdminEmail("A@gmail.com");
		adminservice.add(admin);
		
		Admin admin_to_be_tested = adminservice.find(admin.getAdminName());
		
	}

	@Test
	void testFind() {
		Admin admin1 = new Admin();
		admin1.setAdminName("vikky");
		try
		{
			adminservice.add(admin1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		Admin admin2=adminservice.find(admin1.getAdminName());
     }

	@Test
	void testFindAll() {
		Admin admin5 = new Admin();
		admin5.setAdminName("Rahul");
		admin5.setPassword("@12345");
		admin5.setAdminEmail("R@gmail.com");
		adminservice.add(admin5);
		
		
		
	}
     		
		

	@Test
	void testUpdate() {
		Admin admin6=new Admin();
		admin6.setAdminName("Sachin");
		admin6 .setPassword("#20101");
		admin6.setAdminEmail("fss@gamil.com");
		adminservice.add(admin6);
		admin6.setAdminName("Rahul");
		
		
	}

	@Test
	void testDelete() {
		adminservice.delete("Avinash");
		Admin admin1 = adminservice.find("Avinash");

		
		
	}



}