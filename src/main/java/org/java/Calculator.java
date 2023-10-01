package org.java;

public class Calculator {
	
	
	public float add (float a, float b) {
		return a+b;
	}
	
	public float subtract(float a,float b) {
		return a-b;
	}
	
	public float moltiply(float a,float b) {
		return a*b;
	}
	
	public float divide(float a,float b) throws Exception {
		if(b <= 0)
		throw new Exception("Cannot divide for 0 or less");
		
		return a/b;
}

}
