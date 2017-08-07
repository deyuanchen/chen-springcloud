package com.chen.service.hello.web;

import com.netflix.zuul.context.RequestContext;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

/**
 * <p>Tiltle: com.chen.service.hello.web </p>
 * <p>Description: TODO(这里来描述信息) </p>
 *
 * @Author 陈德元
 * @data: 2017-08-04
 * @version: 1.0
 */
@RestController
public class HelloController {
    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() throws Exception {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("service-admin");
        requestDispatcher.forward(ctx.getRequest(),ctx.getResponse());
        request.getCookies();
        System.out.println(request.getCookies());
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();


      //  logger.info("/hello, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        return "Hello World";
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        logger.info("/hello1, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        return "Hello " + name;
    }
}
