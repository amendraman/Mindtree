package com.gdg.rocky.dao;

import java.util.List;

import com.gdg.rocky.pojo.Leads;


public interface LeadDao {
	
	public void addLead(Leads l);
	public void updateLead(Leads l);
	public void removeLead(int lid);
	public List<Leads> listLeads();
	public Leads getLeadById(int lsid);

}
