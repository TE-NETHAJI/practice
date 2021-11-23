package com.dev.newmethods;

public class Test01 {

	private Test01() {
		Test01 ref = null;
	}

	
	public static Test01 connection() {
		Test01 one = new Test01();
		return one;

	}
}
