package com.rdas.webappinit.controller;

import com.rdas.webappinit.utils.DateUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Map;

/**
 * Created by rdas on 08/02/2015.
 */
@RestController
public class WelcomeController {
    private static final Logger log = Logger.getLogger(WelcomeController.class);

    @Autowired
    private DateUtils dateUtils;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DataSource dataSource;

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView showWelcome() {
        ModelAndView model = new ModelAndView("welcome");
        return model;
    }

    // https://www.lullabot.com/blog/article/processing-forms-angularjs
    //http://developersguild.org/2014/11/01/november-meeting-data-entry-forms-in-angularjs/
    @RequestMapping(value = "/welcome", method = RequestMethod.POST)
    public @ResponseBody Map<String, String> showDateJson() throws SQLException {
        log.info("\n\n --> POST @ welcome RECEIVED\n\n");
        // ModelAndView model = new ModelAndView("welcome");
        // return model;
        log.info(jdbcTemplate);
        log.info(dataSource.getConnection().toString());
        return postProcess();
    }

    private Map<String, String> postProcess() {
        Map map = dateUtils.getDateWithString();
        map.put("status", "OK");
        return map;
    }
}
