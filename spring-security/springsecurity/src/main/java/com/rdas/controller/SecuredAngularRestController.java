package com.rdas.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rdas on 29/01/2015.
 * //@RequestMapping("/todos")
 * https://github.com/philipsorst/angular-rest-springsecurity
 */
@RestController
public class SecuredAngularRestController {
    private static final Logger log = Logger.getLogger(SecuredAngularRestController.class);

    // http://localhost:8080/unseq-index
    @RequestMapping(value = "/unseq-index", method = RequestMethod.GET)
    public String showUnsecuredAngularIndex(ModelMap model) {
        return "ang-index";
    }

    // http://localhost:8080/showdate
    @RequestMapping(value = "/showdate.json", method = RequestMethod.GET)
    public @ResponseBody String showDateJson() {
        DateTime dateTime = new DateTime();
        DateTimeFormatter formatter = DateTimeFormat.forPattern("M|d|yyyy(hh:mm)");
        String s =  String.format("Current system time is %s", formatter.print(dateTime.getMillis()));
        log.info(s);
        return s;
    }

    // returns 406 ????
    @RequestMapping("/showdate")
    public Map<String,Object> home() {
        Map<String,Object> model = new HashMap<String,Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
        DateTime dateTime = new DateTime();
        DateTimeFormatter formatter = DateTimeFormat.forPattern("M|d|yyyy(hh:mm)");
        String s =  String.format("Current system time is %s", formatter.print(dateTime.getMillis()));

        model.put("date", s);
        return model;
    }

    private Date getDate(String string) {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm");
        if (StringUtils.isNotBlank(string)) {
            DateTime dt = formatter.parseDateTime(string);
            return dt.toDate();
        } else {
            return new Date();
        }
    }
}
