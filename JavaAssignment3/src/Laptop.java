
public class Laptop {
	private String lid;
	private String cpu;
	private String ram;
	public Laptop(String lid, String cpu, String ram) {
		super();
		this.lid = lid;
		this.cpu = cpu;
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", cpu=" + cpu + ", ram=" + ram + "]";
	}
	

	
	

}
