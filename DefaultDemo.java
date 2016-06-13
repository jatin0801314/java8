package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

class Person1{
	
}
public class DefaultDemo implements Default , Default1{

	@Override
	public void show() {
		System.out.println("show");
	}
	@Override
	public void display() {
		System.out.println("show");
	}
	
	public static void main(String[] args) {
		Default defaultDemo = new DefaultDemo();
		defaultDemo.show();
		defaultDemo.display();
		Default.foo();
		
	//	System.out.println(String.join(" ", "java","8","features"));
		List<String> elements = new ArrayList<String>();
		elements.add("java");
		elements.add("8");
		elements.add("features");
	//	System.out.println(String.join(" ", elements));
		
		
		List<Person1> elements1 = new ArrayList<Person1>();
		
		Collections.sort(elements);
		
	}

}
