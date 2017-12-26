package org.happyman.springboot.demo.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by Administrator on 2017/12/11.
 * @author Administrator
 * @date
 */
@ComponentScan
@Controller
@RequestMapping("/")
public class HomeController {

    private static final Log LOG = LogFactory.getLog(HomeController.class);

    @ResponseBody
    @RequestMapping("")
    public String index() {
        LOG.debug("home.index..............................");
        return "home.index";
    }

    @RequestMapping("/home")
    public String home() {
        LOG.debug("home.default.............................");
        return "/home/test";
    }


    /**
     * 以下测试spring-boot对jsp页面的支持
     * 该模式和thymeleaf不能同时存在,否则会报找不到视图的错误
     * pom.xml需要去掉以下依赖项：
     * <dependency>
     *      <groupId>org.springframework.boot</groupId>
     *      <artifactId>spring-boot-starter-thymeleaf</artifactId>
     * </dependency>
     * 并且增加以下依赖项：
     *   <dependency>
     *      <groupId>org.apache.tomcat.embed</groupId>
     *      <artifactId>tomcat-embed-jasper</artifactId>
     *      <version>8.5.6</version>
     *      <!--  <scope>provided</scope>-->
     *   </dependency>
     *   <!--对jstl支持的 libs-->
     *   <dependency>
     *      <groupId>javax.servlet</groupId>
     *      <artifactId>jstl</artifactId>
     *      <version>1.2</version>
     *   </dependency>
     * application.properties中需要配置视图存放目录：
     * spring.mvc.view.prefix=/WEB-INF/views
     * spring.mvc.view.suffix=.jsp
     * @return
     */
    @RequestMapping("/test")
    public ModelAndView test() {
        ModelAndView mav = new ModelAndView("/home/test");
        // 注意，向jsp页面传递的参数名称不能包含点“.”,比如:"model.value"这样的名称会报标签错误，因此需要改成model_value
        mav.addObject("model_value", "this is value from model");
        return mav;
    }

}
