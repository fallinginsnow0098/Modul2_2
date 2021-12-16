package bai10.thuchanh.linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/= Testing /=/=/=");
        MyLinkedList linkedList = new MyLinkedList(10) ;
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);
        linkedList.addFirst(14);
        linkedList.addFirst(15);

        linkedList.add(4,9);
        linkedList.add(4,9);
        linkedList.add(4,5);
        linkedList.add(4,3);


        linkedList.printList();
    }
}
