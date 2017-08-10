package cn.chen.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * <p>Tiltle: cn.chen.zipkin </p>
 * <p>Description: 消息追踪 </p>
 *
 * @Author 陈德元
 * @data: 2017-08-10
 * @version: 1.0
 */
@SpringBootApplication
@EnableZipkinServer
@EnableEurekaClient
public class ZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }
}

