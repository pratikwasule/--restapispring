package first.firstsb.max;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import first.firstsb.max.Location.DistBean;
import first.firstsb.max.Location.DistrictInterface;
import first.firstsb.max.Location.RegistDTO;
import first.firstsb.max.Location.RegistServices;
import first.firstsb.max.Location.StateInterface;

@Controller
public class RegController {
	@Autowired
	LoginBean loginBean;
	@Autowired
	 LoginDAO loginDAO;
	@Autowired
	RegistServices registServices;
	@Autowired
	StateInterface stateInterface;
	@Autowired
	DistrictInterface districtInterface;
	@RequestMapping(value="reg",method=RequestMethod.POST)
	public String getData(@ModelAttribute("ok")LoginBean loginBean)
	{
		System.out.println("st " +loginBean.getStCode());
		//System.out.println("st name---------" +loginDAO.getStateName(loginBean.getStCode()));
		int t=registServices.getRegist(loginBean);
		if(t>0)
			return "S";
		else
		
		return "E";
		
	}
	@RequestMapping(value ="view",method = RequestMethod.GET)
	 public String viewDetails(ModelMap m)
	 {
		List<RegistDTO> lsst=	new ArrayList<RegistDTO>();
		List<RegistDTO> lst=loginDAO.viewDetails();
		for(RegistDTO p:lst)
		{
			RegistDTO r=new RegistDTO();
			StateBean t=stateInterface.getStateBeanByStCode(p.getStCode()); 
            r.setStCode(t.getStName());
            r.setName(p.getName());
            r.setMob(p.getMob());
            DistBean d= districtInterface.getDistBeanDistNameByDistCode(p.getDtCode());
            r.setDtCode(d.getDistName());
            lsst.add(r);
		}

		m.addAttribute("lst" ,lsst) ;
		return "view";
		
	 

}
}
