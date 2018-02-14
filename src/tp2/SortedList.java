package tp2;

import java.util.ArrayList;

public class SortedList <E extends Comparable <E> > extends ArrayList<E>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean add(E element){

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
