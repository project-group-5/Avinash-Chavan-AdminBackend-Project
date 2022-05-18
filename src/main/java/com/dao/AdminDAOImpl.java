package com.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Admin;
@Component
public class AdminDAOImpl implements AdminDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(admin);
		session.flush();
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public Admin findAdmin(String adminName) {
		Session session=sessionFactory.openSession();
		Admin admin=session.find(Admin.class,adminName);
		
		return  admin;
	}

	@Override
	public boolean updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(admin);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	
	}

	@Override
	public boolean deleteAdmin(String adminName) {
		Session session=sessionFactory.openSession();
		Admin admin=session.find(Admin.class, adminName);
		session.getTransaction().begin();
		session.delete(admin);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
		return true;
	}

}