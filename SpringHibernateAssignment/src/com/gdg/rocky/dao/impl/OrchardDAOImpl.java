package com.gdg.rocky.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gdg.rocky.dao.OrchardDAO;
import com.gdg.rocky.entity.Orchard;
import com.gdg.rocky.util.HibernateUtil;

@Repository
public class OrchardDAOImpl implements OrchardDAO {
	
	public OrchardDAOImpl()
	{
		System.out.println("OrchardDAOImpl");
	}
	
	 @Autowired
	    private HibernateUtil hibernateUtil;

	    @Override
	    public long createOrchard(Orchard orchard) {        
	        return (Long) hibernateUtil.create(orchard);
	    }
	    
	    @Override
	    public Orchard updateOrchard(Orchard orchard) {        
	        return hibernateUtil.update(orchard);
	    }
	    
	    @Override
	    public void deleteOrchard(long mid) {
	        Orchard orchard = new Orchard();
	        orchard.setMid(mid);
	        hibernateUtil.delete(orchard);
	    }
	    
	    @Override
	    public List<Orchard> getAllOrchards() {        
	        return hibernateUtil.fetchAll(Orchard.class);
	    }
	    
	    @Override
	    public Orchard getOrchard(long mid) {
	        return hibernateUtil.fetchById(mid, Orchard.class);
	    }

	   /* @SuppressWarnings("unchecked")
	    @Override
	    public List<Orchard> getAllOrchat(String employeeName) 
	    { 
	        String query = "SELECT e.* FROM Employees e WHERE e.name like '%"+ employeeName +"%'";
	        List<Object[]> employeeObjects = hibernateUtil.fetchAll(query);
	        List<Employee> employees = new ArrayList<Employee>();
	        for(Object[] employeeObject: employeeObjects) {
	            Employee employee = new Employee();
	            long id = ((BigInteger) employeeObject[0]).longValue();         
	            int age = (int) employeeObject[1];
	            String name = (String) employeeObject[2];
	            float salary = (float) employeeObject[3];
	            employee.setId(id);
	            employee.setName(name);
	            employee.setAge(age);
	            employee.setSalary(salary);
	            employees.add(employee);
	        }
	        System.out.println(employees);
	        return employees;
	    }*/
}
