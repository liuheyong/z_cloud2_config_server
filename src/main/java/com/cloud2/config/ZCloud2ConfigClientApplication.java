package com.cloud2.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ZCloud2ConfigClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ZCloud2ConfigClientApplication.class).web(true).run(args);
    }

}
