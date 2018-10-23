package com.xx7.shoemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@ComponentScan(basePackages = {"com.xx7.shoemanager"})
public class ShoemanagerApplication extends WebMvcConfigurerAdapter{


    public static void main(String[] args) {
        SpringApplication.run(ShoemanagerApplication.class, args);
    }
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/", "/shoeList");
    }
}
