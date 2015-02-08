package com.rdas.ui.controller;

import com.rdas.rest.dbaccess.EscrowRequestRetriever;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 * Created by rdas on 24/01/2015.
 */
@Controller
public class IndexController {

    private static final Logger log = Logger.getLogger(IndexController.class);

    @Autowired
    private EscrowRequestRetriever escrowRequestRetriever;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String showHello(ModelMap model) {
        model.addAttribute("message", "Hello! RRana ");
        return "index";
    }
    /**
     * localhost:8080/hello
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        log.debug("/hello");
        model.addAttribute("message", "Hello! This is Spring MVC Web Controller. IndexController (after adding <mvc:annotation-driven/>)");
        escrowRequestRetriever.getById(10L);

        String[] tlds = { "dev", "test" , "arabic"};
        // String to date
        String dateString = "2015-01-21";
        //escrowRequestRetriever.findRequests(getDate(dateString), Arrays.asList(tlds));
        return "hello"; // will be resolved to WEB-INF/jsp/hello.jsp
    }

    private Date getDate(String string) {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        DateTime dt = formatter.parseDateTime(string);
        return dt.toDate();
    }
}
