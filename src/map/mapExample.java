package map;

import java.util.HashMap;

public class mapExample {
    //The map interface does not extend the collection framework
	//stored data in key value
	  //Map Implementation
	//HashMap and HashTable uses hashcodes to uniquely identify contents
	 //Hashing functions are complicated equations defined in Object.HashCode()
	//HashTable is synchronized and safe in multithread environment
	//Hash Map is faster
	//Hash Table does not allow null keys and values
	//Hash map 0-1 ''null key and infinete "null" values
	//Tree map is similar to hash map but elements are sorted
	//Three methods are put get keySet
	//Put (v PUT(KEY, VALUE) ADDES A VALUE TO A KEY RETURNS THE OLD VALUE FOR THE KEY IF THERE WAS ONE OR NULL
	//get(K KEY) returns the values associated with the given key
	//remove (k key) removes the mapping for the given key
	//set<K) kEYSET() reTURNS A SET OF ALL THE KEYS IN THE MAP
	//PUBLIC collection <v> values() returns a collection of all values
	//Access is O(1) time complixty
	public static void main(String[] args) {
		HashMap<Integer, String> myMap = new HashMap<>(); 
        myMap.put(1, "sofa");
        myMap.put(2, "milli");
        myMap.put(3, "bini");
        System.out.println(myMap.get(1));
	}

}
