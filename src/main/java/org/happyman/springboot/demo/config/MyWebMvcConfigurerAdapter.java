package org.happyman.springboot.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2017/12/11.
 * @author Administrator
 */
@Configuration
public class MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        /* TODO: 这里可以配置控制器和视图的路由，例如：registry.addViewController("/hello").setViewName("/hello"); */
        super.addViewControllers(registry);

    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /*registry.addResourceHandler("/**");
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static");*/
        super.addResourceHandlers(registry);
    }
}
