package tp2;

import java.util.ArrayList;

public class SortedListOfStrings extends ArrayList<String>{

	/**
	 * exo 1
	 */
	private static final long serialVersionUID = 1L;
	
	
	public boolean add(String element){
		
		// algo donner par le prof
		int i = 0;
		while (i < size() && element.compareTo(get(i)) > 0){
			i++;
		}
		add(i, element);
		return true;
		//----------------------
		
	}

}
