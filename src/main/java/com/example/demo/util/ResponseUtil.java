package com.example.demo.util;

import com.example.demo.viewobject.Response;

/**
 * @Author: zhouyh
 * @Date: 2018-03-25 17:27
 * @Description:
 */
public class ResponseUtil {
    public static Response success(Object result){
        Response response=new Response();
        response.setCode(0);
        response.setMessage("成功");
        response.setData(result);
        return response;
    }

    public static Response success(){
        return success(null);
    }

    public static Response fail(Integer errorCode,String message){
        Response response = new Response();
        response.setMessage(message);
        response.setCode(errorCode);
        return response;
    }

}
