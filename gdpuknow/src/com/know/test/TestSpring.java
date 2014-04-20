package com.know.test;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.know.model.User;

public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext actx = new ClassPathXmlApplicationContext("applicationContext.xml");
		User u = (User) actx.getBean("user");
		System.out.println(u.getId());
		System.out.println(u.getEmail());
		System.out.println(u.getName());
		//≤‚ ‘spring ok
		
		SessionFactory sf = (SessionFactory) actx.getBean("sf");
		sf.openSession().save(u);
		//≤‚ ‘ hibernate ok
		
		
	}
}
