package com.carl_yang.excellib;

import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by carl_yang on 2017/5/24.
 */

public abstract class JsonHelper<T> {
    private Class<T> entityClass;

    @SuppressWarnings("unchecked")
    public JsonHelper(){
        Type genType = this.getClass().getGenericSuperclass();
        entityClass = (Class<T>)((ParameterizedType)genType).getActualTypeArguments()[0];
    }

    public JsonHelper<T> doBus(String jsonDatas){
        T bean =new Gson().fromJson(jsonDatas, entityClass);
        success(bean);
//        // android从服务器获取数据
//        new Thread(new Runnable(){
//            @Override
//            public void run(){
//                String jsonDatas = "{\"userName\":\"小明\"}";
//                T bean =new Gson().fromJson(jsonDatas, entityClass);
//                success(bean);
//            }
//        }).start();
        return this;
    }

    public abstract void success(T bean);

}
