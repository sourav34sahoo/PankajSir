package com.finalKeywordInJava;

public class FinalMethod {
	final void test() {
	}
}
class B extends FinalMethod {
	public void test() {    // error
		
	}
}
// If we can make a method final then overriding is not allowed
