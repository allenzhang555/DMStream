package com.team.finn.model;

import com.team.finn.utils.BaseParamsMapUtil;

import java.util.Map;

/**
 * <p>
 * <p>
 * 日期：2016/2/25
 * <p>
 * 描述信息： 参数封装类
 * <p>
 * 备注信息:
 */
public class ParamsMapUtils extends BaseParamsMapUtil {

    private static Map<String, String> mapparam;

    /**
     * 默认参数
     *
     * @return
     */
    public static Map<String, String> getDefaultParams() {
        return getParamsMap();
    }

    /**
     *
     * @param identification
     * @return
     */
    public static Map<String, String> getHomeCate(String identification) {
        mapparam = getDefaultParams();
        mapparam.put("identification", identification);
        return mapparam;
    }


}