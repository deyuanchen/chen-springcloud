package cn.chen.common.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * <p>Tiltle: cn.chen.common.util </p>
 * <p>Description: 状态码信息工具 </p>
 *
 * @Author 陈德元
 * @data: 2017-08-09
 * @version: 1.0
 */
@Component
public class StatusCodeUtil {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Value("${statecode}")
    private String name;
}
