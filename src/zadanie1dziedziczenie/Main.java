package zadanie1dziedziczenie;

/**
 * Created by Hyperbook on 10/10/2020
 **/
public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("kotełe", 5, "Norweski kot leśny");
        System.out.println(cat.getName() + " ma " + cat.getAge() + " lat i jest rasy " + cat.getRace());
        Dog dog = new Dog("Dakar", 6, "Rottweiler", "Czarny");
        dog.setColor("wyjebiście fioletowy");
        System.out.println("najlepszym psem jest " + dog.getName() + " aktualnie ma " + dog.getAge() + " lat jest rasy "
                + dog.getRace() + " a jego kolor to " + dog.getColor());
        System.out.println(cat.makeSound());
    }
}
