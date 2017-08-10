package cn.chen.api.gateway;

import cn.chen.common.util.StatusCodeUtil;
import com.netflix.zuul.FilterProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * <p>Tiltle: com.chen.apigataway </p>
 * <p>Description: api网关 </p>
 *
 * @Author 陈德元
 * @data: 2017-08-03
 * @version: 1.0
 */
//@EnableZuulProxy注解开启Zuul
@EnableZuulProxy
@SpringCloudApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        FilterProcessor.setProcessor(new DidiFilterProcessor());
        new SpringApplicationBuilder(ApiGatewayApplication.class).web(true).run(args);
    }

    @Bean
    public DefaultErrorAttributes errorAttributes() {
        return new DidiErrorAttributes();
    }

    /**
     * 如果在拦截器上面添加@Component注解则不需要进行一下方法拦截器进行实例化
     * @return
     */
    /*@Bean
    public AccessFilter accessFilter() {
        //实例化拦截信息
        return new AccessFilter();
    }*/

}
