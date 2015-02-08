package com.rdas.ui.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by rdas on 28/01/2015.
 * https://weblogs.java.net/blog/2007/11/27/annotation-based-configuration-spring
 */
@Controller
public class AngularViewController {

    private static final Logger log = Logger.getLogger(AngularViewController.class);

    @Autowired
    private EmbeddedDatabase database;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * http://localhost:8080/angindex
     * http://blog.teleperformance.com/2013/10/24/got-a-complaint-email-the-ceo/
     * https://www.youtube.com/watch?v=ccPs-MqIGDA
     */
    @RequestMapping(value = "/angindex", method = RequestMethod.GET)
    public String showAngularIndexPage(ModelMap model) {
        log.debug("/hello");
        model.addAttribute("message", "This is redirected from Spring MVC AngularViewController.");
        //JdbcTemplate jdbcTemplate = new JdbcTemplate(database);

        log.debug(jdbcTemplate);
        return "angviews/ang-index"; // will be resolved to WEB-INF/jsp/hello.jsp
    }
}
