package first.firstsb.max;

import org.springframework.stereotype.Component;

@Component
public class RegBean {
	String stCode;
	String stName;
	String dtCode;
	String name;
	String mob;
	public String getStCode() {
		return stCode;
	}
	public void setStCode(String stCode) {
		this.stCode = stCode;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
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
