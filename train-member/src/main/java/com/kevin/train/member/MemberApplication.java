package com.kevin.train.member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-11-15 17:02
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.kevin.train"})
public class MemberApplication {
    private static final Logger LOG = LoggerFactory.getLogger(MemberApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MemberApplication.class);
        Environment environment = app.run(args).getEnvironment();
        LOG.info("member模块启动成功！");
        LOG.info("member地址：\thttp://127.0.0.1:{}{}", environment.getProperty("server.port"), environment.getProperty("server.servlet.context-path"));
    }
}
