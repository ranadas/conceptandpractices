package com.rdas.controller;

import com.google.common.collect.Maps;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rdas.webappinit.utils.DateUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

/**
 * Created by rdas on 08/02/2015.
 */
@RestController
public class RestApiController {
    private static final Logger log = Logger.getLogger(RestApiController.class);

    @Autowired
    private DateUtils dateUtils;

    @Autowired
    private JdbcTemplate jdbcTemplate;

//    @Resource
//    private EmailSubjectRepository emailSubjectRepository;

    // @RequestMapping(value = "/approve", method = RequestMethod.POST,
    // produces = MediaType.APPLICATION_JSON_VALUE,
    // consumes = MediaType.APPLICATION_JSON_VALUE)

    // , produces = MediaType.APPLICATION_JSON_VALUE
    // ,headers="Accept=application/json"
    @RequestMapping(value = "/showdate.json", method = RequestMethod.GET)
    public @ResponseBody Map<String, String> showDateJson() {
        log.info(dateUtils.getDateWithString());
        return dateUtils.getDateWithString();
    }

    // http://www.programming-free.com/2014/07/crud-springmvc-restful-webservices-angularjs.html
    @RequestMapping(value = "/showdate", method = RequestMethod.GET)
    public Date showDate() {
        log.info(dateUtils.getDateWithString());
        return dateUtils.getDate().toDate();
    }

    @RequestMapping(value = "/subjects.json", method = RequestMethod.GET)
    public @ResponseBody Map<String, String> subjectsJson() {
        Map<String, String> subjects = Maps.newConcurrentMap();
        subjects.put("bug", "Report a Bug");
        subjects.put("account", "Account Problems");
        subjects.put("mobile", "Mobile");
        subjects.put("user", "Report a Malicious User");
        subjects.put("other", "Other");
        subjects.put("fwd", "Forward");
        subjects.put("fwd-all", "Forward All");

        return subjects;
    }
}
