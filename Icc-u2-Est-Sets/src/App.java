import java.util.*;

public class App {
    public static void main(String[] args) {
        Sets c1 = new Sets("Pedro", "Lopez", "222222222");
        Sets c2 = new Sets("Luis", "Perez", "111111111");
        Sets c3 = new Sets("Pedro", "Gonzales", "123456789");
        Sets c4 = new Sets("Ana", "Perez", "987654321");
        Sets c5 = new Sets("Pedro", "Lopez", "123456789"); 

        Set<Sets> hashSet = new HashSet<>();
        hashSet.add(c1);
        hashSet.add(c2);
        hashSet.add(c3);
        hashSet.add(c4);
        hashSet.add(c5);

        Set<Sets> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(c1);
        linkedHashSet.add(c2);
        linkedHashSet.add(c3);
        linkedHashSet.add(c4);
        linkedHashSet.add(c5);

        Set<Sets> treeSet = new TreeSet<>();
        treeSet.add(c1);
        treeSet.add(c2);
        treeSet.add(c3);
        treeSet.add(c4);
        treeSet.add(c5);

        System.out.println("HashSet:");
        for (Sets c : hashSet) {
            System.out.println(c);
        }

        System.out.println("\nLinkedHashSet:");
        for (Sets c : linkedHashSet) {
            System.out.println(c);
        }

        System.out.println("\nTreeSet:");
        for (Sets c : treeSet) {
            System.out.println(c);
        }
    }
}
