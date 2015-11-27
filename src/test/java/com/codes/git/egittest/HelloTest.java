package com.codes.git.egittest;

import org.junit.Test;

public class HelloTest {
	
	@Test
	public void testHello(){
		Hello hello = new Hello();
		hello.sayHello("zhangsan");
	}
	
}
