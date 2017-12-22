package com.gdg.rocky.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gdg.rocky.pojo.Person;
import com.gdg.rocky.util.HibernateUtil;

public class Persondao {
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	//private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	
	public Person getPersonById(int id)
	{
		Person person = null;
		Session session = null;
		
		try{
			
			session = sessionFactory.openSession();
			session.beginTransaction();
			person = (Person) session.createQuery("from Person p where p.id = :ID").setParameter("ID", id).uniqueResult();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			if(session != null)
			{
				session.getTransaction().rollback();
			}
		}
		finally{
			if(session != null)
			{
				session.close();
			}
		}
		
		return person;
	}
	
	
	public List<Person> getAllPersons()
	{
		List<Person> persons = null;
		Session session = null;
		
		try{
			
			session = sessionFactory.openSession();
			session.beginTransaction();
			persons =  session.createQuery("from Person p").list();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			if(session != null)
			{
				session.getTransaction().rollback();
			}
		}
		finally{
			if(session != null)
			{
				session.close();
			}
		}
		
		return persons;
	}

}
