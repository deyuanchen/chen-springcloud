package cn.chen.api.gateway.filter.post;

import com.netflix.zuul.ZuulFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * <p>Tiltle: com.chen.apigataway.filter.post </p>
 * <p>Description: TODO(这里来描述信息) </p>
 *
 * @Author 陈德元
 * @data: 2017-08-04
 * @version: 1.0
 */
@Component
public class ThrowExceptionPostFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(ThrowExceptionPostFilter.class);

    @Override
    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        log.info("This is a post filter, it will throw a RuntimeException");
       // doSomething();
        return null;
    }

    private void doSomething() {
        throw new RuntimeException("Exist some errors...");
    }

}
