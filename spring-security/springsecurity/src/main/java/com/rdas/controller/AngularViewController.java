package com.rdas.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//@Formatter:off
/**
 * Created by rdas on 28/01/2015.
 * https://weblogs.java.net/blog/2007/11/27/annotation-based-configuration-spring
 */
//@Formatter:on
@Controller
public class AngularViewController {
    private static final Logger log = Logger.getLogger(AngularViewController.class);

    /**
     * http://localhost:8080/angindex http://blog.teleperformance.com/2013/10/24/got-a-complaint-email-the-ceo/
     * https://www.youtube.com/watch?v=ccPs-MqIGDA
     */
    @RequestMapping(value = "/angindex", method = RequestMethod.GET)
    public ModelAndView showAngularIndexPage() {
        log.debug("/hello");
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security 3.2.3 Hello World");
        // model.addAttribute("message", "This is redirected from Spring MVC AngularViewController.");
        model.addObject("message", "This is redirected from Spring MVC AngularViewController.");
        model.setViewName("ang-todo-dash");
        return model;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView showUnsecuredAngularIndexPage() {
        log.debug("/index");
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Hello World");
        // model.addAttribute("message", "Rredirected from Spring MVC AngularViewController.");
        model.addObject("message", "This is redirected from Spring MVC AngularViewController.");
        model.setViewName("ang-todo-dash");
        return model;
    }

    // http://localhost:8080/navmenu
    @RequestMapping(value = "/navmenu", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelAndView showNavigationMenuPage() {
        log.debug("/navmenu");
        ModelAndView model = new ModelAndView();
        model.addObject("message", "Redirected from AngularViewController.showNavigationMenuPage");
        model.setViewName("ang-navmenu");
        return model;
    }

    // http://localhost:8080/order
    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public ModelAndView showOrderFormPage() {
        log.debug("/order");
        ModelAndView model = new ModelAndView();
        model.setViewName("ang-orderform");
        return model;
    }
}
