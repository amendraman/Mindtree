package com.gdg.rocky.dao;

import java.util.List;

import com.gdg.rocky.pojo.CampusMinds;

public interface CampusMindDao {
	
	public void addCampusMind(CampusMinds cm);
	public void updateCampusMind(CampusMinds cm);
	public void removeCampusMind(int mid);
	public List<CampusMinds> listCampusMinds();
	public CampusMinds getCampusMindById(int mid);
}
