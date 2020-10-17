package zadanieklasaAbstrakcyjna;

/**
 * Created by Hyperbook on 10/10/2020
 **/
public class Triangle extends Figure{
    double bokA;
    double bokB;
    double bokC;
    double s ;
    double area ;

    public double getArea() {
        return area;
    }

    public double getBokA() {
        return bokA;
    }

    public double getBokC() {
        return bokC;
    }

    public void setBokC(double bokC) {
        this.bokC = bokC;
    }

    public void setBokA(double bokA) {
        this.bokA = bokA;
    }

    public double getBokB() {
        return bokB;
    }

    public void setBokB(double bokB) {
        this.bokB = bokB;
    }

    public Triangle(double bokA, double bokB,double bokC) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
    }

    @Override
    public void calculateArea() {
        s = 0.5*(bokA+bokB+bokC);
        area = Math.sqrt(s*(s-bokA)*(s-bokB)*(s-bokC));
        System.out.println("pole trokata wynosi "+ area);
    }

    @Override
    public void calculateCircuit() {

    }
}
