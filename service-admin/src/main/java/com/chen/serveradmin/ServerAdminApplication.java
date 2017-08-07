package com.chen.serveradmin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Tiltle: com.chen.serviceadmin </p>
 * <p>Description: 登录首页 </p>
 *
 * @Author 陈德元
 * @data: 2017-08-03
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableDiscoveryClient
public class ServerAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerAdminApplication.class, args);
    }


    @RequestMapping("/hi")
    public String home() {
        return "hi ServerAdminApplication";
    }
}
