package bai11.baitap.stack;

public class MyStack<E> {
    private static final int initSize = 16;
    private E[] elements;
    private int count = 0;

    public MyStack() {
        elements = (E[]) new Object[initSize];
    }

    public void ensureCpacity() {
        if (count >= elements.length) {
            E[] newElements = (E[]) new Object[elements.length * 2 + 1];
            System.arraycopy(elements, 0, newElements, 0, count);
            elements = newElements;
        }
    }

    public void push(E e) {
        ensureCpacity();
        elements[count++] = e;
    }

    public E pop() {
        if (count == 0) {
            throw new IndexOutOfBoundsException("Stack is empty!");
        }
        E e = elements[count - 1];
        elements[count - 1] = null;
        count--;
        return e;
    }

    private boolean isEmpty() {
        if (count == 0) return true;
        return false;
    }
}
