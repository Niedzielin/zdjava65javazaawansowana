package zadanie1dziedziczenie;

/**
 * Created by Hyperbook on 10/10/2020
 **/
public class Dog extends Animal {


    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog(String name, Integer age, String race, String color) {
        super(name, age, race);
        this.color = color;
    }
    @Override
    protected String makeSound() {
        return "woofwoof";
    }
}
