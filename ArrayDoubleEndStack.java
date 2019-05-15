
package module2.homework;

import java.util.Arrays;

public class ArrayDoubleEndStack {

    private int[] doubleEndStack = new int[10];
    private int rightPosition = doubleEndStack.length / 2;
    private int leftPosition = doubleEndStack.length / 2 - 1;
    //[______16,| 15______9}
    //[_, _, _,| _, _, _]

    void addLeft(int number) {
        if (leftPosition < 0) {
            System.out.println("Stack is full from left");
        } else {
            doubleEndStack[leftPosition--] = number;
        }

    }

    void addRight(int number) {
        if (rightPosition >= doubleEndStack.length) {
            System.out.println("Stack is full from right");
        } else {
            doubleEndStack[rightPosition++] = number;
        }
    }

    int removeLeft() {
        if (leftPosition > doubleEndStack.length / 2 - 1) {
            System.out.println("stack is empty");
            return 0;
        } else {
            int removedValue = doubleEndStack[leftPosition++];
            doubleEndStack[leftPosition] = 0;
            return removedValue;
        }
    }

    int removeRight() {
        if (rightPosition > doubleEndStack.length) {
            System.out.println("stack is empty");
            return 0;
        } else {
            int removedValue = doubleEndStack[leftPosition--];
            doubleEndStack[leftPosition] = 0;
            return removedValue;
        }
    }

    void printStack() {
        System.out.println(Arrays.toString(doubleEndStack));
    }
}