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
	
	
}

interface HelloWorld {
	void greet();
}

interface SringLength {
	int getStringLength(String s);
}