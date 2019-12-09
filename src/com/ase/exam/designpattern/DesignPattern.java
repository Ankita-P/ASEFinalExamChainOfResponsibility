/*
 * Created by Ankita Patil
 * This class contains the implementation of Design Pattern- Chain of Responsibility
 */
package com.ase.exam.designpattern;

public class DesignPattern {

	public static void main(String[] args) {
		Part_Collector emp1 = new Part_Collector();
		Assembler emp2 = new Assembler();
		Welder emp3 = new Welder();
		Painter emp4 = new Painter();
		
		emp1.setNextEmployee(emp2);
		emp2.setNextEmployee(emp3);
		emp3.setNextEmployee(emp4);
		
		emp1.doWork(5, "Start Work ->");
	}

}
