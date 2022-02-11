package com.danieljava.lambdas;

@FunctionalInterface
public interface Printable {
    String print(String preffix, String suffix);
}

// Cuando un metodo no tiene implementacion dentro de una interfaz se llama abstract
// Cuando una interfaz tiene un metodo abstracto se llama interfaz funcional