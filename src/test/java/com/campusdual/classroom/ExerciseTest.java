package com.campusdual.classroom;

import java.util.Stack;

class Exercise {

    static Stack<String> createStack() {
        Stack<String> stack = new Stack<>();
        stack.push("Smith");
        stack.push("Montessori");
        stack.push("Peralta");
        stack.push("House");
        return stack;
    }

    static void printAndEmptyStack(Stack<String> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<String> myStack = createStack();
        System.out.println("Top element in stack: " + myStack.peek());
        printAndEmptyStack(myStack);
    }
}
