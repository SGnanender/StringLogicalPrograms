package javahashmap;

import java.util.HashMap;

public class Print_Pair_Of_Values {

	public static void main(String[] args) {
	 HashMap<Integer, String> map=new HashMap<Integer, String>();
	 map.put(1, "Apple");
	 map.put(2, "Banana");
	 map.put(3, "Orange");
	 map.put(4, "Kivi");
	 map.put(5, "Grape");
	 map.put(6, "WaterMilon");  
	 
	 System.out.println(map.get(1));
	 System.out.println("============================================================");
	 System.out.println(map);
	 System.out.println("============================================================");
	 for(int i: map.keySet())
		 System.out.println(+i+" : "+ map.get(i));
	 
	}

}
