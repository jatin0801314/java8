package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.omg.Messaging.SyncScopeHelper;

class Person{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class MyStream {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hsdc");
		list.add("av");
		list.add("hsdc");
		list.add("das");
		list.add("lasdf");
		//list.stream().forEach(p->System.out.println(p));
		//method reference
		list.stream().forEach(System.out::println);
		
		
		Stream<String> stream = list.stream();
		Stream<String> stream1 = stream.filter(p ->(p=="hsdc"));
		//System.out.println(stream1.mapToInt(p->1).sum());;
		
		Set<String> set = list.stream().collect(Collectors.toSet());
		//System.out.println(set);
	}
	 
}
