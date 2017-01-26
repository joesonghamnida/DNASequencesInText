package dna.controllers;

import dna.tools.CheckFileType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dna.converters.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by joe on 1/15/17.
 */

@Controller
public class UploadPostController {

    //TODO: security concerns?
    //TODO: fix issue with reading docs in and getting text
    @RequestMapping(path="/upload", method = RequestMethod.POST)
    public String uploadDocument(HttpSession session, MultipartFile document)throws IOException{

        //ways that didn't work
        //CheckFileType.checkFileType(document);
        //int convertedDocument = document.getInputStream().read();
        //String convertedDocument = request.getInputStream().toString();
        //System.out.println(convertedDocument);
        //possibly use temp file on tomcat server?
        //MultipartResolver resolver

        File dir = new File("./");
        dir.mkdirs();

        File f = File.createTempFile("file", document.getOriginalFilename(), dir);
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(document.getBytes());

        session.setAttribute("rawText", document.getOriginalFilename());

        return "redirect:/displayResults";
    }
}
