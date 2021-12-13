package bai7.thuchanh.Animal_Interface_Edible;

import bai7.thuchanh.Animal_Interface_Edible.animal.Animal;
import bai7.thuchanh.Animal_Interface_Edible.animal.Chicken;
import bai7.thuchanh.Animal_Interface_Edible.animal.Tiger;
import bai7.thuchanh.Animal_Interface_Edible.edible.Edible;
import bai7.thuchanh.Animal_Interface_Edible.fruit.Apple;
import bai7.thuchanh.Animal_Interface_Edible.fruit.Fruit;
import bai7.thuchanh.Animal_Interface_Edible.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2] ;
        animals[0] = new Tiger() ;
        animals[1] = new Chicken();
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange() ;
        fruits[1] = new Apple() ;
        for (Animal animal: animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken){
                Edible edible = (Edible) animal;
                System.out.println(edible.howToEat());
            }
        }
        for (Fruit fruit : fruits ) {
            System.out.println(fruit.howToEat());
        }
    }
}
