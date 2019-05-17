package ThreadExample;

public class Thread1 implements Runnable{

	public void run(){
		System.out.println("Running Thread");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread1 t1 = new Thread1();
		Thread t= new Thread(t1);
		t.start();

		
		Runnable t2 =() -> {
			System.out.println("Running Thread t2");
		};
		Thread thread2= new Thread(t2);
		thread2.start();
	}

}
