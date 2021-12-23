package bai14.thuchanh.selection_sort;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void main(String[] args) {
        selectionSort(list);
        System.out.println("After sort: ");
        for (double i : list) {
            System.out.print(i + "   ");
        }
    }
    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length; i++) {
            double minValue = list[i];
            int minValueIndex = i;
            System.out.println("At loop i: " + i);
            for (int j = i+1; j < list.length; j++) {
                System.out.println("At loop j: " + j);
                if (minValue > list[j]){
                    minValue = list[j];
                    minValueIndex = j;
                    System.out.printf("%10f%10d\n", minValue, minValueIndex);
                }
            }
            if (minValueIndex !=i){
                list[minValueIndex] = list[i];
                list[i] = minValue;
            }

        }
    }
}
