package com.gdg.rocky.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gdg.rocky.SpringMVCHibernate.AllClass;
import com.gdg.rocky.pojo.Lead;
import com.gdg.rocky.pojo.Minds;
import com.gdg.rocky.pojo.Track;
import com.gdg.rocky.service.DAOService;

@Controller
public class ControllerClass {
	
	@Autowired
	private DAOService daoService;
	
	/*@RequestMapping(value= {"/minds"}, method= RequestMethod.GET)
	public String listEmployees(ModelMap model){
		List<Minds> minds = daoService.retrieveDeatils();
		model.addAttribute("minds", minds);
		return "new";
	}*/
	
	@RequestMapping(value= {"/minds"}, method= RequestMethod.GET)
	public String listMinds(ModelMap model){
		List<Minds> minds = daoService.retrieveDeatils();
		model.addAttribute("minds", minds);
		return "new";
	}
	
	@RequestMapping(value= {"/leads"}, method= RequestMethod.GET)
	public String listminds(ModelMap model){
		List<Lead> leads = daoService.getAllLead();
		model.addAttribute("inside list minds", daoService.getAllLead().get(0).getLid());
		return "leads";
	}
	
	
	@RequestMapping(value= {"/track"}, method= RequestMethod.GET)
	public String listtrack(ModelMap model){
		List<Track> track = daoService.getAllTracks();
		model.addAttribute("inside list minds", daoService.getAllLead().get(0).getLid());
		return "track";
	}
	
	@RequestMapping(value= {"/getminds"}, method= RequestMethod.GET)
	public String listmind(ModelMap model1){
		List<Minds> mind = daoService.getAllMinds();
		model1.addAttribute("xyz", mind);
		model1.addAttribute("inside list minds", daoService.getAllLead().get(0).getLid());
		return "leads";
	}
	
	@RequestMapping(value= {"/save"})
	public ModelAndView saveminds(@ModelAttribute("a") AllClass a)
	{
		System.out.println("check " + a.getLeadid());
		daoService.insertMinds(a);
		return new ModelAndView("submitted");
	}
	
	@RequestMapping(value= {"/add"})
	public ModelAndView addminds(@ModelAttribute("a") AllClass a)
	{
		
		return new ModelAndView("addminds");
	}
	
	@RequestMapping(value= {"/leadone"})
	public ModelAndView leadone(@ModelAttribute("a") AllClass a)
	{
		return new ModelAndView("leadbyid");
	}
	
	@RequestMapping(value= {"/getleadbyid"})
	public ModelAndView leadById(@ModelAttribute("a") AllClass a, ModelMap m)
	{
		Lead l = daoService.getLeadById(a);
		System.out.println("list inside mind" + a.getLeadid());
		m.addAttribute("xyz", 1);
		return new ModelAndView("leadbyidshow");
	}

}
