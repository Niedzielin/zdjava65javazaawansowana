package zadanie1dziedziczenie;

/**
 * Created by Hyperbook on 10/10/2020
 **/
public class Cat extends Animal {


    public Cat(String name, Integer age, String race) {
        super(name, age, race);
    }

    @Override
    protected String makeSound() {
        return "miaaaaaaaaau";
    }
}
