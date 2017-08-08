####注解说明
>这里用了@SpringCloudApplication注解，之前没有提过，通过源码我们看到，它整合了@SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreaker，主要目的还是简化配置。

* 新增api网关的异常处理
api网关流程图<br/>
![api网关](../image/api-gateway.jpg)
