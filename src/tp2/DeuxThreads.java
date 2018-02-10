package tp2;

public class DeuxThreads extends Thread {
	
	public static void Wait(long milli) {
		System.out.println("pause de " + milli + " ms");
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			
		}
	}

	public void run() {
		for ( int i = 0; i < 1000; i++ ) {
			System.out.println(getName());
			//Thread.yield(); // passer la main
			Wait(200);
		}
	}

	public static void main(String[] args) {
		DeuxThreads tt = new DeuxThreads();
		tt.start();
		tt.setName("bleu");
		Thread.currentThread().setName("gris");
		for ( int i = 0; i < 1000; i++ ) {
			System.out.println(Thread.currentThread().getName());
			//Thread.yield(); // passer la main
			Wait(200);
		}
	}

}
