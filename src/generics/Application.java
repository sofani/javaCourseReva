package generics;

public class Application {

	public static void main(String[] args) {
		Generics<String> g  = new Generics<>();
		g.setCon("hi");
        System.out.println(g.getCon());
        
        keyValuePairs<Integer, String> i1 = new keyValuePairs<Integer,String>();
        keyValuePairs<Integer, String> i2 = new keyValuePairs<Integer,String>();
        i1.put(1, "sofani");
        i2.put(1, "million");
        System.out.println("Are i1 and i2 the same " + Keyvalueputility.equality(i1, i2));
	}

}
