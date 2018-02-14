package tp2;

public class Pong_sem implements Runnable{

private SemaphoreCommun sem;
	
	public Pong_sem(SemaphoreCommun s) {
		this.sem =s; 
	}
	
	
public void run() {
		
		while(true) {
			
			try {
				sem.acquire();
				
				if (sem.dernier.equals(sem.PING)) {
					
					System.out.println("PONG");
					sem.dernier= sem.PONG;
					
				}
				
				sem.release();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			
		}
}
	
	
}
