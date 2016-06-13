package com.java8;

public interface Default {
	void show();
	default void display(){
		System.out.println("Display");
	}
	static void foo(){
		System.out.println("foo");
	}
	
}
