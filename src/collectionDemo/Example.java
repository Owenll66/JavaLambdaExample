package collectionDemo;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import lambdaBasicsDemo.Box;

public class Example {
	List<Box> boxes = Arrays.asList(
			new Box("box1",1,2,3),
			new Box("box2",1,2,3),
			new Box("happy box",1,2,3),
			new Box("sad box",1,2,3),
			new Box("smart box",1,2,3)
			);
	
	public void showExample1() 
	{
		System.out.println("************** Example 1 **************");
		
		System.out.println("print through \"each loop\"");
		for(Box i: boxes) 
		{
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println("print through \"for loop\"");
		for(int i = 0; i < boxes.size(); i++) 
		{
			System.out.println(boxes.get(i));
		}
		System.out.println();
		
		System.out.println("print through forEach method which takes a method reference as an argument");
		//"forEach" take an argument which is the Consumer type
		boxes.forEach(System.out::println);
		// Same as "boxes.forEach(p -> System.out.println(p))"
	}
	public void showExample2() 
	{
		System.out.println("************** Example 2 **************");
		/*loop through the Collection and add two filters*/
		boxes.stream()
		.filter(p->p.getName().startsWith("b"))
		.filter(p->p.getHeight()>2)
		.forEach(System.out::println);
		
	}
}
