package com.gdg.rocky.Controller;


import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gdg.rocky.entity.Orchard;
import com.gdg.rocky.service.OrchardService;

@Controller
public class OrchardController {
	
	 private static final Logger logger = Logger.getLogger(OrchardController.class);
	 
	 @Autowired
	    private OrchardService orchardService;

	    @RequestMapping("createEmployee")
	    public ModelAndView createEmployee(@ModelAttribute Orchard orchard) {
	        logger.info("Creating Orchard. Data: "+orchard);
	        return new ModelAndView("orchardForm");
	    }
	    
	    @RequestMapping("editOrchard")
	    public ModelAndView editOrchard(@RequestParam long mid, @ModelAttribute Orchard orchard) {
	        logger.info("Updating the Orchard for the Id "+ mid);
	        orchard = orchardService.getOrchard(mid);
	        return new ModelAndView("orchardForm", "orchardObject", orchard);
	    }
	    
	    @RequestMapping("saveOrchard")
	    public ModelAndView saveOrchard(@ModelAttribute Orchard orchard) {
	        logger.info("Saving the Orchard. Data : "+orchard);
	        if(orchard.getMid() == 0){ // if employee id is 0 then creating the employee other updating the employee
	            orchardService.createOrchard(orchard);
	        } else {
	            orchardService.updateOrchard(orchard);
	        }
	        return new ModelAndView("redirect:getAllOrhards");
	    }
	    
	    @RequestMapping("deleteOrchard")
	    public ModelAndView deleteOrchard(@RequestParam long mid) {
	        logger.info("Deleting the Orchard. Id : "+ mid);
	        orchardService.deleteOrchard(mid);
	        return new ModelAndView("redirect:getAllOrhards");
	    }
	    
	    @RequestMapping(value = {"getAllOrchards", "/"})
	    public ModelAndView getAllOrchards() {
	        logger.info("Getting the all Orchards.");
	        List<Orchard> orchardList = orchardService.getAllOrchards();
	        return new ModelAndView("orchardList", "orchardList", orchardList);
	    }
	    
	   /* @RequestMapping("searchEmployee")
	    public ModelAndView searchEmployee(@RequestParam("searchName") String searchName) {  
	        logger.info("Searching the Employee. Employee Names: "+searchName);
	        List<Employee> employeeList = employeeService.getAllEmployees(searchName);
	        return new ModelAndView("employeeList", "employeeList", employeeList);      
	    }
*/
}
