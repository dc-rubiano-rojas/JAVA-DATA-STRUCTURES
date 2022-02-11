package com.danieljava.lambdas;

public class Lambdas {
    public static void main(String[] args) {

        // Cat myCat = new Cat();
        // myCat.print();

        Printable lambdaPrintable = (p, s) ->  {
            return p + " " + s;
        };
        printThing(lambdaPrintable);
    }

    static void printThing(Printable thing) {
        thing.print("Meow", "!");
    }
}

