package com.tescobank.rbac.rest.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.tescobank.rbac.rest.service",
        "com.tescobank.rbac.rest.repository",
        "com.tescobank.rbac.rest.listener"
})
public class ServiceConfig {
}
