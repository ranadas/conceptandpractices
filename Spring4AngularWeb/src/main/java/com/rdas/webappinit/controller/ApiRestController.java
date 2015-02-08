package com.rdas.webappinit.controller;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rdas.webappinit.utils.DateUtils;

import java.util.Date;
import java.util.Map;

/**
 * Created by rdas on 08/02/2015.
 */
@RestController
public class ApiRestController {
    private static final Logger log = Logger.getLogger(ApiRestController.class);

    @Autowired
    private DateUtils dateUtils;

    //, produces = MediaType.APPLICATION_JSON_VALUE
    //,headers="Accept=application/json"
    @RequestMapping(value = "/showdate.json", method = RequestMethod.GET)
    public @ResponseBody Map<String, String> showDateJson() {
        log.info(dateUtils.getDateWithString());
        return dateUtils.getDateWithString();
    }

    //http://www.programming-free.com/2014/07/crud-springmvc-restful-webservices-angularjs.html
    @RequestMapping(value = "/showdate", method = RequestMethod.GET)
    public Date showDate() {
        log.info(dateUtils.getDateWithString());
        return dateUtils.getDate().toDate();
    }
}
