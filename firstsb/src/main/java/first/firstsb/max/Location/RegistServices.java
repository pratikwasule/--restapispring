package first.firstsb.max.Location;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import first.firstsb.max.LoginBean;
import first.firstsb.max.LoginDAO;

@Service
public class RegistServices {
	@Autowired
	LoginDAO loginDAO;
	@Autowired
	RegistDTO registDTO;
	
	public int getRegist(LoginBean loginBean)
	{
		BeanUtils.copyProperties(loginBean, registDTO);
		return loginDAO.saveRegist(registDTO);
		 
		
	}
}
