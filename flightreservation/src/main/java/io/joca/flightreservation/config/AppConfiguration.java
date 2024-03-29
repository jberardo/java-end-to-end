package io.joca.flightreservation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfiguration {

@Bean
public WebMvcConfigurer corsConfigurer() {

    return new WebMvcConfigurer() {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedOrigins("http://localhost:4200")
                    .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD", "OPTIONS")
                    .allowedHeaders("Content-Type", "Date", "Total-Count", "loginInfo")
                    .exposedHeaders("Content-Type", "Date", "Total-Count", "loginInfo")
                    .maxAge(3600);
        }
    };
}}