package first.firstsb.max;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="state_mst")
public class StateBean {
 @Id
 @Column(name="state_code")
   String stCode;
 @Column(name="state_name")
   String stName;
 @Column(name="state_short_name")
   String stShortName;
public String getStName() {
	return stName;
}
public void setStName(String stName) {
	this.stName = stName;
}
public String getStCode() {
	return stCode;
}
public void setStCode(String stCode) {
	this.stCode = stCode;
}
public String getStShortName() {
	return stShortName;
}
public void setStShortName(String stShortName) {
	this.stShortName = stShortName;
}
   
}
