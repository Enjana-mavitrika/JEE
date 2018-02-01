package tp1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class OpenURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/****
		 *  Exercice 2 : Lire et afficher le contenus du page web de mon choix
		 *  
		 *  			choix : ECLIPSE
		 */
		
		System.setProperty("http.proxyHost", "cache.univ-st-etienne.fr");
		System.setProperty("http.proxyPort", "3128");
		
		try {
			
			URL eclipse = new URL("https://www.eclipse.org/users/");
			URLConnection ec = eclipse.openConnection();
			DataInputStream dis = new DataInputStream(eclipse.openStream());
			
			String input; 
			
		
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(ec.getInputStream()));
			
			while ((input = reader.readLine()) != null) {
				System.out.println(input);
			}
			
			dis.close();
			
		}
		catch (MalformedURLException e) {
			System.out.println("URL mal formé !!");
		}
		catch(IOException e1) {
			System.out.println("Erreur I/O " + e1);
		}
		
		
	}

}
