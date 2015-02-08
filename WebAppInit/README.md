Spring (3.2.13.RELEASE) MVC application using WebApplicationInitializer instead of web.xml.
JavaConfig and for Servlet 3 API

Since version 3.1 Spring has Servlet 3 API support.
No need to use web.xml for configuring DispatcherServlet, rather I'll configure it programatically.

Initializer
-----------
All important com.rdas.webappinit.initializer.AppInitializer.

A class that implements WebApplicationInitializer.
Note onStartup() method to add DispatcherServlet to ServletContext.

1. AnnotationConfigWebApplicationContext is created. It's WebApplicationContext implementation that looks for Spring configuration in classes annotated with @Configuration annotation. setConfigLocation() method gets hint in which package(s) to look for them.

2. ContextLoaderListener is added to ServletContext – the purpose of this is to 'glue' WebApplicationContext to the lifecycle of ServletContext.

3. DispatcherServlet is created and initialized with WebApplicationContext we have created, and it's mapped to "/*" URLs and set to eagerly load on application startup.


Configuration
--------------
The main com.rdas.webappinit.config.AppConfig configuration class doesn't much except tells Spring on where to look for its components through @ComponentScan annotation.


The com.rdas.webappinit.config.WebMvcConfig class enables Spring MVC with @EnableWebMvc annotation. It extends WebMvcConfigurerAdapter, which provides empty methods that can be overridden to customize default configuration of Spring MVC.
We will stick to default configuration.