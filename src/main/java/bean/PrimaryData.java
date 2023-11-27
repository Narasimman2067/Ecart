package bean;

public class PrimaryData {

	private int id;
	private String pname;
	private String pmobile;
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setPname(String pname) {
		this.pname=pname;
	}
	
	public String getPname() {
		return pname;
	}
	public void setPmobile(String pmobile) {
		this.pmobile=pmobile;
	}
	
	public String getPmobile() {
		return pmobile;
	}

public String toString() {
	return ""+this.pname + this.pmobile;
}
	


	
	
	

}

































