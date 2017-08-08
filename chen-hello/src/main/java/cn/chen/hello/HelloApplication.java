package cn.chen.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * <p>Tiltle: com.chen.service.hello </p>
 * <p>Description: 测试api网关 </p>
 *
 * @Author 陈德元
 * @data: 2017-08-04
 * @version: 1.0
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }
}
