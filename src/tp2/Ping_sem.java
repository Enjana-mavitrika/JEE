package tp2;

public class Ping_sem implements Runnable{
	
	private SemaphoreCommun sem;
	
	public Ping_sem(SemaphoreCommun s) {
		this.sem =s; 
	}
	
	public void run() {
		
		while(true) {
			
			try {
				sem.acquire();
				
				if (sem.dernier.equals(sem.PONG)) {
					
					System.out.println("PING");
					sem.dernier= sem.PING;
					
				}
				
				sem.release();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
			
		}
		
		
	}

}
