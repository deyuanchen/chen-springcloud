package cn.chen.api.gateway.filter.pre;

import cn.chen.common.util.StatusCodeUtil;
import com.netflix.eureka.util.StatusUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.codehaus.jackson.JsonEncoding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * <p>Tiltle: com.chen.apigataway.filter.pre </p>
 * <p>Description: 异常信息拦截 </p>
 *
 * @Author 陈德元
 * @data: 2017-08-04
 * @version: 1.0
 */
@Component
public class ThrowExceptionFilter extends ZuulFilter  {


    private static Logger log = LoggerFactory.getLogger(ThrowExceptionFilter.class);

    /**
     * 拦截的类型
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 拦截的循序  0表示最大
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否执行run方法
     * true表示执行
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        try {
        log.info("This is a pre filter, it will throw a RuntimeException");

        HttpServletRequest request = ctx.getRequest();

        Cookie[] cookies = request.getCookies();
        

            // doSomething();
        } catch (Exception e) {
            ctx.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            ctx.set("error.exception", e);
//            ctx.set("error.message", "有一些错误发生");
        }
        return null;
    }

    private void doSomething() {
        throw new RuntimeException("Exist some errors...");
    }

}
