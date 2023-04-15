package com.example.Commitpushdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommitPushDemoApplicationTests {
	CommitPushDemoApplication c = new CommitPushDemoApplication();
	@Test
	void additionShouldBeTrue(){
		int a=2,b=3;
		int Expected =5;
		int Result = c.add(a,b);
		Assertions.assertEquals(Result,Expected);
	}
	@Test
	void sub(){
		int a=15;
		int b=5;
		int Expected = 10;
		int Result = c.subtract(a,b);
		Assertions.assertEquals(Result,Expected);
	}
	@Test
	void multiplication(){
		int a=2;
		int b=0;
		int Expected = 8;
		int Result = c.multiply(a,b);
		Assertions.assertEquals(Result,Expected);
	}
	@Test
	void division(){
		int a=10;
		int b=2;
		int Expected = 5;
		double Result = c.divide(a,b);
		Assertions.assertEquals(Result,Expected);
	}
	@Test
	void squareRute(){
		int a=2;
		double Result = c.squareRootOf(a);
		double Expected = 1.4142135623730951;

		Assertions.assertEquals(Result,Expected);
	}
	@Test
	void area(){
		int a=2;
		double Result = c.getArea(a);
		double Expected = 12.57;

		Assertions.assertEquals(Result,Expected);
	}

}
