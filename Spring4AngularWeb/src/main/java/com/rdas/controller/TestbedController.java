package com.rdas.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rdas.webappinit.utils.DateUtils;

/**
 * Created by rdas on 10/02/2015.
 */
@Controller
public class TestbedController {
    private static final Logger log = Logger.getLogger(TestbedController.class);

    @Autowired
    private DateUtils dateUtils;

    @RequestMapping(value = "/testbed", method = RequestMethod.GET)
    public ModelAndView showIndex(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView model = new ModelAndView("angulartestbed");
        model.addObject("msg", "hello world!");
        return model;
    }

    // returns 406 ????
    @RequestMapping("/showdate")
    public Map<String, Object> home() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
        model.put("date", dateUtils.getDateWithString());
        return model;
    }
}
