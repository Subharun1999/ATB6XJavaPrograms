package ex_28052024_LearningList;

import java.util.HashMap;
import java.util.Map;

public class lab017_Map {

	public static void main(String[] args) {

		Map<String, Object> mp = new HashMap();
		mp.put("name", "Subho");
		mp.put("age", 25);
		mp.put("course", "ATB");
		mp.put("roll no", 3);

		for(Map.Entry<String, Object> item: mp.entrySet()){
			System.out.println(item);
		}
	}
}
