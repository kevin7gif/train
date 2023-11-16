package com.kevin.train.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-11-16 8:59
 */
@SpringBootApplication
public class GatewayApplication {
    private static final Logger LOG = LoggerFactory.getLogger(GatewayApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(GatewayApplication.class);
        Environment environment = app.run(args).getEnvironment();
        LOG.info("gateway模块启动成功！");
        LOG.info("网关地址：\thttp://127.0.0.1:{}",environment.getProperty("server.port"));
    }
}
