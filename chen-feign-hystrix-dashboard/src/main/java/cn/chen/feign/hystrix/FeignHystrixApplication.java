package cn.chen.feign.hystrix;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * <p>Tiltle: cn.chen.fegin.hystrix </p>
 * <p>Description: @EnableCircuitBreaker或@EnableHystrix注解开启Hystrix的使用 </p>
 *  @SpringCloudApplication注解来修饰应用主类，
 *  该注解的具体定义如下所示。我们可以看到该注解中包含了上我们所引用的三个注解，
 *  这也意味着一个Spring Cloud标准应用应包含服务发现以及断路器
 * @Author 陈德元
 * @data: 2017-08-09
 * @version: 1.0
 */
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@EnableHystrixDashboard
public class FeignHystrixApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(FeignHystrixApplication.class).web(true).run(args);
    }
}
