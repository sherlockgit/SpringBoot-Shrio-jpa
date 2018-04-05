package com.sherlock.premssion.utils;

import com.sherlock.premssion.vo.Rvo;

/**
 * 对象模型工具类
 * author: 小宇宙
 * date: 2018/4/5
 */
public class R {

    public static Rvo success(Object object){
        Rvo rvo = new Rvo();
        rvo.setCode(0);
        rvo.setMsg(null);
        rvo.setData(object);
        return rvo;
    }

    public static Rvo success(){
        return success(null);
    }

    public static Rvo error(Integer code,String msg){
        Rvo rvo = new Rvo();
        rvo.setCode(code);
        rvo.setMsg(msg);
        return rvo;
    }
}
