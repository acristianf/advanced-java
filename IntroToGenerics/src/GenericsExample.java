package src;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        // Without generics
        List names = new ArrayList();
        names.add("Kelly");
        String name = (String) names.get(0);
        System.out.println("First name: " + name);
        names.add(7); // The compiler will not complain about this

        // With generics
        List<String> names2 = new ArrayList<>();
        names2.add("Kelly");
        String name2 = names2.get(0);
        System.out.println(name2);
    }
}
