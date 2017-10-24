package collections;

import java.util.ArrayList;

public class ArraylistExample {
   //collection interface implemented by all collections
	//collections class with static methods used to manipulate collections
	//collections are distngushed by two things how they order elements and whether those elements are sorted
	//ordering(index, unoredred, key/value)
	//sorting(are the elements sorted)
	
	//collection interface (set interface, list interface, queue interface)
	//set(Hash set, treeSet, linkedHashSet, SortedSet, Navigable set)
	//List(ArrayList, LinkedList, Vector)
	//Queue (priority queue)
	public static void main(String[] args) {
	   ArrayList<String> arrayList = new ArrayList<>();
	   arrayList.add("sofani");
	   arrayList.add(" ");
	   arrayList.add("million");
	   arrayList.add("sofani");
	   System.out.println(arrayList.get(1));
	   System.out.println(arrayList);

	}

}
