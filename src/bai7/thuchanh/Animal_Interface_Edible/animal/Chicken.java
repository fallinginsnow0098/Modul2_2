package bai7.thuchanh.Animal_Interface_Edible.animal;

import bai7.thuchanh.Animal_Interface_Edible.edible.Edible;

public class Chicken extends  Animal implements Edible {
    public String makeSound() {
        return "Chicken: chuppachup" ;
    }
    public String howToEat() {
        return "could be fried";
    }
}
