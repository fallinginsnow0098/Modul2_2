package bai11.baitap.optional;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome<T> {
    private LinkedList<T> stack;

    public Palindrome(){
        stack = new LinkedList<>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if (stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public boolean isEmpty(){
        if (stack.size() ==0){
            return true;
        }
        return false;
    }
    public int size(){
        return stack.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();
        Palindrome<String> palindromeStack = new Palindrome<>();

        String[] strings = string.toLowerCase().split("");

        for (String str : strings){
            palindromeStack.push(str);
        }

        String[] strings1 = new String[strings.length];
        for (int i = 0; i < strings1.length; i++){
            strings1[i] = palindromeStack.pop();
        }

        if(Arrays.equals(strings, strings1)){
            System.out.println("This string is a palindrome string!");
        }else
            System.out.println("This string is not a palindrome string!");
    }
}
