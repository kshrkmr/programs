package org.partialabstraction;

import org.fullyabstraction.FullAbstract;
import org.fullyabstraction.FullAbstraction;

public class Package implements FullAbstract,FullAbstraction {

	@Override
	public void method1() {
		System.out.println("Hai");
		
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
	}
	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("java");
	}
	public static void main(String[] args) {
		Package p = new Package();
		p.method1();
		p.method2();
		p.method3();
	
	}

}
