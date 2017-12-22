package com.gdg.rocky.SpringMVCHibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Repository;

public class HibernateUtility {
	
	private static SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory()
	{
		try{
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
								.applySettings(configuration.getProperties())
								.buildServiceRegistry();
			
			System.out.println("session factory");
			return configuration.buildSessionFactory(serviceRegistry);
		}
		catch(Throwable ex)
		{
			System.err.println("Initial session failed");
			throw new ExceptionInInitializerError();
		}
	}
	
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}

}
