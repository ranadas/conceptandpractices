package com.rdas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @RequestMapping(value = { "/", "/helloworld**" }, method = RequestMethod.GET)
    public ModelAndView welcomePage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security 3.2.3 Hello World Application");
        model.addObject("message", "Welcome Page !");
        model.setViewName("sample/helloworld");
        return model;
    }

    @RequestMapping(value = "/protected**", method = RequestMethod.GET)
    public ModelAndView protectedPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security 3.2.3 Hello World");
        model.addObject("message", "This is protected page - Only for Administrators !");
        model.setViewName("sample/protected");
        return model;
    }

    @RequestMapping(value = "/confidential**", method = RequestMethod.GET)
    public ModelAndView superAdminPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security 3.2.3 Hello World");
        model.addObject("message", "This is confidential page - Need Super Admin Role !");
        model.setViewName("sample/protected");
        return model;
    }
}
