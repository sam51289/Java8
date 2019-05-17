package interfaces;

@FunctionalInterface
public interface WorkInterface2 {

	public void doSome2();
	
	default public void doSomeWork(){
		System.out.println("Hi I am inside Interface2 default method");
	}
	
	public static void staticMethod(){
		System.out.println("I am static Method");
	}
	
	  @Override
	    public String toString(); 
}
