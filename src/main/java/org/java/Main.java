package org.java;

public class Main {
	
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		System.out.println("Addizione > " + c.add(6, 3));
		System.out.println("Sottrazione > " + c.subtract(6, 3));
		System.out.println("Moltiplicazione > " + c.moltiply(6, 3));
		try {
			System.out.println("Divisione > " + c.divide(6, 0));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
	}

}
