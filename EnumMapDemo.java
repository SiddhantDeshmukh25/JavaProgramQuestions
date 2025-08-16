import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args){
        Map<Day,String> map = new EnumMap<>(Day.class);
        map.put(Day.tuesday, "Gym");
        System.out.println(Day.tuesday.ordinal());   //ordinal is internal index of that key (internal array)
        System.out.println(map);
    }
}

enum Day {
    Monday, tuesday, wednesday,Thusday, Friday
}
