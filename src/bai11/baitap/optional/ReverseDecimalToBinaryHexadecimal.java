package bai11.baitap.optional;

import java.util.Scanner;
import java.util.Stack;

public class ReverseDecimalToBinaryHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();
        while (number != 0){
            if (number%2 == 1){
                number = (number -1)/2;
                stack.push(1);
                continue;
            }else{
                number = number/2;
                stack.push(0);
            }

        }
        stack.push(0);
        System.out.println("Binary is: ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
