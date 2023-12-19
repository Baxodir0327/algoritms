package org.example.datastructure.stack;

public class CustomStackClassTest {
    public static void main(String[] args) {
        var stack = new MyStack<String>(10);
        stack.push("Java");
        stack.push("Pascal");
        stack.push("Delphi");
        stack.push("BASIC");
        stack.push("Kotlin");
        // for (String s : stack) {
        //     System.out.println(s);
        // }
        System.out.println(stack);
    }
}