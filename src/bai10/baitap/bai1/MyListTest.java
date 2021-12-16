package bai10.baitap.bai1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        System.out.println("Test add: ");
        listInteger.add(0, 9);
        listInteger.add(0, 8);
        listInteger.add(0, 7);
        listInteger.add(0, 6);
        listInteger.add(0, 5);
        listInteger.add(0, 4);
        listInteger.add(0, 3);
        listInteger.add(0, 2);
        listInteger.add(0, 1);
        listInteger.display();
        System.out.println("_____________________");
        System.out.println("Test remove:");
        System.out.println(listInteger.remove(2));
        System.out.println(listInteger.size());
        System.out.println("_____________________");
        System.out.println("Test contains:");
        System.out.println(listInteger.contains(3));
        System.out.println("_____________________");
        System.out.println("Display array at this moment: ");
        listInteger.display();
        System.out.println("_____________________");
        System.out.println("Test boolean add element: ");
        System.out.println(listInteger.add(3));
        System.out.println("_____________________");
        System.out.println("Test get(int index) : ");
        System.out.println(listInteger.get(5));
        System.out.println("_____________________");
        System.out.println("Test indexOf(E e) ");
        listInteger.display();
        System.out.println("Index of e: " + listInteger.indexOf(5));
        System.out.println("_____________________");
        System.out.println("Test clear(): ");
        listInteger.clear();
        listInteger.display();

    }
}
