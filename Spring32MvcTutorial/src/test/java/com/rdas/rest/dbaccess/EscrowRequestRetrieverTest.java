package com.rdas.rest.dbaccess;

import com.rdas.rest.config.SimpleConfig;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SimpleConfig.class})
@ComponentScan("com.rdas")
@ImportResource("classpath:dispatcher-servlet.xml")
public class EscrowRequestRetrieverTest {

    private static final Logger log = Logger.getLogger(EscrowRequestRetrieverTest.class);

    @Autowired
    private EscrowRequestRetriever escrowRequestRetriever;

    @Before
    public void setUp() throws Exception {
        log.debug("setUp");
    }

    @Test
    public void testGetER() throws Exception {
        log.debug("testGetER");
        assertTrue(escrowRequestRetriever != null);
    }

    @Test
    public void testGetById() throws Exception {
        log.debug("testGetById");
    }
}