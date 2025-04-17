package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TpJenkinsAppApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("it is a test class");
		assertEquals(true, true);
	}

}
