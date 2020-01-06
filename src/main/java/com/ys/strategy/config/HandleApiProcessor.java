package com.ys.strategy.config;

import com.ys.strategy.annotation.HandleApiType;
import com.ys.strategy.api.ApiEnum;
import com.ys.strategy.service.ApiHandle;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Description
 * @auther wcc
 * @create 2020-01-06 21:49
 */
@Component
public class HandleApiProcessor implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, Object> beansWithAnnotation = applicationContext.getBeansWithAnnotation(HandleApiType.class);
        beansWithAnnotation.forEach((k, v) -> {
            Class<ApiHandle> apiHandleClass = (Class<ApiHandle>) v.getClass();
            ApiEnum value = apiHandleClass.getAnnotation(HandleApiType.class).value();
            HandleApiContext.apiHandleStrategyBeanMap.put(value, apiHandleClass);
        });
    }
}
