package first.firstsb.max.Location;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import first.firstsb.max.LoginDAO;

@RestController
public class DistrictController {
	@Autowired
	LoginDAO loginDAO;
	@RequestMapping(value="dist", method = RequestMethod.GET)
  public List<DistBean> getDistList(@RequestParam("stCode") String stCode)
  {
	return loginDAO.getDistList(stCode);
	  
  }
}
