package com.rdas.webappinit.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by rdas on 08/02/2015.
 */
@RestController
public class WelcomeController {
    private static final Logger log = Logger.getLogger(WelcomeController.class);

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView showWelcome() {
        ModelAndView model = new ModelAndView("angwelcome");
        return model;
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.POST)
    public ModelAndView showDateJson() {
        log.info("\n\n --> POST RECEIVED\n\n");
        ModelAndView model = new ModelAndView("angwelcome");
        return model;
    }

}
