package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void testSum() {
		assertEquals(3, Calc.sum(1, 2));
		assertEquals(5, Calc.sum(2, 3));
		assertEquals(7, Calc.sum(3, 4));
	}

}
