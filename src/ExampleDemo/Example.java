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
	}
}
