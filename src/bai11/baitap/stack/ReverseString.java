package bai11.baitap.stack;

public class ReverseString {
    public static void main(String[] args) {
        MyStack<String> stringStack = new MyStack<>();
        String string = "H u a n 2 4 K M H D 1 8 0 9 1 9 9 8";
        String[] strings = string.split("\\s");

        System.out.println("Before reverse: ");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + "\t");
        }
        System.out.println();
        for (String s : strings) {
            stringStack.push(s);
        }
        for (int i = 0; i < strings.length; i++) {
            strings[i] = stringStack.pop();
        }
        System.out.println("After reverse: ");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + "\t");
        }
    }
}
