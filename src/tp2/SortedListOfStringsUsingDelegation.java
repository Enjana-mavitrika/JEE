package tp2;

import java.util.ArrayList;

/*
 * exo 3
 */

public class SortedListOfStringsUsingDelegation {

	private ArrayList<String> sortedL;
	
	
	public SortedListOfStringsUsingDelegation(){
		sortedL = new ArrayList<>();
	}
	
	public boolean add(String element){
		// algo donner par le prof
		int i = 0;
		while (i < size() && element.compareTo(get(i)) > 0){
			i++;
		}
		sortedL.add(i, element);
		return true;
	}
	
	public int size(){ return sortedL.size();}
	
	public String get(int i){ return sortedL.get(i);}
	
	public void remove(){sortedL.remove(0);}
	
}
