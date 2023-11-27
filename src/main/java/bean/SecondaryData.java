package bean;

public class SecondaryData {

	private int id;
	private String smobile;
	private String saddress;
	
	
	
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId(){
		return id;
	}
	
	public void setSmobile(String smobile) {
		this.smobile=smobile;
	}

	
	public String getSmobile() {
		return smobile;
	}
	
		public void setSaddress(String saddress) {
			this.saddress=saddress;
		}
		
public String getSaddress() {
	return saddress;
}

public String toString() {
	return "" +this.smobile + this.saddress;
}
		

	}




