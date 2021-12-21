package com.niit.applicalculatrice;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

class SommeDifferenceTest {

	@Test
	void testAdditionPasse() {
		assertEquals("Erreur dans l'addition",5,Calculatrice.addition(3, 2));
		assertEquals("Erreur dans l'addition", -5,Calculatrice.addition(-2, -3));
	}
	@Test
	void testSoustractionPasse() {
		assertEquals("Erreur dans la soustraction",1,Calculatrice.soustraction(3, 2));
	}
	@Test
	void testMultiplicationEchec() {
		assertEquals("Echec de multiplication",9,Calculatrice.multiplicatiob(3, 3));
	}
	@Test
	void testDivisionEchec() {
		assertEquals("", 3, Calculatrice.division(9, 3));
	}

}
