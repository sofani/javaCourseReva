package generics;

public class Generics<T> {
    //enforce type safety
	//with out Generics collections can hold any type of object
	//Trying to use an incorrect type will generate an exception
	//contents then have to be type checked and cast when retrieved
	//we use angle brackets for denoting them
	//E  the type is an element in a collection
	//K, V : the type is a map key or value
	//N: the type is any number
	//T, S, U : type general purpose type
	//Bounded Types 
	//used to restrict the types accepted by a generic class or method
	//use the extends or implements keyword <T extends someone>
	
	private T con;
	public Generics() {}
	public Generics(T t) {
		con = t;
	}
	
	public T getCon() {
		return con;
	}
	public void setCon(T con) {
		this.con = con;
	}
	public static void main(String[] args) {
		

	}

}
class keyValuePairs<K, V> {
	private K key;
	private V value;
	
	public void put(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	
	
	
}
