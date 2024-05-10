package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaSortingFiltering {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 28, "New York"));
        people.add(new Person("Alice", 24, "Los Angeles"));
        people.add(new Person("Bob", 30, "New York"));
        people.add(new Person("Charlie", 22, "New York"));

        people.sort(Comparator.comparingInt(p -> p.age));

        people.removeIf(p -> !p.city.equals("New York"));

        people.forEach(System.out::println);
    }
}
