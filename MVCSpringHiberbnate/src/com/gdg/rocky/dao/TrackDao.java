package com.gdg.rocky.dao;

import java.util.List;

import com.gdg.rocky.pojo.CampusMinds;
import com.gdg.rocky.pojo.Track;

public interface TrackDao {
	
	public void addTrack(Track t);
	public void updateTrack(Track t);
	public void removeTrack(int tid);
	public List<CampusMinds> listCampusMinds();
	public CampusMinds getCampusMindById(int mid);

}
