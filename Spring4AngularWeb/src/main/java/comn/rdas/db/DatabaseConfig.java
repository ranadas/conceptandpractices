package comn.rdas.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

/**
 * Created by rdas on 08/02/2015.
 */
@Configuration
public class DatabaseConfig {

    @Autowired
    private Environment env;

    @Bean
    public EmbeddedDatabase embeddedDatabase() {
//        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.HSQL).build();
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.HSQL).addScript("classpath:init.sql").build();
    }

    //http://blogs.sourceallies.com/2011/08/spring-injection-with-resource-and-autowired/
    @Bean
    public JdbcTemplate jdbcTemplate () {
        return new JdbcTemplate(embeddedDatabase());
    }
}
