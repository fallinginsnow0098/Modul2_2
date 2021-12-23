package bai14.thuchanh.bubble_sort;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size");
        int siz = scanner.nextInt();
        int[] list = new int[siz];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list:");
        for (int j : list) {
            System.out.print(j + "\t");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);
    }
    public static void bubbleSortByStep(int[] list){
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass ; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j+1]){
                    System.out.println("Swap " + list[j] + " with " + list[j+1]);
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    needNextPass = true;
                }
            }
            if (!needNextPass){
                System.out.println("Array may be sorted and next pass not need");
            }
            System.out.println("List after the " + i + " sort: ");
            for (int k : list) {
                System.out.print(k + "\t");
            }
            System.out.println();
        }
    }
}
