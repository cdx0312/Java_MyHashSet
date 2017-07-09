/**
 * Created by cdxu0 on 2017/7/9.
 */
public class TestMyHashSet {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSet<>();
        set.add("Smith");
        set.add("Lewis");
        set.add("Anderson");
        set.add("Cook");
        set.add("Smith");

        System.out.println("Elements in set: " + set);
        System.out.println("numbers of elements in set : " + set.size());
        System.out.println("Is Cook in the set ? " + set.contains("Cook"));

        set.remove("Smith");
        System.out.print("Names in set in uppercase are ");
        for (String s:set)
            System.out.print(s.toUpperCase() + " ");
        set.clear();
        System.out.println("\nElements in set: " + set);
    }
}
