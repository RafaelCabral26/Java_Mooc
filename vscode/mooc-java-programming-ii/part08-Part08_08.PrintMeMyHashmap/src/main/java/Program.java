import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        // Test your program here!
    }

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String name : hashmap.keySet()) {
            System.out.println(name);
        }
    }
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String name : hashmap.keySet()) {
            if (name.contains(text)) {
                System.out.println(name);
            }
        }
    }
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String value : hashmap.keySet()) {
            if (value.contains(text)) {
                System.out.println(hashmap.get(value));
            }
        }
    }


}
