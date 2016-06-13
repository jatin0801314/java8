package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

interface Runnalbee{
	int execute(int value);
}
class Runner {
	public void run(Runnalbee runnalbe){
		System.out.println("Inside Run Method");
		int value = runnalbe.execute(12);
		System.out.println(value);
	}
}
public class LamdaExp {
	
	public static void main(String[] args) {
		
	List<String> list = new ArrayList<>();
	list.add("xasdfv");
	list.add("av");
	list.add("hsdc");
	list.add("das");
	list.add("lasdf");
	Consumer<String> consumer = x->System.out.print(x);
	list.forEach(consumer);
	
	
	
	//System.out.println(list);
	
	
	Collections.sort(list ,(String o1 , String o2) -> 
	{
		if(o1.length() > o2.length()){
			return 1;
		}
		else{
			return -1;
		}
	});
			
	//System.out.println(list);
	}
	
}
