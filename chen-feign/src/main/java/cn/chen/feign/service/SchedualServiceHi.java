package cn.chen.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>Tiltle: com.chen.feign.service </p>
 * <p>Description: 负载均衡对应的接口 </p>
 *
 * @Author 陈德元
 * @data: 2017-08-07
 * @version: 1.0
 */
@FeignClient(value = "service-hello")//对应负载控制累的application:name:hello
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
