package tp2;

import java.util.concurrent.Semaphore;

public class SemaphoreCommun extends Semaphore {
	
	
	final Integer PONG = 1;
	final Integer PING = 0;
	
	Integer dernier = 1;
	
	public SemaphoreCommun(int i) {
		
		super(i);
		
	}

}
