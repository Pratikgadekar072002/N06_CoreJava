package org.tns.hirechical;

public class snowcone extends Android {
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public snowcone(String brand, String slottype, int version) {
		super(brand, slottype);
		this.version = version;
	}

	@Override
	public String toString() {
		return "snowcone [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	
}
