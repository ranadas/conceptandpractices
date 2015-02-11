Spring (3.2.13.RELEASE) MVC application using WebApplicationInitializer instead of web.xml.
This is same as the one above but has only one Initializer/Configuration class called com.rdas.webappinit.initializer.AppInitializer.




http://fdietz.github.io/recipes-with-angular-js/consuming-external-services/requesting-json-data-with-ajax.html

http://www.javabeat.net/jquery-getjson-example/

http://www.programming-free.com/2014/07/crud-springmvc-restful-webservices-angularjs.html


Apache tiles
https://tiles.apache.org/
http://www.codingpedia.org/ama/spring-mvc-and-apache-tiles-integration-example/
http://icodingclub.blogspot.ie/2013/12/tutorial-tiles-3-with-spring-3-with-jsp.html
http://www.javacodegeeks.com/2013/03/spring-mvc-creation-of-a-simple-controller-with-java-based-config.html

   <!-- Hibernate Validator -->
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-validator</artifactId>
            <version>4.2.0.Final</version>
        </dependency>
<!-- test dependencies -->
        <dependency>
            <groupId>org.hamcrest</groupId>
            <artifactId>hamcrest-all</artifactId>
            <version>1.3</version>
        </dependency>

        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-core</artifactId>
            <version>1.9.5</version>
            <scope>test</scope>
            <exclusions>
                <exclusion>
                    <artifactId>hamcrest-core</artifactId>
                    <groupId>org.hamcrest</groupId>
                </exclusion>
            </exclusions>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-test</artifactId>
            <version>4.1.0.RELEASE</version>
            <scope>test</scope>
        </dependency>

        <!--jackson-->
        <!--
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-core</artifactId>
            <version>2.5.0</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-annotations</artifactId>
            <version>2.5.0</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.5.0</version>
        </dependency>
        -->
        <!--https://github.com/isrsal/spring-mvc-logger-->
        <!--
        <dependency>
            <groupId>com.github.isrsal</groupId>
            <artifactId>spring-mvc-logger</artifactId>
            <version>0.2</version>
            <exclusions>
                <exclusion>
                    <artifactId>servlet-api</artifactId>
                    <groupId>javax.servlet</groupId>
                </exclusion>
                <exclusion>
                    <artifactId>slf4j-log4j12</artifactId>
                    <groupId>org.slf4j</groupId>
                </exclusion>
            </exclusions>
        </dependency>
        -->