package cn.chen.hello.cn.chen.hello.hystrix;

import cn.chen.hello.HelloService;

/**
 * <p>Tiltle: cn.chen.HelloService.cn.chen.HelloService.hystrix </p>
 * <p>Description: TODO(这里来描述信息) </p>
 *
 * @Author 陈德元
 * @data: 2017-08-10
 * @version: 1.0
 */
public class helloHystrix implements HelloService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
