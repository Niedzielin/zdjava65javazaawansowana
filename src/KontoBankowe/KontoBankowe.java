package KontoBankowe;

/**
 * Created by Hyperbook on 10/17/2020
 **/
public class KontoBankowe {
    private long numerKonta;
    private int stanKonta;

    private long getNumerKonta() {
        return numerKonta;
    }

    private void setNumerKonta(long numerKonta) {
        this.numerKonta = numerKonta;
    }

    private int getStanKonta() {
        return stanKonta;
    }

    private void setStanKonta(int stanKonta) {
        this.stanKonta = stanKonta;
    }

    public KontoBankowe(long numerKonta, int stanKonta) {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
    }
    public void wyswietlStanKonta(){
        System.out.println(getStanKonta());
    }
    public int wplacSrodki(int kwota){
        setStanKonta(stanKonta+kwota);
        return stanKonta;
    }
    public int pobierzSrodki(int kwota){
        setStanKonta(stanKonta-kwota);
        return stanKonta;
    }
}
