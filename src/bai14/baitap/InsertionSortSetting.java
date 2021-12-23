package bai14.baitap;

public class InsertionSortSetting {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        insertionSort(arr);
        printArray(arr);

    }
    public static void insertionSort(int[] array){
//        for (int i = 1; i < array.length ; ++i) {
//            int key = array[i];
//            int j = i -1;
//            while (j>= 0 && array[j] > key){
//                array[j+1] = array[j];
//                j= j-1;
//            }
//            array[j+1] = key;
//        }
        for (int i = 0; i < array.length ; i++) {
            int key = array[i];
            int j;
            System.out.println("At loop i " + i);
            for (j = i -1; j >= 0 && array[j] > key ; j--) {
                array[j+1] = array[j];
                System.out.println("At loop j " + j);
                System.out.println("Array at index " + (j+1)+ " = " + array[j+1] + " change to " + "Array at index  " + j + " = " +  array[j] );
            }

            array[j+1] = key;
        }
    }
    public static void printArray(int[] array){
        for (int i: array) {
            System.out.print(i + "\t");
        }
    }
}
