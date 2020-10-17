package zadanieklasaAbstrakcyjna;

/**
 * Created by Hyperbook on 10/10/2020
 **/
public class Rectangle extends Figure{
    int bok1;
    int bok2;

    public int getBok1() {
        return bok1;
    }

    public void setBok1(int bok1) {
        this.bok1 = bok1;
    }

    public int getBok2() {
        return bok2;
    }

    public void setBok2(int bok2) {
        this.bok2 = bok2;
    }

    public Rectangle(int bok1, int bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    @Override
    public void calculateArea() {
        System.out.println(bok1*bok2);
    }

    @Override
    public void calculateCircuit() {
        System.out.println(2*bok1+2*bok2);
    }
}
