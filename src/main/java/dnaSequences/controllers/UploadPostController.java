package dnaSequences.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dnaSequences.dna.*;

import javax.servlet.http.HttpSession;

/**
 * Created by joe on 1/15/17.
 */

@Controller
public class UploadPostController {

    @RequestMapping(path="/upload", method = RequestMethod.POST)
    public String uploadDocument(HttpSession session, String document){
        String convertedText = ConvertTextToSequence.convertTextToSequence(document);
        session.setAttribute("convertedText",convertedText);

        return "redirect:/displayResults";
    }
}
