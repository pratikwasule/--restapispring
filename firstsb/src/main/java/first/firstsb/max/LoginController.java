package first.firstsb.max;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
 
	
	 @Autowired
	 LoginBean loginBean;
	 @Autowired
	 LoginDAO loginDAO;
	 
     @Autowired
	 RegBean regBean;
	 
	// @GetMapping("/")
	@RequestMapping(value = "open", method =RequestMethod.GET)
	public ModelAndView openJSP()
  {
	return new ModelAndView("login","ok",loginBean);
	  
  }
	  @RequestMapping(value ="open", method = RequestMethod.POST)
	  public String getDetails(@ModelAttribute("ok")LoginBean loginBean,ModelMap m)
	  {
		//System.out.println(loginBean.getUid()+ "   "+loginBean.getPass());
		if(!loginBean.getUid().equalsIgnoreCase(loginBean.getPass()))
		{
			m.addAttribute("p", regBean);
		return "reg";
	    }
		else
		{
			return "E";
		}
	  }
	  @ModelAttribute("lst")
	  public List<StateBean> getStateList()
	  {
		  return loginDAO.getStateList( );
	  }
}
