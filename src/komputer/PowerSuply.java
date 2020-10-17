package komputer;

/**
 * Created by Hyperbook on 10/10/2020
 **/
public abstract class PowerSuply {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PowerSuply(String name) {
        this.name = name;
    }
}
