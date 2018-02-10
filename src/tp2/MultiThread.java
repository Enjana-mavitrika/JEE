package tp2;

public class MultiThread extends Thread{
	
	public void run() {
		long time = (long)(Math.random() * 10_000);
		for (int i = 1; i < 10; i++) {
			try {
				System.out.println(getName() + " ... tictac : " + i);
				Thread.sleep(time);
			} catch (InterruptedException e) {

			}
		}
		System.out.println(getName() + " ... tictac : terminé");
	}
	
	public static void main(String args[]) {
		
		int n = Integer.parseInt(args[0]);
		MultiThread tts[] = new MultiThread[n];
		
		// verifier usage
		if(n < 1 || n > 10) {
			System.out.println("Usage : il faut un argument entier entre 1 et 10 !!");
			System.exit(-1);
		}
		
		// creer n Thread
		for (int i = 0; i < n; i++){
			tts[i] = new MultiThread();
			tts[i].setName("thread " + i);
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
