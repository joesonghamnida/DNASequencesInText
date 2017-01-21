package dna.controllers;

import dna.tools.CheckFileType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

import dna.converters.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * Created by joe on 1/15/17.
 */

@Controller
public class UploadPostController {

    //TODO: security concerns?
    //TODO: fix issue with reading docs in and getting text
    @RequestMapping(path="/upload", method = RequestMethod.POST)
    public String uploadDocument(HttpSession session, MultipartFile document){

        //CheckFileType.checkFileType(document);
        String convertedDocument = document.toString();

        session.setAttribute("rawText", convertedDocument);

        return "redirect:/displayResults";
    }
}
