package org.example.datastructure.stack;

import java.util.Stack;

public class StackClassTest {
    public static void main(String[] args) {
        var stack = new Stack<String>();
        stack.push("Java");
        stack.push("Pascal");
        stack.push("Delphi");
        stack.push("BASIC");
        stack.push("Kotlin");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}