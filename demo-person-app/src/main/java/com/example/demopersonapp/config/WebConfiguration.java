package com.example.demopersonapp.config;


//Configuration for the H2 In Memory Database Console

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.h2.server.web.WebServlet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class WebConfiguration {
    @Bean
    ServletRegistrationBean h2servletRegistration(){
       // Map<Object,Integer> mapEx = new HashMap<String,Integer>();
        List<String> lst;
        lst.stream().f
        Map<String,Integer> mapEx = new HashMap<>();
        mapEx.put("AB",120);
        mapEx.put("CD",33);
        mapEx.put("EF",43);





        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }
}