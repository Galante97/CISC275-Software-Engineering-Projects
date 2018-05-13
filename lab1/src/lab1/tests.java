package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class tests {

	
	@Test
	public void TestingFunction1(){
		MathFunctions tester = new MathFunctions();
		
		assertEquals("Ten times five equals fifty", 50, tester.Mult(10, 5));//Right
	}

	@Test
	public void TestingFunction2(){
		MathFunctions tester2 = new MathFunctions();
	
		assertEquals("Three times four equals twelve", 10, tester2.Mult(3, 5));//Wrong
	}
	
	@Test
	public void TestingFunction3(){
		MathFunctions tester3 = new MathFunctions();
		
		assertEquals("Dog plus house is doghouse", "doghouse",tester3.Concat("dog", "house"));//Right
	}
	
	@Test
	public void TestingFunction4(){
		MathFunctions tester4 = new MathFunctions();

		assertEquals("Racs plus car is racecar", "speedcar",tester4.Concat("race", "car"));//Wrong
	}
}
