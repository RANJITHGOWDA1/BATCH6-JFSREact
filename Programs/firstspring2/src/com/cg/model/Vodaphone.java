package com.cg.model;

public class Vodaphone implements Sim {

	@Override
	public void calling() {
		System.out.println("call using vodaphone sim");
		
	}

	@Override
	public void data() {
		System.out.println("Browse internet using vodaphone Sim");
		
	}

}
