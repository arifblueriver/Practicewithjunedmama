package mappractise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mappractise {
	public static void main(String[] args) {
		
		Map<String,String>Mymap=new LinkedHashMap<>();
		Mymap.put("Name","Rajon");
		Mymap.put("Age","30");
		Mymap.put("Join Date","06/10/2019");
		Mymap.put("Phone number","7456934141");
		
		System.out.println(Mymap);
		System.out.println(Mymap.keySet());
		System.out.println(Mymap.values());
		System.out.println(Mymap.get("Age"));
		System.out.println(Mymap.get("Name"));
		System.out.println(Mymap.get("Join Date"));
 Map<String,String>Mymap1=new TreeMap<>();
 Mymap1.put("Sky","Blue");
 Mymap1.put("Sun","Red");
 Mymap1.put("Tree","Green");
 System.out.println(Mymap1);
 System.out.println(Mymap1.keySet());
 System.out.println(Mymap1.values());
 System.out.println(Mymap1.get("Sky"));
 System.out.println(Mymap1.get("Tree"));
 
 Map<String,Double>Mymap2=new TreeMap<>();
 Mymap2.put("Milk",3.99);
 Mymap2.put("Egg",1.99);
 Mymap2.put("Meat",7.99);
 Mymap2.put("Fish",4.99);

Mymap2.forEach((k,v)->{
	System.out.println(k+"="+v);
	System.out.println(k);
	System.out.println(v);
});
Mymap2.entrySet().forEach(item->{
	System.out.println(item);
	System.out.println(item.getKey());
	System.out.println(item.getValue());

});

}





		
	}


