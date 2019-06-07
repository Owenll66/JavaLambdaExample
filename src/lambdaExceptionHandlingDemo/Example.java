package lambdaExceptionHandlingDemo;

import java.util.function.BiConsumer;

public class Example {
	public void showLambdaExceptionHandlingExample() 
	{
		System.out.println("************* Lambda Exception Handling Example *************");
		int x = 5;
		int y = 0;
		/* number divided by 0 will cause arithmeticException*/
		process(x, y, wrapperLambda((a, b)-> System.out.println(a/b)));
	}
	private void process(int a, int b, BiConsumer<Integer, Integer> biConsumer) 
	{	
		biConsumer.accept(a, b);	
	}
	/*Exception handling
	 * Takes a lambda expression as an argument
	 * return a lambda expression*/
	private BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer)
	{
		return (a,b) -> {
			try {
				biConsumer.accept(a, b);
			}catch(ArithmeticException e) 
			{
				System.out.println("Exception caught in wrapper lambda");
			}
			
		};
	}
	
	
	
	public void closureExample() 
	{
		
	}
	
	
}
