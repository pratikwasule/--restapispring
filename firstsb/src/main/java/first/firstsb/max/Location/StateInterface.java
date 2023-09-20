package first.firstsb.max.Location;

import org.springframework.data.repository.CrudRepository;
import first.firstsb.max.StateBean;
public interface StateInterface extends CrudRepository<StateBean, String> 
{
	StateBean  getStateBeanByStCode(String stCode);
	StateBean  getStateBeanStateShortNameByStCode(String scode);
    
}





