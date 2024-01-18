package com.mt.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employee")
public class WelcomeToLandmarkUniversity {
    public static void main(String[] args) {
        // Landmark University Logo
        String logo = "   _       __                     __            _         \n" +
                      "  | |     / /___ _____ ___  ___  / /__  ______ (_)__  _____\n" +
                      "  | | /| / / __ `/ __ `__ \\/ _ \\/ / _ \\/ ___/ / / _ \\/ ___/\n" +
                      "  | |/ |/ / /_/ / / / / / /  __/ /  __/ /  / / /  __/ /    \n" +
                      "  |__/|__/\\__,_/_/ /_/ /_/\\___/_/\\___/_/  /_/_/\\___/_/     \n";

        // Welcome message
        String welcomeMessage = "Welcome to Landmark University!";
        
        // Decorative line
        String decorativeLine = "=======================================";
        
        // Display the welcome message with the decorative presentation
        System.out.println(logo);
        System.out.println(decorativeLine);
        System.out.println(welcomeMessage);
        System.out.println(decorativeLine);
    
}
}
