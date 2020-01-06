package com.ys.strategy.config;

import com.ys.strategy.api.ApiEnum;
import com.ys.strategy.service.ApiHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description
 * @auther wcc
 * @create 2020-01-06 21:42
 */
@Component
public class HandleApiContext {

    @Autowired
    private ApplicationContext applicationContext;

    public static Map<ApiEnum, Class<ApiHandle>> apiHandleStrategyBeanMap = new ConcurrentHashMap<>();

    public ApiHandle getApiHandle(ApiEnum apiEnum) {
        Class<ApiHandle> apiHandleClass = apiHandleStrategyBeanMap.get(apiEnum);
        if (apiHandleClass == null)
            throw new IllegalArgumentException("没有对应的Api处理器");
        return applicationContext.getBean(apiHandleClass);
    }

}
