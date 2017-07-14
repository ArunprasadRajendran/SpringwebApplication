package acs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;
@Controller
public class Cntrlr {
	@Autowired
	Dbimpl impl;

	
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)  
    public ModelAndView view(@ModelAttribute("login") User user)
    {
		
		ModelAndView m=new ModelAndView();
		if(user.getPassword().equals("acs") && user.getUsername().equals("fss"))
   	  {
   		  m.setViewName("view");
   	  }
         else
         {
       	  m.setViewName("login");
       	  m.addObject("message","loginerror");
         }
    	 return m;
    }
	@RequestMapping(value="/login",method=RequestMethod.GET)	
	public ModelAndView login()
	{
	
		return new ModelAndView("login","msg","pavithran");	
	}
@RequestMapping(value="create",method=RequestMethod.GET)	
public ModelAndView create()
{
return new ModelAndView("create");	
}

@RequestMapping(value="update",method=RequestMethod.GET)	
public ModelAndView update()
{
return new ModelAndView("update");	
}
@RequestMapping(value="delete",method=RequestMethod.GET)	
public ModelAndView delete()
{
return new ModelAndView("delete");	
}
@RequestMapping(value="view1",method=RequestMethod.GET)	
public ModelAndView view1()
{
return new ModelAndView("view1");	
}
@RequestMapping(value = "/save", method = RequestMethod.POST)  
public ModelAndView save(@ModelAttribute("create")User1 user1)
{
ModelAndView m=new ModelAndView("create");
m.addObject("msg", "informations are stored");
impl.insert(user1);
return m;

}
@RequestMapping(value = "/delete", method = RequestMethod.POST)  
public ModelAndView delete(@ModelAttribute("delete")User1 user1)
{
	ModelAndView m=new ModelAndView("delete");
	m.addObject("msg", "informations are deleted");
	impl.delete(user1);
	return m;
}
@RequestMapping(value = "/pavi", method = RequestMethod.POST)  
public ModelAndView view(@ModelAttribute("view1")User1 user1)
{
ModelAndView m=new ModelAndView("view1");
LinkedHashMap b=new LinkedHashMap();
b=impl.view(user1);
m.addObject("map", b);
return m;
}

@RequestMapping(value="radio", method = RequestMethod.GET)  
public ModelAndView radio()
{
	return new ModelAndView("radio");
	}
@RequestMapping(value ="name", method = RequestMethod.GET)  
public ModelAndView name()
{
	return new ModelAndView("name");
	}
@RequestMapping(value ="age", method = RequestMethod.GET)  
public ModelAndView age()
{
	return new ModelAndView("age");
	}
@RequestMapping(value ="phoneno", method = RequestMethod.GET)  
public ModelAndView phone()
{
	return new ModelAndView("phoneno");
	}
@RequestMapping(value ="mail", method = RequestMethod.GET)  
public ModelAndView mail()
{
	return new ModelAndView("mail");
	}
@RequestMapping(value ="name1", method = RequestMethod.POST)  
public ModelAndView name1(@ModelAttribute("name")User1 user1)
{ 
   impl.update_name(user1);
	return new ModelAndView("name","msg","name_is_updated");
	}

@RequestMapping(value ="age1", method = RequestMethod.POST)  
public ModelAndView age1(@ModelAttribute("age")User1 user1)
{ 
  impl.update_age(user1);
	return new ModelAndView("age","msg","age_is_updated");
	}
@RequestMapping(value ="phoneno1", method = RequestMethod.POST)  
public ModelAndView phoneno1(@ModelAttribute("phoneno")User1 user1)
{
impl.update_phoneno(user1);
	return new ModelAndView("name","msg","number_is_updated");
	}
@RequestMapping(value ="mail1", method = RequestMethod.POST)  
public ModelAndView mail1(@ModelAttribute("mail")User1 user1)
{
	
   impl.update_mail(user1);
	return new ModelAndView("name","msg","mail_is_updated");
	}


}








