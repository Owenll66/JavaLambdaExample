package lambdaMethodReferenceDemo;

import java.util.function.Consumer;

public class Main {	
	public static void main(String[] args) {
		System.out.println("******* Method Reference Example 1 *******");
		Thread thread = new Thread(()->printMessage1());
		thread.start();
		
		//Same as using method reference
		Thread thread1 = new Thread(Main::printMessage1);//Same as ()->printMessage1()
		thread1.start();
		
		
		printMessage2("Hello", p -> System.out.println(p));
		
		//Method reference takes an argument and pass it to the System.out.println function
		printMessage2("Hello", System.out::println);//Same as p -> System.out.println(p)
		
		
	}
	
	
	
	public static void printMessage1() {
		System.out.println("Hello World");
	}
	
	public static void printMessage2(String s, Consumer<String> consumer) {
		consumer.accept(s);
	}
}

