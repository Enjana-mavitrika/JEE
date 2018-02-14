package tp2;

import java.util.ArrayList;

public class Test {
	
	public  static void afficherList(ArrayList<?> a){
		
		System.out.println("\n\n");
		for (int i = 0; i < a.size(); i++){
			System.out.println(i + " -> " + a.get(i));
		}
	}
	

	public static void main(String[] args) {
		// exo 2
		String sAr[] = {"ab", "aa", "db", "bf", "aaah"};
		SortedListOfStrings sList = new SortedListOfStrings();
		for (int i = 0; i < 5; i++){
			sList.add(sAr[i]);
		}
		for (int i = 0; i < 5; i++){
			System.out.println(i + " -> " + sList.get(i));
		}
		System.out.println("\n\n");
		
		// exo 3
		SortedListOfStringsUsingDelegation sListD = new SortedListOfStringsUsingDelegation();
		for (int i = 0; i < 5; i++){
			sListD.add(sAr[i]);
		}
		for (int i = 0; i < 5; i++){
			System.out.println(i + " -> " + sListD.get(i));
		}
		sListD.remove();
		sListD.remove();
		
		System.out.println("\n\n");
		for (int i = 0; i < sListD.size(); i++){
			System.out.println(i + " -> " + sListD.get(i));
		}
		
		// exo 4
		SortedList<String> sls = new SortedList<String>();
		sls.add("Hello");
		sls.add("World");
		afficherList(sls);
		SortedList<Integer> sli = new SortedList<Integer>();
		sli.add(1);
		sli.add(2);
		afficherList(sli);
		
		// exo 5
		SortedListUsingDelegation<Integer> sludi = new SortedListUsingDelegation<Integer>();
		sludi.add(1);
		sludi.add(5);
		sludi.add(3);
		sludi.add(0);
		System.out.println("\n\n");
		System.out.println("peek -> " + sludi.peek());
		for (int i = 0; i < sludi.size(); i++){
			System.out.println(i + " -> " + sludi.get(i));
		}
		
	}

}
