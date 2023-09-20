package first.firstsb.max;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import first.firstsb.max.Location.DistBean;
import first.firstsb.max.Location.DistrictInterface;
import first.firstsb.max.Location.RegistDTO;
import first.firstsb.max.Location.RegistInterface;
import first.firstsb.max.Location.StateInterface;

@Repository
public class LoginDAO {
  
	@Autowired
	StateInterface stateInterface;
	@Autowired
	DistrictInterface districtInterface;
	@Autowired
	RegistInterface registInterface;
	public List<StateBean> getStateList()
	{
		List<StateBean> list=(List<StateBean>)stateInterface.findAll();
		return list;
	}
   public String getStateName(String stCode)
   {
	   System.out.println("dao "+stCode);
	   StateBean s=stateInterface.getStateBeanByStCode(stCode);
			 return s.getStName();
	}
   public String getStateShortName(String stCode)
   { 
	   System.out.println("dao "+stCode);
	   StateBean s=stateInterface.getStateBeanStateShortNameByStCode(stCode);

	return s.getStShortName();
	   
   }
   public List<DistBean>getDistList(String stCode)
   {
	return districtInterface.getDistBeanListByStCode(stCode);
	 
	   
   }
   public int saveRegist(RegistDTO registDTO)
   {
	   RegistDTO t=registInterface.save(registDTO);
	   return t.getRid();
   }
   public List<RegistDTO>viewDetails()
   {
	return (List<RegistDTO>)registInterface.findAll();
	   
   }


}
