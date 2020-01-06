package com.ys.strategy.api;

/**
 * @Description
 * @auther wcc
 * @create 2020-01-06 21:32
 */
public enum ApiEnum {

    GS001("基础信息"),
    GS002("风险分析"),
    GS003("舆情分析"),
    GS004("关联分析"),
    ;

    String apiName;
    ApiEnum(String apiName) {
        this.apiName = apiName;
    }

    public String getApiName() {
        return apiName;
    }
}
