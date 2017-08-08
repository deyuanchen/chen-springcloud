package cn.chen.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>Tiltle: cn.chen.eureka </p>
 * <p>Description: 服务注册中心 </p>
 *
 * @Author 陈德元
 * @data: 2017-08-03
 * @version: 1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
