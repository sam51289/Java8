package interfaces;

@FunctionalInterface
public interface Sayable2 {

	public int say(String name, int a,int b);
	
	public default void say1(){
		System.out.println("Inside default method");
	}
	
	public static void say2(){
		System.out.println("Inside static method");
	}
}
