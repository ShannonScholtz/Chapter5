package za.ac.cput.Chapter5.Behavioural.MementoPattern;

/**
 * Created by student on 2015/03/11.
 */
public class SoccerStarDescription {

    String name;
    String position;
    String fitness;
    int jerseyNumber;
    int weight;





    public SoccerStarDescription(String name, String position, String fitness, int jerseyNumber, int weight) {
        this.name = name;
        this.position = position;
        this.fitness = fitness;
        this.jerseyNumber = jerseyNumber;
        this.weight = weight;
    }

    public void setPostionAndFitnessAndWeight(String position, String fitness, int weight) {
        this.position = position;
        this.fitness = fitness;
        this.weight = weight;
    }

    public Memento save()
    {
        return new Memento(name, position, fitness, jerseyNumber, weight);
    }

    public void reinstate(Object objMemento) {
        Memento memento = (Memento)objMemento;
        name = memento.MementoName;
        position = memento.MementoPosition;
        fitness = memento.MementoFitness;
        jerseyNumber = memento.MementoJerseyNumber;
        weight = memento.MementoWeight;


    }

    public class Memento {
        String MementoName;
        String MementoPosition;
        String MementoFitness;
        int MementoJerseyNumber;
        int MementoWeight;

        public Memento(String name, String position, String fitness, int jerseyNumber, int weight) {
            MementoName = name;
            MementoPosition = position;
            MementoFitness = fitness;
            MementoJerseyNumber = jerseyNumber;
            MementoWeight = weight;
        }


    }
}
