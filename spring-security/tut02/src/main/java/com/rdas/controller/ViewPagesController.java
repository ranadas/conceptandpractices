package com.rdas.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by rdas on 30/01/2015.
 */
@Controller
public class ViewPagesController {

    private static transient final Logger log = Logger.getLogger(ViewPagesController.class);

    // localhost:8080/
    // localhost:8080/welcome
    @RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
    public ModelAndView indexPage() {
        log.debug("in index, welcome");
        ModelAndView model = new ModelAndView();
        model.addObject("title", "SSecurity Tut01");
        model.addObject("message", "welcome !");
        model.setViewName("index");
        return model;
    }

    // localhost:8080/admin
    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView adminPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is protected page!");
        model.setViewName("admin");
        return model;
    }

    // localhost:8080/dba
    @RequestMapping(value = "/dba**", method = RequestMethod.GET)
    public ModelAndView dbaPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is protected page - Database Page!");
        model.setViewName("admin");
        return model;
    }
}
