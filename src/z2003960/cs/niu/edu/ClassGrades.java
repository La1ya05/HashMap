package z2003960.cs.niu.edu;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ClassGrades {
	
	Map<String,String> ClassList = new HashMap<String,String>();
	
	ClassGrades() {
		ClassList.put("Bob", "A");
		ClassList.put("Mary", "C");
		ClassList.put("Sarah", "B");
		ClassList.put("Philip", "A");
		ClassList.put("Greg", "F");
		
	}
	
	public void printClassList() {
		Iterator<Entry<String,String>> entries = ClassList.entrySet().iterator();
		while(entries.hasNext()) {
			Entry<String, String> entry = entries.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}
	
	public void printClassList2() {
		for(Map.Entry<String,String> entry : ClassList.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		//iterating over keys only
		
		for(String Key : ClassList.keySet()) {
			System.out.println("Key = " + Key);
		}
		
		//iterating over values only
		
		for(String Value : ClassList.values()) {
			System.out.println("Value = " + Value);
		}
}
	

	public static void main(String[] args) {
        ClassGrades myClassList = new ClassGrades();
        myClassList.printClassList();
	}

}