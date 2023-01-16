/**
 * @author Aymen Chaabani
 * @date 2 janv. 2023
 * @fileName WebConfig.java
 *
 */
package com.eCommerce.app.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 
 */
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
        .allowedOrigins("*","http://internal-LBA-1495990277.us-east-1.elb.amazonaws.com")
        .allowedMethods("*");
    }
}
