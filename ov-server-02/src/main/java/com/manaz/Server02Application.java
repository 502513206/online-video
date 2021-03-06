package com.manaz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zxw
 * @date 2020/7/16 22:28
 */
@SpringBootApplication
@EnableEurekaServer
public class Server02Application {
    public static void main(String[] args) {
        SpringApplication.run(Server02Application.class, args);
    }
}
