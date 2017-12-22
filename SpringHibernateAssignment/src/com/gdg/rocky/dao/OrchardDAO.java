package com.gdg.rocky.dao;

import java.util.List;

import com.gdg.rocky.entity.Orchard;

public interface OrchardDAO {
	
	public long createOrchard(Orchard orchard);
    public Orchard updateOrchard(Orchard orchard);
    public void deleteOrchard(long mid);
    public List<Orchard> getAllOrchards();
    public Orchard getOrchard(long mid);   
   // public List<Orchard> getAllOrchards(String orchardName);

}
