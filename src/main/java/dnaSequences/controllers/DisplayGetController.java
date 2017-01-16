package dnaSequences.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

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
    public String displayResults(HttpSession session,Model model){
        String convertedText = (String) session.getAttribute("convertedText");

        //TODO: modules for comparisons here

        String results = "this is for testing purposes";
        model.addAttribute("results",results);
        return ("home");
    }
}
