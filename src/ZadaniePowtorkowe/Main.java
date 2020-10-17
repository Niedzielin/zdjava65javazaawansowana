package ZadaniePowtorkowe;

/**
 * Created by Hyperbook on 10/10/2020
 **/
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda", "Rx8");
        Car car2 = new Car("Alfa Romeo", "156");
        Car cars[] = {car1, car2};
        for (Car c : cars) {
            System.out.println(c.toString());
        }
    }
}
