package com.techview365.usermodular.security;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {

    /**
     * Adds CORS mappings to allow cross-origin requests.
     *
     * @param registry the CorsRegistry to configure.
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Allow CORS requests to all endpoints
                .allowedOrigins("*") // Allow requests from any origin
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allow specified HTTP methods
                .allowedHeaders("*") // Allow all headers
                .allowCredentials(true); // Allow credentials (e.g., cookies)
    }
}
