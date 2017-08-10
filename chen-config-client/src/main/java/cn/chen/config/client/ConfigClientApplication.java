package cn.chen.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;


/**
 * <p>Tiltle: cn.chen.config.client </p>
 * <p>Description: TODO(这里来描述信息) </p>
 *
 * @Author 陈德元
 * @data: 2017-08-07
 * @version: 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigClientApplication.class).web(true).run(args);
    }

    /**
     * 检测环境变量
     * @param env
     *//*
    @Autowired
    void setEnviroment(Environment env) {
        System.out.println("from to env: "
                + env.getProperty("foo"));
    }*/
}
