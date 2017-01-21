package dna.controllers;

import dna.converters.ConvertTextToSequence;
import dna.result.Result;
import dna.statistics.SequenceSimilarities;
import dna.tools.MatchSequenceSize;
import dna.tools.ReadVirusFromFile;
import dna.tools.ReturnDocument;
import dna.virus.Virus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by joe on 1/15/17.
 */
@Controller
public class DisplayGetController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(){
        return ("home");
    }

    @RequestMapping(path="/displayResults", method = RequestMethod.GET)
    public String displayResults(HttpSession session,Model model)throws FileNotFoundException{
        String rawText = (String) session.getAttribute("rawText");
        String docName = rawText;
        String document = "";

        try{
            document = ReturnDocument.returnDocument(docName);
        }
        catch(Exception FileNotFound){
            document = rawText;
        }

        String documentSequence = ConvertTextToSequence.convertTextToSequence(document);
        ArrayList<Virus> viruses = ReadVirusFromFile.readVirusFromFile();
        MatchSequenceSize.matchSequenceSize(documentSequence,viruses);
        ArrayList<Result> results = SequenceSimilarities.calculateSimilarities(docName,documentSequence,viruses);

        model.addAttribute("results",results);
        return ("home");
    }
}
