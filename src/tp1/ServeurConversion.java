package tp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServeurConversion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		final int PORT = 6666;
		int nbConnexion = 1;
		float montant ; 
		float devise = 0.8045f;
		
		
		ServerSocket server = new ServerSocket(PORT, nbConnexion);
		System.out.println("Serveur de conversion prêt...");
		
		while (true) {
			Socket s = server.accept();
			
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				PrintWriter out = new PrintWriter(s.getOutputStream());
				
				out.println("Saisissez le montant à convertir...");
				out.flush();
				
				montant = Float.parseFloat(in.readLine());
				
				while (in.readLine() == null || in.readLine() != "xyz") {
					in
				}
			}
			catch (IOException e) {}
		}

	}

}
