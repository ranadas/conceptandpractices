package com.rdas.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * Created by rdas on 28/01/2015.
 */
@Configuration
@PropertySource({ "classpath:postgresqldb.properties" })
public class DatabaseConfig {
    @Autowired
    private Environment env;

    /**
     * http://stackoverflow.com/questions/24960817/spring-migrating-database-configuration-from-xml-file-to-annotation
     * @return
     */
    @Bean
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
        dataSource.setUrl(env.getProperty("jdbc.url"));
        dataSource.setUsername(env.getProperty("jdbc.username"));
        dataSource.setPassword(env.getProperty("jdbc.password"));
        return dataSource;
    }

    @Bean
    public DataSource getHsqlDataSource() {
        return null;
    }

    @Bean
    public EmbeddedDatabase embeddedDatabase() {
//        database = new EmbeddedDatabaseBuilder().addDefaultScripts().build();
//        return new EmbeddedDatabaseBuilder().build();
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.HSQL).addScript("classpath:init.sql").build();
    }

    //http://blogs.sourceallies.com/2011/08/spring-injection-with-resource-and-autowired/
    @Bean
    public JdbcTemplate jdbcTemplate () {
        return new JdbcTemplate(dataSource());
    }
}
