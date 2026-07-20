
void main() {


    for (int i = 1; i <= 5; i++) {
        System.out.println("batu");
    }

    HashMap<String, String> map = new HashMap<>();
    map.put("one", "batu1");
    map.put("two", "batu2");
    map.put("three", "batu3");

    for (Map.Entry<String, String> entry : map.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }


}
