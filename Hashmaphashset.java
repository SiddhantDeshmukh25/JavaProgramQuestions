import java.util.HashMap;
import java.util.HashSet;

public class Hashmaphashset {
    public static void main (String[] args){
        HashMap<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Siddhant", 90);
        studentMarks.put("Shripad", 85);
        studentMarks.put("Siddhant", 100);

        System.out.println("Student Marks (HashMAP)");
        for (String name : studentMarks.keySet()) {
            System.out.println(name + " ->" +studentMarks.get(name));
        }
        //Hashset

        HashSet<String> cities = new HashSet<>();

        cities.add("Pune");
        cities.add("Mumbai");
        System.out.println("Cities(HashSet)");
        for(String city : cities) {
            System.out.println(city);
        }
    }
}
