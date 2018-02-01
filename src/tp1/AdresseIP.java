package tp1;

import java.net.*;

public class AdresseIP {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("http.proxyHost", "cache.univ-st-etienne.fr");
		System.setProperty("http.proxyPort", "3128");
		
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println("On est sur " + localhost);
			System.out.println("nom : " + localhost.getHostName());
			System.out.println("addresse : " + localhost.getHostAddress());
			System.out.println("");
			
			System.out.println("Machines dont le nom est " + args[0]);
			InetAddress[] adressesIP = InetAddress.getAllByName(args[0]);
			
			for (int i = 0; i < adressesIP.length; i++) {
				System.out.println(adressesIP[i]);
				System.out.println("nom: " + adressesIP[i].getHostName());
				System.out.println("adresse : " + adressesIP[i].getHostAddress());
			}

		}
		catch (UnknownHostException e) {}
		
		
	}

}
