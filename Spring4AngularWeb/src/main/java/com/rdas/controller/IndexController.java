package com.rdas.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
class IndexController {
    private static final Logger log = Logger.getLogger(IndexController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String returnIndexJson() {
        log.debug("returnIndexJson");
        return "Hello world (json)";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView showWelcome() {
        ModelAndView model = new ModelAndView("index");
        return model;
    }
}