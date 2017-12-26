package org.happyman.springboot.demo;

import com.sun.jersey.spi.container.servlet.ServletContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * SpringbootDemoApplication
 * @author Administrator
 */
@SpringBootApplication
@EnableAutoConfiguration
public class SpringbootDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
        //new SpringApplicationBuilder(SpringbootDemoApplication.class).web(true).run(args);
	}

}


/*
https://github.com/hzzhangfan/spring-boot/blob/1.5.x/spring-boot-samples/spring-boot-sample-jersey1
 */
