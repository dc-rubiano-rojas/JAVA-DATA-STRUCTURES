package com.danieljava;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {

    public static void main(String[] args) {
        // queues();
        linkedList();
    }

    public static void linkedList() {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Daniel", 28));
        linkedList.addFirst(new Person("Camilo", 22));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while(personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while(personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }

    public static void queues() {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Monica", 24));
        supermarket.add(new Person("Andres", 26));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age) {}
}
