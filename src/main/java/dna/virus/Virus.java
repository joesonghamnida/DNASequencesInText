package dna.virus;

/**
 * Created by joe on 1/20/17.
 */
public class Virus {

    String name;
    String sequence;

    public Virus() {
    }

    public Virus(String name, String sequence) {
        this.name = name;
        this.sequence = sequence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
}
