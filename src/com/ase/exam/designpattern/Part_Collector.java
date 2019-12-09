/*
 * Created by Ankita Patil
 * This class is a concrete implementation of the Employee Handler
 */
package com.ase.exam.designpattern;

public class Part_Collector extends Employee {

	public Part_Collector() {
		this.authorityLevel = PART_COLLECTOR;
	}
	
	@Override
	protected void write(String message) {
		message = message.concat("all parts have been gathered");
		System.out.println(message);
	}

}
