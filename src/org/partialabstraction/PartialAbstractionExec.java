package org.partialabstraction;

public  class PartialAbstractionExec extends PartialAbstraction {
	
	void methodCalling(int no) {
		System.out.println("integer testing"+no);
	}
	@Override
	public void partialAbstraction() {
		System.out.println("changed");
	}
	
	public static void main(String[] args) {
		PartialAbstractionExec p = new PartialAbstractionExec();
		p.methodBody();
		p.dataTypeMethod("padayappa");
		p.partialAbstraction();
		p.methodCalling(20);
	}

	

}
