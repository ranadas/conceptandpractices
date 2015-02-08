package com.rdas.rest.config;

import org.apache.commons.dbcp.BasicDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by rdas on 24/01/2015.
 */
@Configuration
@EnableTransactionManagement
@PropertySource({ "classpath:postgresqldb.properties" })
@ComponentScan({ "com.rdas.rest.model" })
public class SimpleConfig {



}
