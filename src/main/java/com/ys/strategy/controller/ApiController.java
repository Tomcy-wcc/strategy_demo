package com.ys.strategy.controller;

import com.ys.strategy.api.ApiEnum;
import com.ys.strategy.config.HandleApiContext;
import com.ys.strategy.service.ApiHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @auther wcc
 * @create 2020-01-06 21:56
 */
@RestController
public class ApiController {

    @Autowired
    private HandleApiContext handleApiContext;

    @GetMapping("/handleApi/{api}")
    public Object handleApi(@PathVariable("api") String api){
        ApiHandle apiHandle = handleApiContext.getApiHandle(ApiEnum.valueOf(api));
        return apiHandle.handle();
    }

}
