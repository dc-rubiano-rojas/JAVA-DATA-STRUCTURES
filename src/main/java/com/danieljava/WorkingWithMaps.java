package com.danieljava;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps {
    public static void main(String[] args) {
        // maps();
        hashFunctions();
    }

    private static void hashFunctions() {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Vale"), new Diamond("Zaf"));
        // System.out.println(map.values());

        System.out.println(new Person("Camilo").hashCode());
        System.out.println(new Person("Camilo").hashCode());

        System.out.println(map.get(new Person("Vale") ));
    }

    private static void maps() {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Camilo"));
        map.put(2, new Person("Camila"));
        map.put(3 , new Person("Victor"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());

        // Loop =========================
        map.entrySet()
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        map.forEach(((key, person) -> {
            System.out.println(key + " - " + person);
        }));
        // ===============================

        map.remove(3);
        System.out.println(map.entrySet());
        System.out.println(map.getOrDefault(3, new Person("Default")));
        System.out.println(map.values());
    }

    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
    record Diamond(String name) {}
}
