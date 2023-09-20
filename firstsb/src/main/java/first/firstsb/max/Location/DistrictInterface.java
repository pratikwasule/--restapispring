package first.firstsb.max.Location;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DistrictInterface extends CrudRepository<DistBean, String>{
	 List<DistBean>getDistBeanListByStCode(String stCode);
	 DistBean getDistBeanDistNameByDistCode(String distCode);
	 
}
