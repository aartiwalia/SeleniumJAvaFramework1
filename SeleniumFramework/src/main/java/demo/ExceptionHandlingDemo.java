package demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		try {
		System.out.println("Hello World");
		int i=1/0;
		System.out.println("Completed");
		}
		catch(Exception e)
		{System.out.println("I am inside catch block");
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
			
		}
finally {
	System.out.println("Finally executed");
}
	}

}
