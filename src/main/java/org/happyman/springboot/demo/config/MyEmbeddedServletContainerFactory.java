package org.happyman.springboot.demo.config;

import org.apache.catalina.connector.Connector;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.context.embedded.EmbeddedServletContainer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/12/11.
 * @author
 */
@Component
public class MyEmbeddedServletContainerFactory extends TomcatEmbeddedServletContainerFactory {

    private static final Log LOG = LogFactory.getLog(MyEmbeddedServletContainerFactory.class);

    @Override
    public EmbeddedServletContainer getEmbeddedServletContainer(ServletContextInitializer... initializers) {
        //  这里可以设置tomcat端口,如：this.setPort(8081),或者通过application.properties设置

        return super.getEmbeddedServletContainer(initializers);
    }

    @Override
    protected void customizeConnector(Connector connector) {
        super.customizeConnector(connector);
        LOG.debug("customizeConnector...................");

        Http11NioProtocol protocol = (Http11NioProtocol)connector.getProtocolHandler();
        // 设置最大连接数
        protocol.setMaxConnections(2000);
        // 设置最大线程数
        protocol.setMaxThreads(200);
        protocol.setConnectionTimeout(30000);
    }
}
