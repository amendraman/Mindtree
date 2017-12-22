package com.gdg.rocky.SpringMVCHibernate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.gdg.rocky.pojo.Lead;
import com.gdg.rocky.pojo.Minds;
import com.gdg.rocky.pojo.Track;

@Repository
public class DAOClassImpl implements DAOClass {

	@Override
	public void insertMinds(String z, String x, String c, int q, int w, int e) {
		
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		
		Track track = new Track();
		track.setTid(q);
		track.setTname(z);
		
		session.save(track);
		
		Lead lead = new Lead();
		lead.setLid(w);
		lead.setTr(track);
		lead.setLname(x);
		
		session.save(lead);
		
		Minds m1 = new Minds();
		m1.setMid(e);
		m1.setMname(c);
		m1.setLe(lead);
		
		session.save(m1);
		session.getTransaction().commit();
		System.out.println("Inserted");
	}

	@Override
	public List<Minds> retrieveDeatils() {
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		
		List list = new ArrayList<Minds>();
		Query q3 = session.createQuery("from Minds");
		List li = q3.list();
		Iterator it = li.iterator();
		
		System.out.println("Track id is " + "\t" + "Track name " + "\t" + "Lead " + "\t" + "Mid");
		while(it.hasNext())
		{
			Minds m = (Minds) it.next();
			list.add(m);
			System.out.println(m.getMname());
		}
		session.getTransaction().commit();
		session.close();
		return list;
	}

	@Override
	public void updateDetails(int id, String name) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		
		Minds t = (Minds) session.get(Minds.class, id);
		t.setMname(name);
		session.update(t);
		
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Lead getLeadById(int i) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		
		Lead mi = new Lead();
		List<Lead> list = session.createQuery("from Lead where lid='" + i + "'").list();
		System.out.println("track id is " + list.get(0).getTr().getTid());
		return list.get(0);
	}

	@Override
	public List<Lead> getAllLead() {
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		List<Lead> li = new ArrayList<Lead>();
		 Query q = session.createQuery("from Lead");
		List list = q.list();
		Iterator i = list.iterator();
		while(i.hasNext())
		{
			Lead l = (Lead) i.next();
			li.add(l);
			System.out.println("Lead id is = " + l.getLid() + " lead Name is " + l.getLname());
		}
		
		return li;
	}

	@Override
	public List<Minds> getAllMinds() {
		
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		
		 Query q = session.createQuery("from Minds");
		List list = q.list();
		List<Minds> li = new ArrayList<Minds>();
		Iterator i = list.iterator();
		while(i.hasNext())
		{
			Minds m = (Minds) i.next();
			li.add(m);
			System.out.println("Minds  id is = " + m.getMid() + "  Mind Name is " + m.getMname());
		}
		
		return li;
	}

	@Override
	public List<Track> getAllTracks() {
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		List<Track> li = new ArrayList<Track>();
		 Query q = session.createQuery("from Track");
		List list = q.list();
		Iterator i = list.iterator();
		while(i.hasNext())
		{
			Track t = (Track) i.next();
			li.add(t);
			System.out.println("track id is = " + t.getTid() + " Track Name is " + t.getTname());
		}
		
		return list;
	}
	
	

}
