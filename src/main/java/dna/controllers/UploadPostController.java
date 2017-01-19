package dna.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

import dna.converters.*;

/**
 * Created by joe on 1/15/17.
 */

@Controller
public class UploadPostController {

    @RequestMapping(path="/upload", method = RequestMethod.POST)
    public String uploadDocument(HttpSession session, String document){
        session.setAttribute("rawText",document);

        return "redirect:/displayResults";
    }
}
