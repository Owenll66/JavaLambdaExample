package lambdaMethodReferenceDemo;

import java.util.function.Consumer;

public class Main {
	public void doProcess(int i, Consumer<Integer> consumer) {
		consumer.accept(i);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.doProcess(10, p->{
			System.out.println("Number "+p);
			//System.out.println(this); 
			//This will not work, "this" cannot be used in a static reference
		});
		
		System.out.println();
		main.execute();
	}
	
	public void execute() {
		doProcess(10, p->{
			System.out.println("Number "+p);
			System.out.println(this); //This will work
		});
	}
	
	@Override
	public String toString() {
		return "This is Main class";
	}
}
