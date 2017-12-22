package com.gdg.rocky.service;

import java.util.List;

import com.gdg.rocky.SpringMVCHibernate.AllClass;
import com.gdg.rocky.pojo.Lead;
import com.gdg.rocky.pojo.Minds;
import com.gdg.rocky.pojo.Track;

public interface DAOService {
	
	public void insertMinds(AllClass a);
	public List<Minds> retrieveDeatils();
//	public void updateDetails(int id, String name);
	public Lead getLeadById(AllClass a);
	public List<Lead> getAllLead();
	public List<Minds> getAllMinds();
	public List<Track> getAllTracks();

}
