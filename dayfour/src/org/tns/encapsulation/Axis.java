//program to demonstrate on encapsulation
/* encapsulation achieves  a data hiding using pribate specifier*/
package org.tns.encapsulation;
public class Axis {
	//private data members
	private String acctype;
	private long accno;
	private long atmcard;
	private int pinno;
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public long getAtmcard() {
		return atmcard;
	}
	public void setAtmcard(long atmcard) {
		this.atmcard = atmcard;
	}
	public int getPinno() {
		return pinno;
	}
	public void setPinno(int pinno) {
		this.pinno = pinno;
	}
	@Override
	public String toString() {
		return "Axis [acctype=" + acctype + ", accno=" + accno + ", atmcard=" + atmcard + ", pinno=" + pinno + "]";
	}
	
}

