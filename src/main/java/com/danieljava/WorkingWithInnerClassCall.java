package com.danieljava;

public class WorkingWithInnerClassCall {

    public static void main(String[] args) {
        WorkingOuterClass outer = new WorkingOuterClass();
        outer.heyThere();

        // Sin la inner clas static
        // WorkingOuterClass.InnerClass inner = outer.new InnerClass();

        // Con la inner class static
        WorkingOuterClass.InnerClass inner = new WorkingOuterClass.InnerClass();
        inner.whatsUp();

    }
}
