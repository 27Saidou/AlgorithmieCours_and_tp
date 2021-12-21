package com.niit.applicalculatrice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MessageTest {
String message="salut les devs de NIIT";
Message unMessage=new Message(message);
	@Test
	void test() {
		assertEquals(message,unMessage.printmessage());
	}

}
