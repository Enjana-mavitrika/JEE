package tp2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		SemaphoreCommun sem = new SemaphoreCommun(1);
		
		Thread t1 = new Thread(new Ping_sem(sem));
		
		Thread t2 = new Thread(new Pong_sem(sem));
		
		
		t1.start();
		t2.start();
	
		
	}

}
