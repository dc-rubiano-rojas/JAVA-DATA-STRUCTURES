package com.danieljava;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithList {
    public static void main(String[] args) {

        List<String> colorsUnmodifiable = List.of(
                "blue",
                "yellow"
        );

        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Purple");
        colors.add("Yellow");

        System.out.println(colors.size());
        System.out.println(colors.contains("Yellow"));
        System.out.println(colors.contains("red"));
        System.out.println(colors);

        for(String color: colors) {
            System.out.println(color);
        }

        colors.forEach(System.out::println);
    }
}
