package com.danieljava;

import java.util.Arrays;

public class WorkingWithArrays {

    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "Purple";
        colors[1] = "Blue";
        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);

        int[] numbers = {100, 200};

        for(String color: colors) {
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(System.out::println);
    }
}
