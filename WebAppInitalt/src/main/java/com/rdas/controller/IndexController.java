package com.rdas.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
class IndexController {

    private static final Logger log  = Logger.getLogger(IndexController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String returnIndexJson() {
        log.debug("returnIndexJson");
        return "Hello world";
    }


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView showIndex(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView model = new ModelAndView("index");
        model.addObject("msg", "hello world!");
        return model;
    }
}