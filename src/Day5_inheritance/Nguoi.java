package Day5_inheritance;

public abstract class Nguoi {
	private String name;
	private String sdt;
	public abstract void dichoi() ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
	
}
