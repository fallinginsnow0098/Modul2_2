package bai12.baitap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> lists;
    private Scanner scanner = new Scanner(System.in);

    public ProductManager() {
        this.lists = new ArrayList<>();
    }

    public void displayAll() {
        for (Product product : lists) {
            System.out.println(product);
        }
    }

    public boolean addProduct(Product product) {
        if (lists.add(product))
            return true;
        return false;
    }

    public void deleteProduct(int id) {
        lists.removeIf(product -> product.getId() == id);
//        Product removeProduct = null;
//        for (Product product:lists) {
//            if (product.getId() == id){
//                removeProduct = product;
//            }
//        }
//        lists.remove(removeProduct);
//        System.out.println("___________________________");
//        displayAll();
    }

    public void searchProductById(int id) {
        for (Product product : lists) {
            if (product.getId() == id) {
                System.out.println(product);
            }
        }
    }

    public void changeProduct(int id, String name) {
        for (Product product : lists) {
            if (product.getId() == id) {
                product.setName(name);
            }
        }
    }

    public void sortById() {
        lists.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getId() > o2.getId()) return 1;
                else if (o1.getId() < o2.getId()) return -1;
                else return 0;
            }
        });
        displayAll();
    }

    public void sortByPrice() {
        lists.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) return 1;
                else if (o1.getPrice() < o2.getPrice()) return -1;
                else return 0;
            }
        });
        displayAll();
    }
}
