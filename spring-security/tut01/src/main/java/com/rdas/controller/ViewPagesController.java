package com.rdas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by rdas on 30/01/2015.
 */
@Controller
public class ViewPagesController {

    /**
     * If URL = /welcome or / , return index.jsp
     */
    @RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
    public ModelAndView indexPage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "SSecurity Tut01");
        model.addObject("message", "welcome !");
        model.setViewName("index");
        return model;
    }

    /**
     *  /admin
     */
    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView adminPage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is protected page!");
        model.setViewName("admin");

        return model;

    }
}
