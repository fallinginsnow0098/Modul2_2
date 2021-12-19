package bai11.baitap.stack;

public class ReverseInteger {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        Integer[] integers = new Integer[5];

        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        integers[3] = 4;
        integers[4] = 5;
        System.out.println("Before reverse: ");
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i] + "\t");
        }
        System.out.println();
        System.out.println("_______________");
        for (Integer i : integers) {
            stack.push(i);
        }
        for (int i = 0; i < integers.length; i++) {
            integers[i] = stack.pop();
        }
        System.out.println("Afer reverse: ");
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i] + "\t");
        }
    }
}
