package tema5;

import java.util.HashMap;
import java.util.TreeMap;

public class map {
	
	public static void main(String[] args) {

	HashMap<Integer,String> m1 = new HashMap();
	HashMap<String,Integer> m2 = new HashMap();
	TreeMap<Integer,String> m3 = new TreeMap<>();
		m1.put(11, "Victor");
		m1.put(12,"prueba");
		m1.put(5,"aitor");
		m1.put(2, "pruebas");
		m1.put(11, "Victor");
		m1.put(12,"prueba");
		m1.put(5,"aitor");
		m1.put(2, "pruebas");
		System.out.println(m1);
		m2.put("prueba", 21);
		m2.put("Victor", 16);
		System.out.println(m2);
		m3.put(11, "Victor");
		m3.put(12,"prueba");
		m3.put(5,"aitor");
		m3.put(2, "pruebas");
		System.out.println(m3);
	
	
	}
}
