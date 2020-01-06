package com.ys.strategy.service;

import com.ys.strategy.annotation.HandleApiType;
import com.ys.strategy.api.ApiEnum;
import org.springframework.stereotype.Service;

@Service
@HandleApiType(ApiEnum.GS004)
class GS004ApiHandle implements ApiHandle {
    @Override
    public Object handle() {
        return ApiEnum.GS004.getApiName();
    }
}