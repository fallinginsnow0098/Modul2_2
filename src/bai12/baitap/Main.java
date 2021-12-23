package bai12.baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        Product p1 = new Product(4,"A1",10000);
        Product p2 = new Product(3,"A2",2000);
        Product p3 = new Product(2,"A3",3000);
        Product p4 = new Product(1,"A4",4000);

        ProductManager productManager = new ProductManager();
        productManager.addProduct(p1);
        productManager.addProduct(p2);
        productManager.addProduct(p3);
        productManager.addProduct(p4);
        System.out.println("List product:-------------------------------------- ");
        productManager.displayAll();
        productManager.changeProduct(1, "A10");
        productManager.changeProduct(2, "A13");
        productManager.changeProduct(3, "A240");
        System.out.println("After change:-------------------------------------- ");
        productManager.displayAll();
        System.out.println("Search product by id:------------------------------  ");
        productManager.searchProductById(2);
        System.out.println("After sort:----------------------------------------  ");
        productManager.sortById();
        System.out.println("After sort:----------------------------------------  ");
        productManager.sortByPrice();
        System.out.println("After remove id = 1: ------------------------------  ");
        productManager.deleteProduct(1);
        productManager.displayAll();


    }
}
