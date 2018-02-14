package tp2;

import java.util.ArrayList;

public class SortedListUsingDelegation <E extends Comparable<E>>{
	
	private ArrayList<E> arrL;
	
	public SortedListUsingDelegation(){
		arrL = new ArrayList<>();
	}
	
	public boolean add(E element){

		// algo donner par le prof
		int i = 0;
		while (i < size() && element.compareTo(get(i)) > 0){
			i++;
		}
		arrL.add(i, element);
		return true;
		//----------------------

	}
	
	public int size(){return arrL.size();}
	
	public E get(int i){return arrL.get(i);}
	
	public E peek(){return arrL.get(0);}
	
	public void remove(E e){arrL.remove(e);}
	
	public boolean isEmpty(){return 0 == size();}
	
	public boolean contains(E e){
		for (int i = 0; i < size(); i++){
			if (e.compareTo(get(i)) > 0)
				return true;
		}
		return false;
	}

}
