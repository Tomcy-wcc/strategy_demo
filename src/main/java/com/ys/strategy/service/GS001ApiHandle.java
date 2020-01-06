package com.ys.strategy.service;

import com.ys.strategy.annotation.HandleApiType;
import com.ys.strategy.api.ApiEnum;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @auther wcc
 * @create 2020-01-06 21:36
 */
@Service
@HandleApiType(ApiEnum.GS001)
class GS001ApiHandle implements ApiHandle {
    @Override
    public Object handle() {
        return ApiEnum.GS001.getApiName();
    }
}
