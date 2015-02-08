package com.rdas.ui.controller;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static junit.framework.TestCase.assertNotNull;


/**
 * Created by rdas on 28/01/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/test/resources/springDispatcher-test.xml"})
public class IndexControllerTest {
    private static final Logger log = Logger.getLogger(IndexControllerTest.class);

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @InjectMocks
    private IndexController indexController;

    @Before
    public void setup () {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();
    }
    //http://geowarin.github.io/2013/01/23/complete-example-of-a-spring-mvc-3-2-project/
    @Test
    public void getHome() throws Exception {
        log.debug("get Home");
        assertNotNull(mockMvc);
    }
}
