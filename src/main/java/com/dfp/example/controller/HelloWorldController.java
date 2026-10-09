package com.dfp.example.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping
    @RequestMapping(value = "/*",produces = MediaType.TEXT_HTML_VALUE)
    public String helloServer() {

        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>Trianz - Concierto.cloud</title>\n" +
                "</head>\n" +
                "<style>" +
                "body {" +
                "    margin: 0;" +
                "    background:" +
                "        url('/images/background.png') no-repeat center top," +
                "        #000000;" +
                "    background-size: 100% auto;" +
                "}" +
                "</style>" +
                "<body>\n" +
                " <div style=\"background-color: black; padding: 35px;padding: 10px;\"><img src=\"/images/concierto-logo.png\"/></div>\n" +
                "    <div style=\"height: 250px\"></div>\n" +
                "<div>\n" +
                "    <center>\n" +
                "    <h1 style=\"color: white;font-size: 40px\">Welcome to AWS Atlanta Workshop Test Application.</h1>\n" +
                "    </center>    \n" +
                "</div>\n" +
                "</body>\n" +
                "</html>";
    }

}
