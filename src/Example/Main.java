package Example;

public class Main {
	public static void main(String[] args) {
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
		
		//single line does not need a return statement
		Addition add = (int a, int b)-> a + b;
	}
}

/*A interface can only have one function for the use of lambda expression.*/
interface Addition
{
	int add(int a, int b);
}

