package com.gdg.rocky.SpringMVCHibernate;

import java.util.List;

import com.gdg.rocky.pojo.Lead;
import com.gdg.rocky.pojo.Minds;
import com.gdg.rocky.pojo.Track;

public interface DAOClass {

	public void insertMinds(String z, String x, String c, int q, int w, int e);
	public List<Minds> retrieveDeatils();
	public void updateDetails(int id, String name);
	public Lead getLeadById(int i);
	public List<Lead> getAllLead();
	public List<Minds> getAllMinds();
	public List<Track> getAllTracks();
	
}
