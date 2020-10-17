package komputer;

/**
 * Created by Hyperbook on 10/10/2020
 **/
public abstract class Processor {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Processor(String name) {
        this.name = name;
    }
}
