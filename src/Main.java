
import java.util.*;

public class Main {
    public static void main(String[] args) {


        //HashMap ile HashSet farklılıkları göstermek için örnek bir kod yazalım.
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);

        

        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        for (Integer item : set) {
            System.out.println(item);
        }

        // for (Map.Entry<String, Integer> item : map.entrySet()) {
        //     System.out.println(item.getKey() + ": " + item.getValue());
        // }
        //System.exit(0);

        List<Integer> listarr = new ArrayList<>();
        List<Integer> numbers = new LinkedList<>();

        for (int i = 2; i < 100; i++) {
            listarr.add(i);
            numbers.add(i);
        }

        int operations = 1_000_000;

        double durationAddArrayList = timer(() -> {
            listarr.add(10, 19);
            listarr.remove(10);
        }, operations);

        double durationAddLinkedList = timer(() -> {
            numbers.add(10, 19);
            numbers.remove(10);
        }, operations);

        System.out.println("arraylist ekleme süresi: " + durationAddArrayList + " ms");
        System.out.println("linkedlist ekleme süresi: " + durationAddLinkedList + " ms");
        System.out.println("arrayList ile linkedList Fark: " + (durationAddArrayList - durationAddLinkedList) + " ms");

        double durationGetArrayList = timer(() -> {
            listarr.get(30);
        }, operations);

        double durationGetLinkedList = timer(() -> {
            numbers.get(30);
        }, operations);

        System.out.println("arraylist get süresi: " + durationGetArrayList + " ms");
        System.out.println("linkedlist get süresi: " + durationGetLinkedList + " ms");
        System.out.println("arrayList ile linkedList Fark: " + (durationGetArrayList - durationGetLinkedList) + " ms");
    }

    private static double timer(Runnable action, int iterations) {
        long startTime = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            action.run();
        }

        long endTime = System.nanoTime();
        long durationInNanoseconds = endTime - startTime;
        return durationInNanoseconds / 1_000_000.0;
    }
}


