package com.sherlock.premssion.utils;

import com.sherlock.premssion.exception.SystemException;
import org.apache.commons.lang3.StringUtils;

/**
 * 数据校验工具类
 * author: 小宇宙
 * date: 2018/4/7
 */
public class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new SystemException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new SystemException(message);
        }
    }
}
