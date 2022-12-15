package LabActivity.labactivity;

public class Calculator {
	
	public double add(int a,int b) {
		return a+b;
	}
	public double substract(int a,int b) {
		return a-b;
	}
	public double mult(int a,int b) {
		return a*b;
	}
	public double div(int a,int b)  {
		if(b==0){
			 throw new IllegalArgumentException();
		}
		return a/b;
	}
}
