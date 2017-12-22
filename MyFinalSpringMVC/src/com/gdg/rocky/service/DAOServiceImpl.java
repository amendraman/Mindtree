package com.gdg.rocky.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdg.rocky.SpringMVCHibernate.AllClass;
import com.gdg.rocky.SpringMVCHibernate.DAOClass;
import com.gdg.rocky.pojo.Lead;
import com.gdg.rocky.pojo.Minds;
import com.gdg.rocky.pojo.Track;

@Service
public class DAOServiceImpl implements DAOService {

	@Autowired
	private DAOClass daoClass;

	@Override
	public void insertMinds(AllClass a) {
		daoClass.insertMinds(a.getTrackname(), a.getLeadname(), a.getMindname(), a.getTrackid(), a.getMindid(), a.getLeadid());
		
	}

	@Override
	public List<Minds> retrieveDeatils() {
		return this.daoClass.retrieveDeatils();
	}

	@Override
	public Lead getLeadById(AllClass a) {
		Lead l;
		l = daoClass.getLeadById(a.getLeadid());
		System.out.println(l.getLid() + " " + l.getLname());
		return l;
	}

	@Override
	public List<Lead> getAllLead() {
		return this.daoClass.getAllLead();
	}

	@Override
	public List<Minds> getAllMinds() {
		return this.daoClass.getAllMinds();
	}

	@Override
	public List<Track> getAllTracks() {
		return this.daoClass.getAllTracks();
	}

	
}
