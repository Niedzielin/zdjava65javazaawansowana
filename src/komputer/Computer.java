package komputer;

/**
 * Created by Hyperbook on 10/10/2020
 **/
public class Computer  {
    Processor processor;
    GraphicCard graphicCard;
    PowerSuply powerSuply;

    public Computer(GraphicCard graphicCard, PowerSuply powerSuply, Processor processor) {
        this.processor =  processor;
        this.graphicCard = graphicCard;
        this.powerSuply = powerSuply;
    }

    public Computer() {

    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public PowerSuply getPowerSuply() {
        return powerSuply;
    }

    public void setPowerSuply(PowerSuply powerSuply) {
        this.powerSuply = powerSuply;
    }



    @Override
    public String toString(){
        return graphicCard.getName()+ " "+processor.getName()+" "+powerSuply.getName();
    }

}
