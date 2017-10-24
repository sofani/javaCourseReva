package generics;

public class Keyvalueputility {
    public static <K, V> boolean equality(keyValuePairs<K, V> p1, keyValuePairs<K,V> p2)  {
    	return (p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue()));
    	
    }
}
