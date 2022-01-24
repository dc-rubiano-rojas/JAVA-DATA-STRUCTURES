package com.danieljava.innerclasses;

public class WorkingOuterClass {
    int number = 6;

    public void heyThere() {
        System.out.println("Hey There");

        // Esta clase solo accesible dentro de la clase WorkingOuterClass
        class LocalInnerClass {
            String localInnerClassVariable = "Hey Local Inner Class";

            public void printLocalInnerClassVariable() {
                System.out.println(localInnerClassVariable);
            }
        }
        LocalInnerClass lic = new LocalInnerClass();
        lic.printLocalInnerClassVariable();
    }

    public static class InnerClass {
        int innerNumber = 8;

        public void whatsUp() {
            System.out.println("Hey What's Up From Inner Class");
        }
    }

}
