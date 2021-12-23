package bai13.baitap.optional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scanner.nextLine();
        Character character = '2';
        ArrayList<Character> strings = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            strings.add(string.charAt(i));
        }
        Collections.sort(strings);
        System.out.println(strings);

        if (searchBinary(strings, 0, strings.size() -1, character) != -1){
            System.out.println("String has value '" + character + "'" + '!');
        } else {
            System.out.println("String has not value '" + character + "'" + '!');
        }
    }
    public static int searchBinary(ArrayList<Character> strings, int left, int right, Character value){
        int mid = (left + right)/2;
        if (right >= left){
            if (strings.get(mid) == value){
                return mid;
            } else if (strings.get(mid) > value){
                return searchBinary(strings, left, mid -1, value);
            } else if (strings.get(mid) < value){
                return searchBinary(strings, mid + 1, right, value);
            }
        }
        return -1;
    }
}
