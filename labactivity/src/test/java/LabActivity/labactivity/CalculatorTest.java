package LabActivity.labactivity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	 static Calculator c;
	 @BeforeAll
	 public static void init() {
		 c=new Calculator();
	 }
@Test
public void addTest(){
	assertEquals(5,c.add(2,3),"addition");}
@Test

public void subTest(){
	assertEquals(5,c.substract(7,2),"subt");}
@Test

public void mulTest(){
	assertEquals(40,c.mult(8,5),"mult");}
@Test

public void divTest(){
	assertEquals(2,c.div(4,2),"div");}
}
