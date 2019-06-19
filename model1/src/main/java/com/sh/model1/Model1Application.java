package com.sh.model1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class Model1Application {

    public static void main(String[] args) {
        SpringApplication.run(Model1Application.class, args);
    }

    @Bean
    public ServletRegistrationBean sysOperateLoggerFilterRegistration() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new DispatcherServlet());
        bean.addUrlMappings("/");
        bean.setName("spring");
        bean.addInitParameter("result-request-header", "x-requested-with=XMLHttpRequest;REQUEST_HEADER=binary-http-client-header");
        bean.setOrder(1);
        return bean;
    }
}
