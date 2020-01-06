package com.ys.strategy.service;

import com.ys.strategy.annotation.HandleApiType;
import com.ys.strategy.api.ApiEnum;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @auther wcc
 * @create 2020-01-06 22:20
 */
@Service
@HandleApiType(ApiEnum.GS003)
class GS003ApiHandle implements ApiHandle {
    @Override
    public Object handle() {
        return ApiEnum.GS003.getApiName();
    }
}
