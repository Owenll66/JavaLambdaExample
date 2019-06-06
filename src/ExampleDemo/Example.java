package ExampleDemo;

public class Example {
	public void showExample1() 
	{
		System.out.println("************** Example 1 **************");
		/* single line lambda expression does not need curly braces
		 * lambda expression works the same way as implementing a class
		 * lambda expression only implements a function rather than a class
		 * */
		HelloWorld lambdaHelloWorld = ()->System.out.println("Hell World from lambda expression");
		//hello world from lambda expression
		lambdaHelloWorld.greet();
		
		//hello world from instance variable
		HelloWorld helloWorld = new HelloWorldImp();
		helloWorld.greet();
		
		//override the interface method
		HelloWorld instance = new HelloWorld() {		
			@Override
			public void greet() {
				System.out.println("Hello World from Overriding");
			}
		};
		instance.greet();
	}
	
	public void showExample2() 
	{
		System.out.println("************** Example 2 **************");
		/*
		 * Do not have to specify the input argument type
		 * Same as: "SringLength lambdaGetLength = (String s)->s.length();"
		 * 
		 * If there is only one argument, brackets can be eliminated
		 * Same as: "SringLength lambdaGetLength = s->s.length()"
		 * */
		SringLength lambdaGetLength = (s)->s.length();
		int sum = lambdaGetLength.getStringLength("Hello World");
		System.out.println("The String Length is " + String.valueOf(sum));
		
	}
	
	public void showExample3() 
	{
		System.out.println("************** Example 3 **************");
		passLambda(()->System.out.println("Pass lambda expression as an argument"));
	}
	
	public void passLambda(HelloWorld helloWorld) 
	{
		helloWorld.greet();
	}
	
	public void showExample4() 
	{
		System.out.println("************** Example 4 **************");
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("override runnable interface");	
			}});
		thread.run();
		/* NOTE:
		 * Runnable interface only have one method called "run()". 
		 * Hence, we can replace it with lambda expression
		 * If an interface has more than one methods, we can not write a lambda function of that type
		 * */
		Thread lambdaThread = new Thread(()->System.out.println("run lambda expression"));
		lambdaThread.run();
	}
	
	
}

/* Functional interface: an interface only have one abstract method
 * @FunctionalInterface annotation force an interface only have one abstract method
 * For the sake of lambda expression*/

@FunctionalInterface
interface HelloWorld {
	void greet();
	default void hi() 
	{
		System.out.println("hi");
	}
}
/* 
 * */
@FunctionalInterface
interface SringLength {
	int getStringLength(String s);
}