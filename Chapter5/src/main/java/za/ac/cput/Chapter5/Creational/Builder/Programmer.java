package za.ac.cput.Chapter5.Creational.Builder;

/**
 * Created by student on 2015/03/12.
 */
public class Programmer {

    private String eat;
    private String sleep;
    private String code;
    private String fitness;

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFitness() {
        return fitness;
    }

    public void setFitness(String fitness) {
        this.fitness = fitness;
    }

    @Override
    public String toString() {
        return "Eat: " + eat + ", Sleep: " + sleep + ", Code: " + code + ", Fitness: " + fitness ;
    }


}
