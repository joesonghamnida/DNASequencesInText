package dna.tools;

import dna.virus.Virus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by joe on 1/20/17.
 */
public class ReadVirusFromFile {

    public static ArrayList<Virus> readVirusFromFile() throws FileNotFoundException {

        ArrayList<Virus> viruses = new ArrayList<>();

        File f = new File("viruses.csv");
        Scanner fileScanner = new Scanner(f);
        String line = fileScanner.nextLine();

        while (fileScanner.hasNext()) {
            line = fileScanner.nextLine();
            String[] columns = line.split(",");
            Virus virus = new Virus(columns[0], columns[1]);
            viruses.add(virus);
        }
        return viruses;
    }
}

//ebola https://www.ebi.ac.uk/ena/data/view/AAA42976
//polio https://www.ebi.ac.uk/ena/data/view/CAA24457
//hep bhttps://www.ebi.ac.uk/ena/data/view/ANP44183
//flu https://www.ebi.ac.uk/ena/data/view/AAB93959
//swine fever https://www.ebi.ac.uk/ena/data/view/AAA65303