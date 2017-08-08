package cn.chen.api.gateway;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.web.context.request.RequestAttributes;

import java.util.Map;

/**
 * <p>Tiltle:  </p>
 * <p>Description: 异常信息拦截 </p>
 *
 * @Author 陈德元
 * @data: 2017-08-04
 * @version: 1.0
 */
public class DidiErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes (
            RequestAttributes requestAttributes, boolean includeStackTrace){
        Map<String, Object> result = super.getErrorAttributes(requestAttributes, includeStackTrace);
        result.remove("exception");
        return result;
    }

}
