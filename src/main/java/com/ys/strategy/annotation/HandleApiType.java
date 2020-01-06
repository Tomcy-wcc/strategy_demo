package com.ys.strategy.annotation;

import com.ys.strategy.api.ApiEnum;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HandleApiType {

    ApiEnum value();

}
