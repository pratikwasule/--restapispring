package first.firstsb.max.Location;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="rsti")
public class RegistDTO {
@Id
@GeneratedValue
int rid;
String stCode;
String dtCode;
String name;
String mob;
public int getRid() {
	return rid;
}
public void setRid(int rid) {
	this.rid = rid;
}
public String getStCode() {
	return stCode;
}
public void setStCode(String stCode) {
	this.stCode = stCode;
}
public String getDtCode() {
	return dtCode;
}
public void setDtCode(String dtCode) {
	this.dtCode = dtCode;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMob() {
	return mob;
}
public void setMob(String mob) {
	this.mob = mob;
}

}
