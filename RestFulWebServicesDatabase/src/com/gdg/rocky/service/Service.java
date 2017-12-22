package com.gdg.rocky.service;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.gdg.rocky.dao.Persondao;
import com.gdg.rocky.pojo.Person;

@Path("service")
public class Service {
	
	private Persondao personDao = new Persondao();
	

	@GET
	@Path("/getPersonByIdXML/{id}")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
	public Person getPersonByIdXML(@PathParam("id")int id)
	{
		return personDao.getPersonById(id);
	}
	
	@GET
	@Path("/getAllPersonsInXML")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Person getPersonByIdJSON(@PathParam("id")int id)
	{
		return personDao.getPersonById(id);
	}
	
	@GET
	@Path("/getPersonByIdJSON/{id}")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
	public List<Person> getAllPersonsInXML()
	{
		return personDao.getAllPersons();
	}
}
