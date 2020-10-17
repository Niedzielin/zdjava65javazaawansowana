package zadanie1dziedziczenie;

/**
 * Created by Hyperbook on 10/10/2020
 **/
public abstract class Animal {
    private String name;
    private Integer age;
    private String race;


    public Animal(String name, Integer age, String race) {
        this.name = name;
        this.age = age;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    protected abstract String makeSound();
}
