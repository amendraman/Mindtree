package com.gdg.rocky.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gdg.rocky.dao.OrchardDAO;
import com.gdg.rocky.entity.Orchard;
import com.gdg.rocky.service.OrchardService;

import java.util.List;

@Service
@Transactional
public class OrchardServiceImpl implements OrchardService{
	
	 @Autowired
	    private OrchardDAO orchardDAO;

	    @Override
	    public long createOrchard(Orchard orchard) {
	        return orchardDAO.createOrchard(orchard);
	    }
	    @Override
	    public Orchard updateOrchard(Orchard orchard) {
	        return orchardDAO.updateOrchard(orchard);
	    }
	    @Override
	    public void deleteOrchard(long mid) {
	        orchardDAO.deleteOrchard(mid);
	    }
	    @Override
	    public List<Orchard> getAllOrchards() {
	        return orchardDAO.getAllOrchards();
	    }
	    @Override
	    public Orchard getOrchard(long mid) {
	        return orchardDAO.getOrchard(mid);
	    }    

}
