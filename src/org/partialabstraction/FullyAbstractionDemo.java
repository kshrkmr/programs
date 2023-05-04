package org.partialabstraction;
 

import org.fullyabstraction.FullAbstract;
import org.fullyabstraction.FullAbstraction;

public class FullyAbstractionDemo implements FullAbstraction,FullAbstract {

	@Override
	public void method1() {
     System.out.println("method 1 calling interface");		
	}

	@Override
	public void method2() {
		System.out.println("method 2 calling using interface");
	}@Override
	public void method3() {
		
	}
	public static void main(String[] args) {
		FullyAbstractionDemo f = new FullyAbstractionDemo();
				f.method1();
				f.method2();
				f.method3();
	}

	
}
