import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PrzesylanyObiekt {
	
	
	private String dane1 = "dane 1";
	private String dane2 = "dane 2";
	
	
	public String getDane1() {
		return dane1;
	}
	public void setDane1(String dane1) {
		this.dane1 = dane1;
	}
	public String getDane2() {
		return dane2;
	}
	public void setDane2(String dane2) {
		this.dane2 = dane2;
	}
	
	

}
