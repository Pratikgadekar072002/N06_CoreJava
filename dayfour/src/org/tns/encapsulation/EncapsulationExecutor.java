package org.tns.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		Axis h = new Axis();
		h.setAcctype("personal account");
		h.setAccno(1111111111);
		h.setAtmcard(23440447);
		h.setPinno(1111);
		
		System.out.println(h);
		
	

	}

}
