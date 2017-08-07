package com.chen.servicefeign.web;

import com.chen.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Tiltle: com.chen.servicefeign.web </p>
 * <p>Description: 负载均衡控制类对应的方法 </p>
 *
 * @Author 陈德元
 * @data: 2017-08-07
 * @version: 1.0
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    /**
     * /hi 这个链接参数要与service-hello中的参数链接相对应
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
