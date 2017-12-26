package org.happyman.springboot.demo.config;

import com.sun.jersey.spi.container.servlet.ServletContainer;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 针对Jersey 1.x的spring-boot兼容配置
 * Created by Administrator on 2017/12/25.
 * @author Administrator
 */
@Configuration
@EnableAutoConfiguration
public class Jersey1xRestConfig {
    @Bean
    public FilterRegistrationBean jersey() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new ServletContainer());

        bean.addInitParameter(
                "com.sun.jersey.config.property.packages",
                "org.happyman.springboot.demo.rest.resources;com.fasterxml.jackson.jaxrs.json");
//        bean.addInitParameter("com.sun.jersey.api.json.POJOMappingFeature", "true"); // jersey支持json输出的配置项
        bean.addUrlPatterns("/rest/*");
        bean.setName("rest");


        return bean;
    }

}
