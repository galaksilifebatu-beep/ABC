
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("batu");
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        for (Integer item : set) {
            System.out.println(item);
        }

        for (Map.Entry<String, Integer> item : map.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }
}


