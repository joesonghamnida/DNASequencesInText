package dna.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by joe on 1/16/17.
 */
@Controller
public class DropdownPostController {

    @RequestMapping(path = "/dropdown", method = RequestMethod.POST)
    public String selectDocument(HttpSession session, String document){
        session.setAttribute("rawText", document);
        return "redirect:/displayResults";
    }
}
