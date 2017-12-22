package com.gdg.rocky.DAOOrchardInterface;

import java.util.List;

import com.gdg.rocky.pojoClasses.OrchardSignIn;

public interface OrchardDAOInterface {
	
	public long createOrchardInfo(OrchardSignIn orch);
	
	public OrchardSignIn updateOrchardInfo(OrchardSignIn orch);
	
	public void deleteOrchard(String mid);
	
	public List<OrchardSignIn> getAllOrchardMemberDetails();
	
	public OrchardSignIn getOrchardMember(String mid);
	
	

}
