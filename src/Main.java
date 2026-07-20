
import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {


        //HashMap ile HashSet farklılıkları göstermek için örnek bir kod yazalım.
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

        List<Integer> listarr = new ArrayList<>();
        List<Integer> numbers = new LinkedList<>();

        double durationAddArrayList = timer((v) -> {
            listarr.add(1);
            return null;
        });

        double durationAddLinkedList = timer((v) -> {
            numbers.add(1);
            return null;
        });

        System.out.println("arrayList ile linkedList Fark: " + (durationAddArrayList - durationAddLinkedList) + " ms");

        for (int i = 2; i < 100; i++) {
            listarr.add(i);
            numbers.add(i);
        }

        double durationGetArrayList = timer((v) -> {
            listarr.get(30);
            return null;
        });

        double durationGetLinkedList = timer((v) -> {
            numbers.get(30);
            return null;
        });

        System.out.println("arrayList ile linkedList Fark: " + (durationGetArrayList - durationGetLinkedList) + " ms");
       

    }

    private static double timer(Function<Void, Object> function) {
        //ArrayList ve LinkedList farklılıklarını göstermek için örnek bir kod yazalım.
        
        long startTime = System.nanoTime();
        
        for (int i = 0; i < 1000000; i++) {
            Math.sqrt(i);
            function.apply(null);
            
        }
        
        long endTime = System.nanoTime();
        long durationInNanoseconds = endTime - startTime;
        
        
        double durationInMilliseconds = durationInNanoseconds / 1000000.0;
        return durationInMilliseconds;
    }
}


