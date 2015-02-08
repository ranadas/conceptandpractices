package com.rdas.webappinit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String returnIndexJson() {
        return "Hello world";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView showIndex(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView model = new ModelAndView("index");
        model.addObject("msg", "hello world!");
        return model;
    }
}