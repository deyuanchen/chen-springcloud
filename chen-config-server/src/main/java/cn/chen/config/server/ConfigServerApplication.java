package cn.chen.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>Tiltle: cn.chen.config.server </p>
 * <p>Description: 新增@EnableDiscoveryClient注解，
 * 用来将config-server注册到上面配置的服务注册中心上去
 * 和@EnableEurekaClient 注解一样的作用
 *
 * </p>
 *
 * @Author 陈德元
 * @data: 2017-08-08
 * @version: 1.0
 */
@EnableConfigServer
@SpringBootApplication
@EnableEurekaClient
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
