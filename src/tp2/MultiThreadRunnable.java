package tp2;

public class MultiThreadRunnable implements Runnable {
	
	
	private String name; // nom Thread
	
	// constructeur
	public MultiThreadRunnable(String name) {this.name = name;}
	
	
	public void run() {
		// compter jusqu a 10
		for(int i = 1; i < 10; i++) {
			System.out.println(name + " ... tictac : " + i);
			try {
				Thread.sleep((long)(Math.random() * 10_000));
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println(name + "... tictac : termine");
	}

	
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		Thread tts[] = new Thread[n];
		
		// verifier usage
		if(n < 1 || n > 10) {
			System.out.println("Usage : il faut un argument entier entre 1 et 10 !!");
			System.exit(-1);
		}
		
		// creer n Thread
		for(int i = 0; i < n; i++) {
			tts[i] = new Thread(new MultiThreadRunnable("thread " + i));
			tts[i].start();
		}
		
		// attendre fin des n Threads
		for (int i = 0; i < n; i++) {
			try {
				tts[i].join();
			} catch (InterruptedException e) {

			}
		}
	}


}
