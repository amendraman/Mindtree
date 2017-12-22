package com.gdg.DAOImplementation;

import java.util.ArrayList;
import java.util.List;

import com.gdg.rocky.DAOOrchardInterface.OrchardDAOInterface;
import com.gdg.rocky.Util.HibernateUtil;
import com.gdg.rocky.pojoClasses.OrchardSignIn;

public class OrchardDAOImplmplementation implements OrchardDAOInterface {

	/*@SuppressWarnings("unchecked")
    @Override
    public List<OrchardSignIn> getAllOrchardMembers(String orchardMemberName) 
	{ 
        String query = "SELECT e.* FROM OrchardSignIn e WHERE e.name like '%"+ orchardMemberName +"%'";
        List<Object[]> orchardObjects = hibernateUtil.fetchAll(query);
        List<OrchardSignIn> orchards = new ArrayList<OrchardSignIn>();
        for(Object[] orchardObject : orchardObjects) 
        {
            OrchardSignIn orchard = new OrchardSignIn();
            String mid = ((String)orchardObject[0]).toString();         
            String email = (String) orchardObject[1];
            int phone = (int) orchardObject[2];
            float salary = (float) orchardObject[3];
            orchard.setMid(mid);
            orchard.setName(name);
            orchard.setAge(age);
            orchard.setSalary(salary);
            orchard.add(employee);
        }
        System.out.println(employees);
        return employees;
    }*/
	
    private HibernateUtil hibernateUtil;

	@Override
	public long createOrchardInfo(OrchardSignIn orch) {
		// TODO Auto-generated method stub
		
		
		return (Long) hibernateUtil.create(orch);
	}

	@Override
	public OrchardSignIn updateOrchardInfo(OrchardSignIn orch) {
		// TODO Auto-generated method stub
		return hibernateUtil.update(orch);
	}

	@Override
	public void deleteOrchard(String mid) {
		// TODO Auto-generated method stub
		OrchardSignIn orch = new OrchardSignIn();
		orch.setMid(mid);
		hibernateUtil.delete(orch);
		
	}

	@Override
	public List<OrchardSignIn> getAllOrchardMemberDetails() {
		// TODO Auto-generated method stub
		
		
		return hibernateUtil.fetchAll(OrchardSignIn.class);
	}

	@Override
	public OrchardSignIn getOrchardMember(String mid) {
		// TODO Auto-generated method stub
		return hibernateUtil.fetchById(mid, OrchardSignIn.class);
	}

}
