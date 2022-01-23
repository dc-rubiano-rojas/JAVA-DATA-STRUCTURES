package com.danieljava;

import java.util.Locale;
import java.util.Optional;

public class WorkingWithOptional {

    public static void main(String[] args) {
        // learning();
        Person person = new Person("Daniel", null);
//
//        String email = person
//                .getEmail()
//                .map(String::toLowerCase)
//                .orElse("Email Not Provided");
//
//        System.out.println(email);

        if(person.getEmail().isPresent()) {
            String email = person.getEmail().get();
            System.out.println(email);
        } else {
            System.out.println("Email Not Provided");
        }
    }

    public static void learning() {
        Optional<String> hello = Optional.ofNullable(null);

        System.out.println(hello.isPresent());
        System.out.println(hello.isEmpty());

        // String orElse = hello
        // .map(String::toLowerCase)
        // .orElse("World");
        // .orElseGet(() -> {
        // ... Extra computation to retrive the value
        // return "world2";
        // });
        // .orElseThrow(IllegalMonitorStateException::new);

        // hello.ifPresent(word -> {
        //    System.out.println(word);
        // });

        // hello.ifPresent(System.out::println);

        // hello.ifPresentOrElse(word -> {
        //    System.out.println(word);
        // }, () -> {
        //    System.out.println("WORLD");
        // });

        hello.ifPresentOrElse(System.out::println, () -> System.out.println("WORLD"));
    }


}

class Person {
    private final String name;
    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
