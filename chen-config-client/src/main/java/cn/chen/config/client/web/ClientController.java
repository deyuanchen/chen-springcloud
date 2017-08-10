package cn.chen.config.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Tiltle: cn.chen.config.client.web </p>
 * <p>Description: TODO(这里来描述信息) </p>
 *
 * @Author 陈德元
 * @data: 2017-08-08
 * @version: 1.0
 */
@RefreshScope
@RestController
public class ClientController {
    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
